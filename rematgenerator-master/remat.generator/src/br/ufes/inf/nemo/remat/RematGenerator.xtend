package br.ufes.inf.nemo.remat

import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import frameweb.FramewebPackage
import java.util.Map
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
//import frameweb.impl.DomainClassImpl
import frameweb.impl.EntityModelImpl

class RematGenerator implements IGenerator {
	
	ResourceSet rs
   Resource r
	Map<String, Object> m
	
	 Resource.Factory.Registry reg
	 EntityModelImpl model
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		for (EObject o : input.contents) {
			//o.compile(fsa)
		}
	}
//
//	def dispatch void compile(DomainClassImpl e, IFileSystemAccess fsa) {
//		st ="";
//		for (c : e.ownedAttributes) {
//			e.compile(fsa)
//		}
//	}
//	
//
//	def compile(PropertyImpl e, IFileSystemAccess fsa) {
//		fsa.generateFile(e.name + ".txt", '''
//			this is element «e.name»
//		''')
//	}

//	def dispatch void compile(EObject m, IFileSystemAccess fsa) {}

	def public List<EObject> generateCode(String path,List<String> parameters) {

		val message = "code generate OK";
		
	
 // Initialize the model
	       FramewebPackage.eINSTANCE.eClass();

	        // Register the XMI resource factory for the .website extension

	       reg = Resource.Factory.Registry.INSTANCE;
	        m = reg.getExtensionToFactoryMap();
	        m.put("frameweb", new XMIResourceFactoryImpl());

	        // Obtain a new resource set
	       rs = new ResourceSetImpl();

	        // Get the resource
	        r = rs.getResource(URI.createURI(path), true);
	      
		
		for (EObject o : r.contents) {
			
			System::out.println(o.toString)
		}
					 
		System::out.println(message + parameters)
		
		return r.contents

	}
}
