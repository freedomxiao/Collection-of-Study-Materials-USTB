
package org.xtext.test.minijava.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import org.xtext.test.minijava.minijava.ClassDeclaration
//import org.xtext.test.minijava.minijava.VarDeclaration
import org.xtext.test.minijava.minijava.MainClass
import org.xtext.test.minijava.minijava.Expression
import org.xtext.test.minijava.minijava.Expr

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MinijavaGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))

        fsa.generateFile("AllTheStates.java", '''
        	«FOR Mainclass : resource.allContents.filter(MainClass).toIterable»	
        		public Class «Mainclass.name» {
        			public static void main(String args[]){
        				«FOR VarDeclaration : Mainclass.varDeclarations»
	                	«VarDeclaration.variable.variableType.typeName» «VarDeclaration.variable.name» ;
	                	«ENDFOR»
	                	«FOR MethodDeclaration : Mainclass.methodDeclarations»
	                	    public «MethodDeclaration.methodType.typeName» «MethodDeclaration.name» («MethodDeclaration.varList»){
	                	    	«FOR VarDeclaration : MethodDeclaration.localVarDeclarations»
	                	    	«VarDeclaration.variable.variableType.typeName» «VarDeclaration.variable.name» ;
	                	    	«ENDFOR»
	                	    	«FOR Statement : MethodDeclaration.statements»
	                	    	«Statement.variable.name» «Statement.statementType» «Statement.firstExpression»
	                	    	«ENDFOR»
	                	    	return «MethodDeclaration.returnExpression»
	                	    }
	                	«ENDFOR»
        			}
        		}
        		«ENDFOR»
            «FOR ClassDeclaration : resource.allContents.filter(ClassDeclaration).toIterable»
                Class «ClassDeclaration.name» {
                	«FOR VarDeclaration : ClassDeclaration.varDeclarations»
                	«VarDeclaration.variable.variableType.typeName» «VarDeclaration.variable.name» ;
                	«ENDFOR»
                	«FOR MethodDeclaration : ClassDeclaration.methodDeclarations»
                	    public «MethodDeclaration.methodType.typeName» «MethodDeclaration.name» («MethodDeclaration.varList»){
                	    	«FOR VarDeclaration : MethodDeclaration.localVarDeclarations»
                	    	«VarDeclaration.variable.variableType.typeName» «VarDeclaration.variable.name» ;
                	    	«ENDFOR»
                	    	«FOR Statement : MethodDeclaration.statements»
                	    	«Statement.variable.name» «Statement.statementType» «asString(Statement.firstExpression)» ;
                	    	«ENDFOR»
                	    	return «ReturnasString(MethodDeclaration.returnExpression)»;
                	    }
                	«ENDFOR»
                }
            «ENDFOR»
        ''')

		
		
	}
	def asString(Expr expression) {
  		return String.valueOf(expression.addition.multiplication.negationOrPointExpression.point.squareBrackets.primary.number.value)
	}
	def ReturnasString(Expr expression) {
  		return String.valueOf(expression.addition.multiplication.negationOrPointExpression.point.squareBrackets.primary.variable.name)
	}
}
