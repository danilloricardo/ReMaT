package br.ufes.inf.nemo.remat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import frameweb.FramewebModel;
import frameweb.FramewebPackage;
import frameweb.impl.DomainClassImpl;
import frameweb.impl.EntityModelImpl;
import frameweb.impl.FramewebModelImpl;

public class Application {

	/**
	 * 
	 * @param args
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<String> parameters = new ArrayList<String>();
		Application ap = new Application();

		ap.upload();
		parameters.add(JOptionPane.showInputDialog("Driver of database?"));
		parameters.add(JOptionPane.showInputDialog("Link of database?"));
		parameters.add(JOptionPane.showInputDialog("user of database?"));
		parameters.add(JOptionPane.showInputDialog("password's user of database?"));

		// JOptionPane.showMessageDialog(null, "Você não respondeu a
		// pergunta.");

		// JOptionPane.showMessageDialog(null, "Seu nome é " + nome);

		List<EObject> lista = new ArrayList<EObject>();
		lista = new RematGenerator().generateCode("/home/danillo/runtime-EclipseApplication/escola/model/My.frameweb",
				parameters);
		ap.codeGenerator(lista, parameters);
	}

	public void upload() {
		String pasta = System.getProperty("user.dir") + "/model/";
		String nome = "My.frameweb";
		File novoArquivo = new File(pasta + nome);
		FileOutputStream saida = null;
		try {
			saida = new FileOutputStream(novoArquivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream arquivoCarregado = null;
		try {
			arquivoCarregado = new FileInputStream("/home/danillo/runtime-EclipseApplication/escola/model/My.frameweb");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		copiar(arquivoCarregado, saida);
	}

	private void copiar(InputStream origem, OutputStream destino) {
		int bite = 0;
		byte[] tamanhoMaximo = new byte[1024 * 800]; // 800KB
		try {
			// enquanto bytes forem sendo lidos
			while ((bite = origem.read(tamanhoMaximo)) >= 0) {
				// pegue o byte lido e escreva no destino
				destino.write(tamanhoMaximo, 0, bite);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "unchecked", "null", "restriction" })
	public void codeGenerator(List<EObject> listModel, ArrayList<String> parameters) {

		ArrayList<EntityModelImpl> models = new ArrayList<EntityModelImpl>();
		models.addAll((Collection<? extends EntityModelImpl>) listModel);
		String doc = new String();

		for (int i = 0; i < models.size(); i++) {
			doc = "@prefix map: <" + System.getProperty("user.dir") + "/mapping-"
					+ models.get(i).getName().toLowerCase() + ".ttl" + "#> .\n" 
					+ "@prefix "
					+ models.get(i).getName().toLowerCase() + ": <"
					+ JOptionPane.showInputDialog("URL of vocabulary of your model?") + "> .\n"
					+ "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
					+ "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
					+ "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
					+ "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
					+ "@prefix d2rq: <http://www.wiwiss.fu-berlin.de/suhl/bizer/D2RQ/0.1#> .\n"
					+ "@prefix dc: <http://purl.org/dc/elements/1.1/> .\n"
					+ "@prefix dcterms: <http://purl.org/dc/terms/> .\n" + "@prefix foaf: <http://xmlns.com/foaf/0.1/> .\n"
					+ "@prefix skos: <http://www.w3.org/2004/02/skos/core#> .\n"
					+ "@prefix iswc: <http://annotation.semanticweb.org/iswc/iswc.daml#> .\n"
					+ "@prefix vcard: <http://www.w3.org/2001/vcard-rdf/3.0#> .\n"
					+ "@prefix jdbc: <http://d2rq.org/terms/jdbc/> .\n"

					+ "map:database a d2rq:Database;\n" + " d2rq:jdbcDSN " + "\"" + parameters.get(1) + "\";\n"
					+ " d2rq:jdbcDriver " + "\"" + parameters.get(0) + "\";\n" + " d2rq:username " + "\""
					+ parameters.get(2) + "\";\n" + " d2rq:password " + "\"" + parameters.get(3) + "\";\n" + ".\n\n"

					+ "# Tables";
			for (int j = 0; j < models.get(i).getPackagedElements().size(); j++) {
				if (models.get(i).getPackagedElements().get(j) instanceof DomainClassImpl) {
					codeGeneratorClass((DomainClassImpl) models.get(i).getPackagedElements().get(j), doc);
				}
			}
			System.out.println(doc);

		}

	}

	public void codeGeneratorClass(DomainClassImpl domainClass, String doc) {
	}

}
