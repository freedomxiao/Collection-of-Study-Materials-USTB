package org.xtext.test.minijava.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.test.minijava.services.MinijavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMinijavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "','", "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'}'", "'extends'", "'implements'", "'int'", "'boolean'", "'double'", "'char'", "'protected'", "'private'", "'return'", "'if'", "'else'", "'while'", "'='", "'<'", "'+'", "'-'", "'*'", "'&&'", "'!'", "'true'", "'false'", "'this'", "'new'", "'length'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMinijavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMinijavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMinijavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMinijava.g"; }



     	private MinijavaGrammarAccess grammarAccess;

        public InternalMinijavaParser(TokenStream input, MinijavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Goal";
       	}

       	@Override
       	protected MinijavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGoal"
    // InternalMinijava.g:64:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalMinijava.g:64:45: (iv_ruleGoal= ruleGoal EOF )
            // InternalMinijava.g:65:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalMinijava.g:71:1: ruleGoal returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDecl ) )? ( (lv_importdecl_1_0= ruleImportDecl ) )* ( (lv_classDeclarations_2_0= ruleMainClass ) ) ( (lv_classDeclarations_3_0= ruleClassDeclaration ) )* ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_package_0_0 = null;

        AntlrDatatypeRuleToken lv_importdecl_1_0 = null;

        EObject lv_classDeclarations_2_0 = null;

        EObject lv_classDeclarations_3_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:77:2: ( ( ( (lv_package_0_0= rulePackageDecl ) )? ( (lv_importdecl_1_0= ruleImportDecl ) )* ( (lv_classDeclarations_2_0= ruleMainClass ) ) ( (lv_classDeclarations_3_0= ruleClassDeclaration ) )* ) )
            // InternalMinijava.g:78:2: ( ( (lv_package_0_0= rulePackageDecl ) )? ( (lv_importdecl_1_0= ruleImportDecl ) )* ( (lv_classDeclarations_2_0= ruleMainClass ) ) ( (lv_classDeclarations_3_0= ruleClassDeclaration ) )* )
            {
            // InternalMinijava.g:78:2: ( ( (lv_package_0_0= rulePackageDecl ) )? ( (lv_importdecl_1_0= ruleImportDecl ) )* ( (lv_classDeclarations_2_0= ruleMainClass ) ) ( (lv_classDeclarations_3_0= ruleClassDeclaration ) )* )
            // InternalMinijava.g:79:3: ( (lv_package_0_0= rulePackageDecl ) )? ( (lv_importdecl_1_0= ruleImportDecl ) )* ( (lv_classDeclarations_2_0= ruleMainClass ) ) ( (lv_classDeclarations_3_0= ruleClassDeclaration ) )*
            {
            // InternalMinijava.g:79:3: ( (lv_package_0_0= rulePackageDecl ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMinijava.g:80:4: (lv_package_0_0= rulePackageDecl )
                    {
                    // InternalMinijava.g:80:4: (lv_package_0_0= rulePackageDecl )
                    // InternalMinijava.g:81:5: lv_package_0_0= rulePackageDecl
                    {

                    					newCompositeNode(grammarAccess.getGoalAccess().getPackagePackageDeclParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_package_0_0=rulePackageDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGoalRule());
                    					}
                    					set(
                    						current,
                    						"package",
                    						lv_package_0_0,
                    						"org.xtext.test.minijava.Minijava.PackageDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMinijava.g:98:3: ( (lv_importdecl_1_0= ruleImportDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMinijava.g:99:4: (lv_importdecl_1_0= ruleImportDecl )
            	    {
            	    // InternalMinijava.g:99:4: (lv_importdecl_1_0= ruleImportDecl )
            	    // InternalMinijava.g:100:5: lv_importdecl_1_0= ruleImportDecl
            	    {

            	    					newCompositeNode(grammarAccess.getGoalAccess().getImportdeclImportDeclParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_importdecl_1_0=ruleImportDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGoalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"importdecl",
            	    						lv_importdecl_1_0,
            	    						"org.xtext.test.minijava.Minijava.ImportDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMinijava.g:117:3: ( (lv_classDeclarations_2_0= ruleMainClass ) )
            // InternalMinijava.g:118:4: (lv_classDeclarations_2_0= ruleMainClass )
            {
            // InternalMinijava.g:118:4: (lv_classDeclarations_2_0= ruleMainClass )
            // InternalMinijava.g:119:5: lv_classDeclarations_2_0= ruleMainClass
            {

            					newCompositeNode(grammarAccess.getGoalAccess().getClassDeclarationsMainClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_classDeclarations_2_0=ruleMainClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoalRule());
            					}
            					add(
            						current,
            						"classDeclarations",
            						lv_classDeclarations_2_0,
            						"org.xtext.test.minijava.Minijava.MainClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:136:3: ( (lv_classDeclarations_3_0= ruleClassDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMinijava.g:137:4: (lv_classDeclarations_3_0= ruleClassDeclaration )
            	    {
            	    // InternalMinijava.g:137:4: (lv_classDeclarations_3_0= ruleClassDeclaration )
            	    // InternalMinijava.g:138:5: lv_classDeclarations_3_0= ruleClassDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getGoalAccess().getClassDeclarationsClassDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_classDeclarations_3_0=ruleClassDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGoalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classDeclarations",
            	    						lv_classDeclarations_3_0,
            	    						"org.xtext.test.minijava.Minijava.ClassDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRulePackageDecl"
    // InternalMinijava.g:159:1: entryRulePackageDecl returns [String current=null] : iv_rulePackageDecl= rulePackageDecl EOF ;
    public final String entryRulePackageDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageDecl = null;


        try {
            // InternalMinijava.g:159:51: (iv_rulePackageDecl= rulePackageDecl EOF )
            // InternalMinijava.g:160:2: iv_rulePackageDecl= rulePackageDecl EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDecl=rulePackageDecl();

            state._fsp--;

             current =iv_rulePackageDecl.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDecl"


    // $ANTLR start "rulePackageDecl"
    // InternalMinijava.g:166:1: rulePackageDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_QualifiedName_1= ruleQualifiedName kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulePackageDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;



        	enterRule();

        try {
            // InternalMinijava.g:172:2: ( (kw= 'package' this_QualifiedName_1= ruleQualifiedName kw= ';' ) )
            // InternalMinijava.g:173:2: (kw= 'package' this_QualifiedName_1= ruleQualifiedName kw= ';' )
            {
            // InternalMinijava.g:173:2: (kw= 'package' this_QualifiedName_1= ruleQualifiedName kw= ';' )
            // InternalMinijava.g:174:3: kw= 'package' this_QualifiedName_1= ruleQualifiedName kw= ';'
            {
            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPackageDeclAccess().getPackageKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPackageDeclAccess().getQualifiedNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,12,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPackageDeclAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDecl"


    // $ANTLR start "entryRuleImportDecl"
    // InternalMinijava.g:198:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalMinijava.g:198:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalMinijava.g:199:2: iv_ruleImportDecl= ruleImportDecl EOF
            {
             newCompositeNode(grammarAccess.getImportDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportDecl=ruleImportDecl();

            state._fsp--;

             current =iv_ruleImportDecl.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDecl"


    // $ANTLR start "ruleImportDecl"
    // InternalMinijava.g:205:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' this_QualifiedName_1= ruleQualifiedName kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;



        	enterRule();

        try {
            // InternalMinijava.g:211:2: ( (kw= 'import' this_QualifiedName_1= ruleQualifiedName kw= ';' ) )
            // InternalMinijava.g:212:2: (kw= 'import' this_QualifiedName_1= ruleQualifiedName kw= ';' )
            {
            // InternalMinijava.g:212:2: (kw= 'import' this_QualifiedName_1= ruleQualifiedName kw= ';' )
            // InternalMinijava.g:213:3: kw= 'import' this_QualifiedName_1= ruleQualifiedName kw= ';'
            {
            kw=(Token)match(input,13,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportDeclAccess().getImportKeyword_0());
            		

            			newCompositeNode(grammarAccess.getImportDeclAccess().getQualifiedNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,12,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportDeclAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDecl"


    // $ANTLR start "entryRuleQualifiedName_"
    // InternalMinijava.g:237:1: entryRuleQualifiedName_ returns [String current=null] : iv_ruleQualifiedName_= ruleQualifiedName_ EOF ;
    public final String entryRuleQualifiedName_() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName_ = null;


        try {
            // InternalMinijava.g:237:54: (iv_ruleQualifiedName_= ruleQualifiedName_ EOF )
            // InternalMinijava.g:238:2: iv_ruleQualifiedName_= ruleQualifiedName_ EOF
            {
             newCompositeNode(grammarAccess.getQualifiedName_Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName_=ruleQualifiedName_();

            state._fsp--;

             current =iv_ruleQualifiedName_.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName_"


    // $ANTLR start "ruleQualifiedName_"
    // InternalMinijava.g:244:1: ruleQualifiedName_ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID this_QualifiedName__2= ruleQualifiedName_ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName_() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_QualifiedName__2 = null;



        	enterRule();

        try {
            // InternalMinijava.g:250:2: ( (kw= '.' this_ID_1= RULE_ID this_QualifiedName__2= ruleQualifiedName_ ) )
            // InternalMinijava.g:251:2: (kw= '.' this_ID_1= RULE_ID this_QualifiedName__2= ruleQualifiedName_ )
            {
            // InternalMinijava.g:251:2: (kw= '.' this_ID_1= RULE_ID this_QualifiedName__2= ruleQualifiedName_ )
            // InternalMinijava.g:252:3: kw= '.' this_ID_1= RULE_ID this_QualifiedName__2= ruleQualifiedName_
            {
            kw=(Token)match(input,14,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualifiedName_Access().getFullStopKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getQualifiedName_Access().getIDTerminalRuleCall_1());
            		

            			newCompositeNode(grammarAccess.getQualifiedName_Access().getQualifiedName_ParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_QualifiedName__2=ruleQualifiedName_();

            state._fsp--;


            			current.merge(this_QualifiedName__2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName_"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMinijava.g:278:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMinijava.g:278:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMinijava.g:279:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMinijava.g:285:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_QualifiedName__1= ruleQualifiedName_ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_QualifiedName__1 = null;



        	enterRule();

        try {
            // InternalMinijava.g:291:2: ( (this_ID_0= RULE_ID this_QualifiedName__1= ruleQualifiedName_ ) )
            // InternalMinijava.g:292:2: (this_ID_0= RULE_ID this_QualifiedName__1= ruleQualifiedName_ )
            {
            // InternalMinijava.g:292:2: (this_ID_0= RULE_ID this_QualifiedName__1= ruleQualifiedName_ )
            // InternalMinijava.g:293:3: this_ID_0= RULE_ID this_QualifiedName__1= ruleQualifiedName_
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualifiedName_ParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_QualifiedName__1=ruleQualifiedName_();

            state._fsp--;


            			current.merge(this_QualifiedName__1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameList"
    // InternalMinijava.g:314:1: entryRuleQualifiedNameList returns [EObject current=null] : iv_ruleQualifiedNameList= ruleQualifiedNameList EOF ;
    public final EObject entryRuleQualifiedNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameList = null;


        try {
            // InternalMinijava.g:314:58: (iv_ruleQualifiedNameList= ruleQualifiedNameList EOF )
            // InternalMinijava.g:315:2: iv_ruleQualifiedNameList= ruleQualifiedNameList EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameList=ruleQualifiedNameList();

            state._fsp--;

             current =iv_ruleQualifiedNameList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameList"


    // $ANTLR start "ruleQualifiedNameList"
    // InternalMinijava.g:321:1: ruleQualifiedNameList returns [EObject current=null] : ( ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi ) )? ) ;
    public final EObject ruleQualifiedNameList() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_qualifiedName_0_0 = null;

        EObject lv_qualifiedNameLi_1_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:327:2: ( ( ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi ) )? ) )
            // InternalMinijava.g:328:2: ( ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi ) )? )
            {
            // InternalMinijava.g:328:2: ( ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi ) )? )
            // InternalMinijava.g:329:3: ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi ) )?
            {
            // InternalMinijava.g:329:3: ( (lv_qualifiedName_0_0= ruleQualifiedName ) )
            // InternalMinijava.g:330:4: (lv_qualifiedName_0_0= ruleQualifiedName )
            {
            // InternalMinijava.g:330:4: (lv_qualifiedName_0_0= ruleQualifiedName )
            // InternalMinijava.g:331:5: lv_qualifiedName_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getQualifiedNameListAccess().getQualifiedNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_qualifiedName_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedNameListRule());
            					}
            					set(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_0_0,
            						"org.xtext.test.minijava.Minijava.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:348:3: ( (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMinijava.g:349:4: (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi )
                    {
                    // InternalMinijava.g:349:4: (lv_qualifiedNameLi_1_0= ruleQualifiedNameLi )
                    // InternalMinijava.g:350:5: lv_qualifiedNameLi_1_0= ruleQualifiedNameLi
                    {

                    					newCompositeNode(grammarAccess.getQualifiedNameListAccess().getQualifiedNameLiQualifiedNameLiParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qualifiedNameLi_1_0=ruleQualifiedNameLi();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQualifiedNameListRule());
                    					}
                    					set(
                    						current,
                    						"qualifiedNameLi",
                    						lv_qualifiedNameLi_1_0,
                    						"org.xtext.test.minijava.Minijava.QualifiedNameLi");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameList"


    // $ANTLR start "entryRuleQualifiedNameLi"
    // InternalMinijava.g:371:1: entryRuleQualifiedNameLi returns [EObject current=null] : iv_ruleQualifiedNameLi= ruleQualifiedNameLi EOF ;
    public final EObject entryRuleQualifiedNameLi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameLi = null;


        try {
            // InternalMinijava.g:371:56: (iv_ruleQualifiedNameLi= ruleQualifiedNameLi EOF )
            // InternalMinijava.g:372:2: iv_ruleQualifiedNameLi= ruleQualifiedNameLi EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameLiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameLi=ruleQualifiedNameLi();

            state._fsp--;

             current =iv_ruleQualifiedNameLi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameLi"


    // $ANTLR start "ruleQualifiedNameLi"
    // InternalMinijava.g:378:1: ruleQualifiedNameLi returns [EObject current=null] : (otherlv_0= ',' ( (lv_qualifiedName_1_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi ) ) ) ;
    public final EObject ruleQualifiedNameLi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_qualifiedName_1_0 = null;

        EObject lv_qualifiedNameLi_2_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:384:2: ( (otherlv_0= ',' ( (lv_qualifiedName_1_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi ) ) ) )
            // InternalMinijava.g:385:2: (otherlv_0= ',' ( (lv_qualifiedName_1_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi ) ) )
            {
            // InternalMinijava.g:385:2: (otherlv_0= ',' ( (lv_qualifiedName_1_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi ) ) )
            // InternalMinijava.g:386:3: otherlv_0= ',' ( (lv_qualifiedName_1_0= ruleQualifiedName ) ) ( (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedNameLiAccess().getCommaKeyword_0());
            		
            // InternalMinijava.g:390:3: ( (lv_qualifiedName_1_0= ruleQualifiedName ) )
            // InternalMinijava.g:391:4: (lv_qualifiedName_1_0= ruleQualifiedName )
            {
            // InternalMinijava.g:391:4: (lv_qualifiedName_1_0= ruleQualifiedName )
            // InternalMinijava.g:392:5: lv_qualifiedName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_qualifiedName_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedNameLiRule());
            					}
            					set(
            						current,
            						"qualifiedName",
            						lv_qualifiedName_1_0,
            						"org.xtext.test.minijava.Minijava.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:409:3: ( (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi ) )
            // InternalMinijava.g:410:4: (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi )
            {
            // InternalMinijava.g:410:4: (lv_qualifiedNameLi_2_0= ruleQualifiedNameLi )
            // InternalMinijava.g:411:5: lv_qualifiedNameLi_2_0= ruleQualifiedNameLi
            {

            					newCompositeNode(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameLiQualifiedNameLiParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_qualifiedNameLi_2_0=ruleQualifiedNameLi();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedNameLiRule());
            					}
            					set(
            						current,
            						"qualifiedNameLi",
            						lv_qualifiedNameLi_2_0,
            						"org.xtext.test.minijava.Minijava.QualifiedNameLi");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameLi"


    // $ANTLR start "entryRuleMainClass"
    // InternalMinijava.g:432:1: entryRuleMainClass returns [EObject current=null] : iv_ruleMainClass= ruleMainClass EOF ;
    public final EObject entryRuleMainClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainClass = null;


        try {
            // InternalMinijava.g:432:50: (iv_ruleMainClass= ruleMainClass EOF )
            // InternalMinijava.g:433:2: iv_ruleMainClass= ruleMainClass EOF
            {
             newCompositeNode(grammarAccess.getMainClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainClass=ruleMainClass();

            state._fsp--;

             current =iv_ruleMainClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainClass"


    // $ANTLR start "ruleMainClass"
    // InternalMinijava.g:439:1: ruleMainClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( ( (lv_varDeclarations_14_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) ) | ( (lv_statement_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' ) ;
    public final EObject ruleMainClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_ID_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_varDeclarations_14_0 = null;

        EObject lv_methodDeclarations_15_0 = null;

        EObject lv_statement_16_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:445:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( ( (lv_varDeclarations_14_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) ) | ( (lv_statement_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' ) )
            // InternalMinijava.g:446:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( ( (lv_varDeclarations_14_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) ) | ( (lv_statement_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' )
            {
            // InternalMinijava.g:446:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( ( (lv_varDeclarations_14_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) ) | ( (lv_statement_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' )
            // InternalMinijava.g:447:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( ( (lv_varDeclarations_14_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) ) | ( (lv_statement_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMainClassAccess().getClassKeyword_0());
            		
            // InternalMinijava.g:451:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMinijava.g:452:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMinijava.g:452:4: (lv_name_1_0= RULE_ID )
            // InternalMinijava.g:453:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMainClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMainClassAccess().getPublicKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getMainClassAccess().getStaticKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getMainClassAccess().getVoidKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getMainClassAccess().getMainKeyword_6());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getMainClassAccess().getLeftParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getMainClassAccess().getStringKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getMainClassAccess().getLeftSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getMainClassAccess().getRightSquareBracketKeyword_10());
            		
            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_19); 

            			newLeafNode(this_ID_11, grammarAccess.getMainClassAccess().getIDTerminalRuleCall_11());
            		
            otherlv_12=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getMainClassAccess().getRightParenthesisKeyword_12());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalMinijava.g:517:3: ( ( (lv_varDeclarations_14_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) ) | ( (lv_statement_16_0= ruleStatement ) ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 22:
                case 30:
                case 31:
                case 32:
                case 33:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (LA5_3==14) ) {
                        alt5=1;
                    }
                    else if ( (LA5_3==24||LA5_3==40) ) {
                        alt5=3;
                    }


                    }
                    break;
                case 18:
                case 34:
                case 35:
                    {
                    alt5=2;
                    }
                    break;
                case 17:
                case 37:
                case 39:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalMinijava.g:518:4: ( (lv_varDeclarations_14_0= ruleVarDeclaration ) )
            	    {
            	    // InternalMinijava.g:518:4: ( (lv_varDeclarations_14_0= ruleVarDeclaration ) )
            	    // InternalMinijava.g:519:5: (lv_varDeclarations_14_0= ruleVarDeclaration )
            	    {
            	    // InternalMinijava.g:519:5: (lv_varDeclarations_14_0= ruleVarDeclaration )
            	    // InternalMinijava.g:520:6: lv_varDeclarations_14_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getMainClassAccess().getVarDeclarationsVarDeclarationParserRuleCall_14_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_varDeclarations_14_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDeclarations",
            	    							lv_varDeclarations_14_0,
            	    							"org.xtext.test.minijava.Minijava.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMinijava.g:538:4: ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) )
            	    {
            	    // InternalMinijava.g:538:4: ( (lv_methodDeclarations_15_0= ruleMethodDeclaration ) )
            	    // InternalMinijava.g:539:5: (lv_methodDeclarations_15_0= ruleMethodDeclaration )
            	    {
            	    // InternalMinijava.g:539:5: (lv_methodDeclarations_15_0= ruleMethodDeclaration )
            	    // InternalMinijava.g:540:6: lv_methodDeclarations_15_0= ruleMethodDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getMainClassAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_methodDeclarations_15_0=ruleMethodDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methodDeclarations",
            	    							lv_methodDeclarations_15_0,
            	    							"org.xtext.test.minijava.Minijava.MethodDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMinijava.g:558:4: ( (lv_statement_16_0= ruleStatement ) )
            	    {
            	    // InternalMinijava.g:558:4: ( (lv_statement_16_0= ruleStatement ) )
            	    // InternalMinijava.g:559:5: (lv_statement_16_0= ruleStatement )
            	    {
            	    // InternalMinijava.g:559:5: (lv_statement_16_0= ruleStatement )
            	    // InternalMinijava.g:560:6: lv_statement_16_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getMainClassAccess().getStatementStatementParserRuleCall_14_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_statement_16_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainClassRule());
            	    						}
            	    						set(
            	    							current,
            	    							"statement",
            	    							lv_statement_16_0,
            	    							"org.xtext.test.minijava.Minijava.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_17=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_17, grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainClass"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalMinijava.g:590:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalMinijava.g:590:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalMinijava.g:591:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalMinijava.g:597:1: ruleClassDeclaration returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'implements' ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) ) )? otherlv_6= '{' ( ( (lv_varDeclarations_7_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_qualifiedNameList_5_0 = null;

        EObject lv_varDeclarations_7_0 = null;

        EObject lv_methodDeclarations_8_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:603:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'implements' ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) ) )? otherlv_6= '{' ( ( (lv_varDeclarations_7_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) ) )* otherlv_9= '}' ) )
            // InternalMinijava.g:604:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'implements' ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) ) )? otherlv_6= '{' ( ( (lv_varDeclarations_7_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) ) )* otherlv_9= '}' )
            {
            // InternalMinijava.g:604:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'implements' ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) ) )? otherlv_6= '{' ( ( (lv_varDeclarations_7_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) ) )* otherlv_9= '}' )
            // InternalMinijava.g:605:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'implements' ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) ) )? otherlv_6= '{' ( ( (lv_varDeclarations_7_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassDeclarationAccess().getClassKeyword_0());
            		
            // InternalMinijava.g:609:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMinijava.g:610:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMinijava.g:610:4: (lv_name_1_0= RULE_ID )
            // InternalMinijava.g:611:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMinijava.g:627:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMinijava.g:628:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMinijava.g:632:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMinijava.g:633:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMinijava.g:633:5: (otherlv_3= RULE_ID )
                    // InternalMinijava.g:634:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDeclarationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getQualifiedNameClassDeclarationCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMinijava.g:646:3: (otherlv_4= 'implements' ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMinijava.g:647:4: otherlv_4= 'implements' ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getImplementsKeyword_3_0());
                    			
                    // InternalMinijava.g:651:4: ( (lv_qualifiedNameList_5_0= ruleQualifiedNameList ) )
                    // InternalMinijava.g:652:5: (lv_qualifiedNameList_5_0= ruleQualifiedNameList )
                    {
                    // InternalMinijava.g:652:5: (lv_qualifiedNameList_5_0= ruleQualifiedNameList )
                    // InternalMinijava.g:653:6: lv_qualifiedNameList_5_0= ruleQualifiedNameList
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getQualifiedNameListQualifiedNameListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_qualifiedNameList_5_0=ruleQualifiedNameList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"qualifiedNameList",
                    							lv_qualifiedNameList_5_0,
                    							"org.xtext.test.minijava.Minijava.QualifiedNameList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMinijava.g:675:3: ( ( (lv_varDeclarations_7_0= ruleVarDeclaration ) ) | ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==22||(LA8_0>=30 && LA8_0<=33)) ) {
                    alt8=1;
                }
                else if ( (LA8_0==18||(LA8_0>=34 && LA8_0<=35)) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMinijava.g:676:4: ( (lv_varDeclarations_7_0= ruleVarDeclaration ) )
            	    {
            	    // InternalMinijava.g:676:4: ( (lv_varDeclarations_7_0= ruleVarDeclaration ) )
            	    // InternalMinijava.g:677:5: (lv_varDeclarations_7_0= ruleVarDeclaration )
            	    {
            	    // InternalMinijava.g:677:5: (lv_varDeclarations_7_0= ruleVarDeclaration )
            	    // InternalMinijava.g:678:6: lv_varDeclarations_7_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getVarDeclarationsVarDeclarationParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_varDeclarations_7_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDeclarations",
            	    							lv_varDeclarations_7_0,
            	    							"org.xtext.test.minijava.Minijava.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMinijava.g:696:4: ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) )
            	    {
            	    // InternalMinijava.g:696:4: ( (lv_methodDeclarations_8_0= ruleMethodDeclaration ) )
            	    // InternalMinijava.g:697:5: (lv_methodDeclarations_8_0= ruleMethodDeclaration )
            	    {
            	    // InternalMinijava.g:697:5: (lv_methodDeclarations_8_0= ruleMethodDeclaration )
            	    // InternalMinijava.g:698:6: lv_methodDeclarations_8_0= ruleMethodDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_methodDeclarations_8_0=ruleMethodDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methodDeclarations",
            	    							lv_methodDeclarations_8_0,
            	    							"org.xtext.test.minijava.Minijava.MethodDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalMinijava.g:724:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMinijava.g:724:45: (iv_ruleType= ruleType EOF )
            // InternalMinijava.g:725:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMinijava.g:731:1: ruleType returns [EObject current=null] : ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (lv_typeName_5_0= 'double' ) ) | ( (lv_typeName_6_0= 'char' ) ) | ( (lv_qualifiedName_7_0= ruleQualifiedName ) ) | (otherlv_8= '(' ( (lv_varList_9_0= ruleVarList ) ) otherlv_10= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_typeName_1_0=null;
        Token otherlv_2=null;
        Token lv_typeName_3_0=null;
        Token lv_typeName_4_0=null;
        Token lv_typeName_5_0=null;
        Token lv_typeName_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_qualifiedName_7_0 = null;

        EObject lv_varList_9_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:737:2: ( ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (lv_typeName_5_0= 'double' ) ) | ( (lv_typeName_6_0= 'char' ) ) | ( (lv_qualifiedName_7_0= ruleQualifiedName ) ) | (otherlv_8= '(' ( (lv_varList_9_0= ruleVarList ) ) otherlv_10= ')' ) ) )
            // InternalMinijava.g:738:2: ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (lv_typeName_5_0= 'double' ) ) | ( (lv_typeName_6_0= 'char' ) ) | ( (lv_qualifiedName_7_0= ruleQualifiedName ) ) | (otherlv_8= '(' ( (lv_varList_9_0= ruleVarList ) ) otherlv_10= ')' ) )
            {
            // InternalMinijava.g:738:2: ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (lv_typeName_5_0= 'double' ) ) | ( (lv_typeName_6_0= 'char' ) ) | ( (lv_qualifiedName_7_0= ruleQualifiedName ) ) | (otherlv_8= '(' ( (lv_varList_9_0= ruleVarList ) ) otherlv_10= ')' ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==24) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_ID||LA9_1==22) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            case RULE_ID:
                {
                alt9=6;
                }
                break;
            case 22:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMinijava.g:739:3: (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' )
                    {
                    // InternalMinijava.g:739:3: (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' )
                    // InternalMinijava.g:740:4: otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getIntKeyword_0_0());
                    			
                    // InternalMinijava.g:744:4: ( (lv_typeName_1_0= '[' ) )
                    // InternalMinijava.g:745:5: (lv_typeName_1_0= '[' )
                    {
                    // InternalMinijava.g:745:5: (lv_typeName_1_0= '[' )
                    // InternalMinijava.g:746:6: lv_typeName_1_0= '['
                    {
                    lv_typeName_1_0=(Token)match(input,24,FOLLOW_18); 

                    						newLeafNode(lv_typeName_1_0, grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "typeName", lv_typeName_1_0, "[");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:764:3: ( (lv_typeName_3_0= 'int' ) )
                    {
                    // InternalMinijava.g:764:3: ( (lv_typeName_3_0= 'int' ) )
                    // InternalMinijava.g:765:4: (lv_typeName_3_0= 'int' )
                    {
                    // InternalMinijava.g:765:4: (lv_typeName_3_0= 'int' )
                    // InternalMinijava.g:766:5: lv_typeName_3_0= 'int'
                    {
                    lv_typeName_3_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_typeName_3_0, grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_3_0, "int");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:779:3: ( (lv_typeName_4_0= 'boolean' ) )
                    {
                    // InternalMinijava.g:779:3: ( (lv_typeName_4_0= 'boolean' ) )
                    // InternalMinijava.g:780:4: (lv_typeName_4_0= 'boolean' )
                    {
                    // InternalMinijava.g:780:4: (lv_typeName_4_0= 'boolean' )
                    // InternalMinijava.g:781:5: lv_typeName_4_0= 'boolean'
                    {
                    lv_typeName_4_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_typeName_4_0, grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_4_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMinijava.g:794:3: ( (lv_typeName_5_0= 'double' ) )
                    {
                    // InternalMinijava.g:794:3: ( (lv_typeName_5_0= 'double' ) )
                    // InternalMinijava.g:795:4: (lv_typeName_5_0= 'double' )
                    {
                    // InternalMinijava.g:795:4: (lv_typeName_5_0= 'double' )
                    // InternalMinijava.g:796:5: lv_typeName_5_0= 'double'
                    {
                    lv_typeName_5_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_typeName_5_0, grammarAccess.getTypeAccess().getTypeNameDoubleKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_5_0, "double");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMinijava.g:809:3: ( (lv_typeName_6_0= 'char' ) )
                    {
                    // InternalMinijava.g:809:3: ( (lv_typeName_6_0= 'char' ) )
                    // InternalMinijava.g:810:4: (lv_typeName_6_0= 'char' )
                    {
                    // InternalMinijava.g:810:4: (lv_typeName_6_0= 'char' )
                    // InternalMinijava.g:811:5: lv_typeName_6_0= 'char'
                    {
                    lv_typeName_6_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_typeName_6_0, grammarAccess.getTypeAccess().getTypeNameCharKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_6_0, "char");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMinijava.g:824:3: ( (lv_qualifiedName_7_0= ruleQualifiedName ) )
                    {
                    // InternalMinijava.g:824:3: ( (lv_qualifiedName_7_0= ruleQualifiedName ) )
                    // InternalMinijava.g:825:4: (lv_qualifiedName_7_0= ruleQualifiedName )
                    {
                    // InternalMinijava.g:825:4: (lv_qualifiedName_7_0= ruleQualifiedName )
                    // InternalMinijava.g:826:5: lv_qualifiedName_7_0= ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qualifiedName_7_0=ruleQualifiedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"qualifiedName",
                    						lv_qualifiedName_7_0,
                    						"org.xtext.test.minijava.Minijava.QualifiedName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMinijava.g:844:3: (otherlv_8= '(' ( (lv_varList_9_0= ruleVarList ) ) otherlv_10= ')' )
                    {
                    // InternalMinijava.g:844:3: (otherlv_8= '(' ( (lv_varList_9_0= ruleVarList ) ) otherlv_10= ')' )
                    // InternalMinijava.g:845:4: otherlv_8= '(' ( (lv_varList_9_0= ruleVarList ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_6_0());
                    			
                    // InternalMinijava.g:849:4: ( (lv_varList_9_0= ruleVarList ) )
                    // InternalMinijava.g:850:5: (lv_varList_9_0= ruleVarList )
                    {
                    // InternalMinijava.g:850:5: (lv_varList_9_0= ruleVarList )
                    // InternalMinijava.g:851:6: lv_varList_9_0= ruleVarList
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getVarListVarListParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_varList_9_0=ruleVarList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"varList",
                    							lv_varList_9_0,
                    							"org.xtext.test.minijava.Minijava.VarList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getRightParenthesisKeyword_6_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalMinijava.g:877:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalMinijava.g:877:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalMinijava.g:878:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalMinijava.g:884:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:890:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' ) )
            // InternalMinijava.g:891:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' )
            {
            // InternalMinijava.g:891:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' )
            // InternalMinijava.g:892:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';'
            {
            // InternalMinijava.g:892:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalMinijava.g:893:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalMinijava.g:893:4: (lv_variable_0_0= ruleVariable )
            // InternalMinijava.g:894:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.test.minijava.Minijava.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVariable"
    // InternalMinijava.g:919:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMinijava.g:919:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMinijava.g:920:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMinijava.g:926:1: ruleVariable returns [EObject current=null] : ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_variableType_0_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:932:2: ( ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMinijava.g:933:2: ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMinijava.g:933:2: ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMinijava.g:934:3: ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMinijava.g:934:3: ( (lv_variableType_0_0= ruleType ) )
            // InternalMinijava.g:935:4: (lv_variableType_0_0= ruleType )
            {
            // InternalMinijava.g:935:4: (lv_variableType_0_0= ruleType )
            // InternalMinijava.g:936:5: lv_variableType_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_variableType_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"variableType",
            						lv_variableType_0_0,
            						"org.xtext.test.minijava.Minijava.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:953:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMinijava.g:954:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMinijava.g:954:4: (lv_name_1_0= RULE_ID )
            // InternalMinijava.g:955:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarList"
    // InternalMinijava.g:975:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalMinijava.g:975:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalMinijava.g:976:2: iv_ruleVarList= ruleVarList EOF
            {
             newCompositeNode(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarList=ruleVarList();

            state._fsp--;

             current =iv_ruleVarList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalMinijava.g:982:1: ruleVarList returns [EObject current=null] : (this_VarDeclaration_0= ruleVarDeclaration ( (lv_varLi_1_0= ruleVarLi ) ) ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        EObject this_VarDeclaration_0 = null;

        EObject lv_varLi_1_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:988:2: ( (this_VarDeclaration_0= ruleVarDeclaration ( (lv_varLi_1_0= ruleVarLi ) ) ) )
            // InternalMinijava.g:989:2: (this_VarDeclaration_0= ruleVarDeclaration ( (lv_varLi_1_0= ruleVarLi ) ) )
            {
            // InternalMinijava.g:989:2: (this_VarDeclaration_0= ruleVarDeclaration ( (lv_varLi_1_0= ruleVarLi ) ) )
            // InternalMinijava.g:990:3: this_VarDeclaration_0= ruleVarDeclaration ( (lv_varLi_1_0= ruleVarLi ) )
            {

            			newCompositeNode(grammarAccess.getVarListAccess().getVarDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_VarDeclaration_0=ruleVarDeclaration();

            state._fsp--;


            			current = this_VarDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMinijava.g:998:3: ( (lv_varLi_1_0= ruleVarLi ) )
            // InternalMinijava.g:999:4: (lv_varLi_1_0= ruleVarLi )
            {
            // InternalMinijava.g:999:4: (lv_varLi_1_0= ruleVarLi )
            // InternalMinijava.g:1000:5: lv_varLi_1_0= ruleVarLi
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getVarLiVarLiParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_varLi_1_0=ruleVarLi();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					set(
            						current,
            						"varLi",
            						lv_varLi_1_0,
            						"org.xtext.test.minijava.Minijava.VarLi");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleVarLi"
    // InternalMinijava.g:1021:1: entryRuleVarLi returns [EObject current=null] : iv_ruleVarLi= ruleVarLi EOF ;
    public final EObject entryRuleVarLi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarLi = null;


        try {
            // InternalMinijava.g:1021:46: (iv_ruleVarLi= ruleVarLi EOF )
            // InternalMinijava.g:1022:2: iv_ruleVarLi= ruleVarLi EOF
            {
             newCompositeNode(grammarAccess.getVarLiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarLi=ruleVarLi();

            state._fsp--;

             current =iv_ruleVarLi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarLi"


    // $ANTLR start "ruleVarLi"
    // InternalMinijava.g:1028:1: ruleVarLi returns [EObject current=null] : (otherlv_0= ',' this_VarDeclaration_1= ruleVarDeclaration ( (lv_varLi_2_0= ruleVarLi ) ) ) ;
    public final EObject ruleVarLi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VarDeclaration_1 = null;

        EObject lv_varLi_2_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1034:2: ( (otherlv_0= ',' this_VarDeclaration_1= ruleVarDeclaration ( (lv_varLi_2_0= ruleVarLi ) ) ) )
            // InternalMinijava.g:1035:2: (otherlv_0= ',' this_VarDeclaration_1= ruleVarDeclaration ( (lv_varLi_2_0= ruleVarLi ) ) )
            {
            // InternalMinijava.g:1035:2: (otherlv_0= ',' this_VarDeclaration_1= ruleVarDeclaration ( (lv_varLi_2_0= ruleVarLi ) ) )
            // InternalMinijava.g:1036:3: otherlv_0= ',' this_VarDeclaration_1= ruleVarDeclaration ( (lv_varLi_2_0= ruleVarLi ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getVarLiAccess().getCommaKeyword_0());
            		

            			newCompositeNode(grammarAccess.getVarLiAccess().getVarDeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_VarDeclaration_1=ruleVarDeclaration();

            state._fsp--;


            			current = this_VarDeclaration_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalMinijava.g:1048:3: ( (lv_varLi_2_0= ruleVarLi ) )
            // InternalMinijava.g:1049:4: (lv_varLi_2_0= ruleVarLi )
            {
            // InternalMinijava.g:1049:4: (lv_varLi_2_0= ruleVarLi )
            // InternalMinijava.g:1050:5: lv_varLi_2_0= ruleVarLi
            {

            					newCompositeNode(grammarAccess.getVarLiAccess().getVarLiVarLiParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_varLi_2_0=ruleVarLi();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarLiRule());
            					}
            					set(
            						current,
            						"varLi",
            						lv_varLi_2_0,
            						"org.xtext.test.minijava.Minijava.VarLi");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarLi"


    // $ANTLR start "entryRuleMethodDeclaration"
    // InternalMinijava.g:1071:1: entryRuleMethodDeclaration returns [EObject current=null] : iv_ruleMethodDeclaration= ruleMethodDeclaration EOF ;
    public final EObject entryRuleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDeclaration = null;


        try {
            // InternalMinijava.g:1071:58: (iv_ruleMethodDeclaration= ruleMethodDeclaration EOF )
            // InternalMinijava.g:1072:2: iv_ruleMethodDeclaration= ruleMethodDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMethodDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDeclaration=ruleMethodDeclaration();

            state._fsp--;

             current =iv_ruleMethodDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // InternalMinijava.g:1078:1: ruleMethodDeclaration returns [EObject current=null] : ( (otherlv_0= 'public' | otherlv_1= 'protected' | otherlv_2= 'private' ) ( (lv_methodType_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_varList_6_0= ruleVarList ) )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' ) ;
    public final EObject ruleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_methodType_3_0 = null;

        EObject lv_varList_6_0 = null;

        EObject lv_localVarDeclarations_9_0 = null;

        EObject lv_statements_10_0 = null;

        EObject lv_returnExpression_12_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1084:2: ( ( (otherlv_0= 'public' | otherlv_1= 'protected' | otherlv_2= 'private' ) ( (lv_methodType_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_varList_6_0= ruleVarList ) )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' ) )
            // InternalMinijava.g:1085:2: ( (otherlv_0= 'public' | otherlv_1= 'protected' | otherlv_2= 'private' ) ( (lv_methodType_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_varList_6_0= ruleVarList ) )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' )
            {
            // InternalMinijava.g:1085:2: ( (otherlv_0= 'public' | otherlv_1= 'protected' | otherlv_2= 'private' ) ( (lv_methodType_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_varList_6_0= ruleVarList ) )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' )
            // InternalMinijava.g:1086:3: (otherlv_0= 'public' | otherlv_1= 'protected' | otherlv_2= 'private' ) ( (lv_methodType_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_varList_6_0= ruleVarList ) )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}'
            {
            // InternalMinijava.g:1086:3: (otherlv_0= 'public' | otherlv_1= 'protected' | otherlv_2= 'private' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMinijava.g:1087:4: otherlv_0= 'public'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMinijava.g:1092:4: otherlv_1= 'protected'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getMethodDeclarationAccess().getProtectedKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMinijava.g:1097:4: otherlv_2= 'private'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getMethodDeclarationAccess().getPrivateKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMinijava.g:1102:3: ( (lv_methodType_3_0= ruleType ) )
            // InternalMinijava.g:1103:4: (lv_methodType_3_0= ruleType )
            {
            // InternalMinijava.g:1103:4: (lv_methodType_3_0= ruleType )
            // InternalMinijava.g:1104:5: lv_methodType_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getMethodTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_methodType_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            					}
            					set(
            						current,
            						"methodType",
            						lv_methodType_3_0,
            						"org.xtext.test.minijava.Minijava.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:1121:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMinijava.g:1122:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMinijava.g:1122:4: (lv_name_4_0= RULE_ID )
            // InternalMinijava.g:1123:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMinijava.g:1143:3: ( (lv_varList_6_0= ruleVarList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==22||(LA11_0>=30 && LA11_0<=33)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMinijava.g:1144:4: (lv_varList_6_0= ruleVarList )
                    {
                    // InternalMinijava.g:1144:4: (lv_varList_6_0= ruleVarList )
                    // InternalMinijava.g:1145:5: lv_varList_6_0= ruleVarList
                    {

                    					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getVarListVarListParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_varList_6_0=ruleVarList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"varList",
                    						lv_varList_6_0,
                    						"org.xtext.test.minijava.Minijava.VarList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMinijava.g:1170:3: ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==14) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==22||(LA12_0>=30 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMinijava.g:1171:4: (lv_localVarDeclarations_9_0= ruleVarDeclaration )
            	    {
            	    // InternalMinijava.g:1171:4: (lv_localVarDeclarations_9_0= ruleVarDeclaration )
            	    // InternalMinijava.g:1172:5: lv_localVarDeclarations_9_0= ruleVarDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsVarDeclarationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_localVarDeclarations_9_0=ruleVarDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"localVarDeclarations",
            	    						lv_localVarDeclarations_9_0,
            	    						"org.xtext.test.minijava.Minijava.VarDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMinijava.g:1189:3: ( (lv_statements_10_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==17||LA13_0==37||LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMinijava.g:1190:4: (lv_statements_10_0= ruleStatement )
            	    {
            	    // InternalMinijava.g:1190:4: (lv_statements_10_0= ruleStatement )
            	    // InternalMinijava.g:1191:5: lv_statements_10_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getStatementsStatementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_statements_10_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_10_0,
            	    						"org.xtext.test.minijava.Minijava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMinijava.g:1208:3: (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMinijava.g:1209:4: otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9_0());
                    			
                    // InternalMinijava.g:1213:4: ( (lv_returnExpression_12_0= ruleExpression ) )
                    // InternalMinijava.g:1214:5: (lv_returnExpression_12_0= ruleExpression )
                    {
                    // InternalMinijava.g:1214:5: (lv_returnExpression_12_0= ruleExpression )
                    // InternalMinijava.g:1215:6: lv_returnExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_returnExpression_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"returnExpression",
                    							lv_returnExpression_12_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_13, grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_9_2());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleStatement"
    // InternalMinijava.g:1245:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMinijava.g:1245:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMinijava.g:1246:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMinijava.g:1252:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (otherlv_15= RULE_ID ) ) ( (lv_statementType_16_0= '=' ) ) ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ';' ) | ( ( (otherlv_19= RULE_ID ) ) ( (lv_isArrayElementAssignment_20_0= '[' ) ) ( (lv_firstExpression_21_0= ruleExpression ) ) otherlv_22= ']' ( (lv_statementType_23_0= '=' ) ) ( (lv_secondExpression_24_0= ruleExpression ) ) otherlv_25= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_statementType_0_0=null;
        Token otherlv_2=null;
        Token lv_statementType_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_statementType_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_statementType_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_isArrayElementAssignment_20_0=null;
        Token otherlv_22=null;
        Token lv_statementType_23_0=null;
        Token otherlv_25=null;
        EObject lv_statements_1_0 = null;

        EObject lv_firstExpression_5_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_firstExpression_12_0 = null;

        EObject lv_statements_14_0 = null;

        EObject lv_firstExpression_17_0 = null;

        EObject lv_firstExpression_21_0 = null;

        EObject lv_secondExpression_24_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1258:2: ( ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (otherlv_15= RULE_ID ) ) ( (lv_statementType_16_0= '=' ) ) ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ';' ) | ( ( (otherlv_19= RULE_ID ) ) ( (lv_isArrayElementAssignment_20_0= '[' ) ) ( (lv_firstExpression_21_0= ruleExpression ) ) otherlv_22= ']' ( (lv_statementType_23_0= '=' ) ) ( (lv_secondExpression_24_0= ruleExpression ) ) otherlv_25= ';' ) ) )
            // InternalMinijava.g:1259:2: ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (otherlv_15= RULE_ID ) ) ( (lv_statementType_16_0= '=' ) ) ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ';' ) | ( ( (otherlv_19= RULE_ID ) ) ( (lv_isArrayElementAssignment_20_0= '[' ) ) ( (lv_firstExpression_21_0= ruleExpression ) ) otherlv_22= ']' ( (lv_statementType_23_0= '=' ) ) ( (lv_secondExpression_24_0= ruleExpression ) ) otherlv_25= ';' ) )
            {
            // InternalMinijava.g:1259:2: ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (otherlv_15= RULE_ID ) ) ( (lv_statementType_16_0= '=' ) ) ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ';' ) | ( ( (otherlv_19= RULE_ID ) ) ( (lv_isArrayElementAssignment_20_0= '[' ) ) ( (lv_firstExpression_21_0= ruleExpression ) ) otherlv_22= ']' ( (lv_statementType_23_0= '=' ) ) ( (lv_secondExpression_24_0= ruleExpression ) ) otherlv_25= ';' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 39:
                {
                alt16=3;
                }
                break;
            case RULE_ID:
                {
                int LA16_4 = input.LA(2);

                if ( (LA16_4==24) ) {
                    alt16=5;
                }
                else if ( (LA16_4==40) ) {
                    alt16=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMinijava.g:1260:3: ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
                    {
                    // InternalMinijava.g:1260:3: ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
                    // InternalMinijava.g:1261:4: ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
                    {
                    // InternalMinijava.g:1261:4: ( (lv_statementType_0_0= '{' ) )
                    // InternalMinijava.g:1262:5: (lv_statementType_0_0= '{' )
                    {
                    // InternalMinijava.g:1262:5: (lv_statementType_0_0= '{' )
                    // InternalMinijava.g:1263:6: lv_statementType_0_0= '{'
                    {
                    lv_statementType_0_0=(Token)match(input,17,FOLLOW_20); 

                    						newLeafNode(lv_statementType_0_0, grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_0_0, "{");
                    					

                    }


                    }

                    // InternalMinijava.g:1275:4: ( (lv_statements_1_0= ruleStatement ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||LA15_0==17||LA15_0==37||LA15_0==39) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMinijava.g:1276:5: (lv_statements_1_0= ruleStatement )
                    	    {
                    	    // InternalMinijava.g:1276:5: (lv_statements_1_0= ruleStatement )
                    	    // InternalMinijava.g:1277:6: lv_statements_1_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_statements_1_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_1_0,
                    	    							"org.xtext.test.minijava.Minijava.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:1300:3: ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) )
                    {
                    // InternalMinijava.g:1300:3: ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) )
                    // InternalMinijava.g:1301:4: ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) )
                    {
                    // InternalMinijava.g:1301:4: ( (lv_statementType_3_0= 'if' ) )
                    // InternalMinijava.g:1302:5: (lv_statementType_3_0= 'if' )
                    {
                    // InternalMinijava.g:1302:5: (lv_statementType_3_0= 'if' )
                    // InternalMinijava.g:1303:6: lv_statementType_3_0= 'if'
                    {
                    lv_statementType_3_0=(Token)match(input,37,FOLLOW_15); 

                    						newLeafNode(lv_statementType_3_0, grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_3_0, "if");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMinijava.g:1319:4: ( (lv_firstExpression_5_0= ruleExpression ) )
                    // InternalMinijava.g:1320:5: (lv_firstExpression_5_0= ruleExpression )
                    {
                    // InternalMinijava.g:1320:5: (lv_firstExpression_5_0= ruleExpression )
                    // InternalMinijava.g:1321:6: lv_firstExpression_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_firstExpression_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_5_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalMinijava.g:1342:4: ( (lv_statements_7_0= ruleStatement ) )
                    // InternalMinijava.g:1343:5: (lv_statements_7_0= ruleStatement )
                    {
                    // InternalMinijava.g:1343:5: (lv_statements_7_0= ruleStatement )
                    // InternalMinijava.g:1344:6: lv_statements_7_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_statements_7_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_7_0,
                    							"org.xtext.test.minijava.Minijava.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,38,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getElseKeyword_1_5());
                    			
                    // InternalMinijava.g:1365:4: ( (lv_statements_9_0= ruleStatement ) )
                    // InternalMinijava.g:1366:5: (lv_statements_9_0= ruleStatement )
                    {
                    // InternalMinijava.g:1366:5: (lv_statements_9_0= ruleStatement )
                    // InternalMinijava.g:1367:6: lv_statements_9_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statements_9_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_9_0,
                    							"org.xtext.test.minijava.Minijava.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:1386:3: ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) )
                    {
                    // InternalMinijava.g:1386:3: ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) )
                    // InternalMinijava.g:1387:4: ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) )
                    {
                    // InternalMinijava.g:1387:4: ( (lv_statementType_10_0= 'while' ) )
                    // InternalMinijava.g:1388:5: (lv_statementType_10_0= 'while' )
                    {
                    // InternalMinijava.g:1388:5: (lv_statementType_10_0= 'while' )
                    // InternalMinijava.g:1389:6: lv_statementType_10_0= 'while'
                    {
                    lv_statementType_10_0=(Token)match(input,39,FOLLOW_15); 

                    						newLeafNode(lv_statementType_10_0, grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_10_0, "while");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMinijava.g:1405:4: ( (lv_firstExpression_12_0= ruleExpression ) )
                    // InternalMinijava.g:1406:5: (lv_firstExpression_12_0= ruleExpression )
                    {
                    // InternalMinijava.g:1406:5: (lv_firstExpression_12_0= ruleExpression )
                    // InternalMinijava.g:1407:6: lv_firstExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_firstExpression_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_12_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3());
                    			
                    // InternalMinijava.g:1428:4: ( (lv_statements_14_0= ruleStatement ) )
                    // InternalMinijava.g:1429:5: (lv_statements_14_0= ruleStatement )
                    {
                    // InternalMinijava.g:1429:5: (lv_statements_14_0= ruleStatement )
                    // InternalMinijava.g:1430:6: lv_statements_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statements_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_14_0,
                    							"org.xtext.test.minijava.Minijava.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMinijava.g:1449:3: ( ( (otherlv_15= RULE_ID ) ) ( (lv_statementType_16_0= '=' ) ) ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ';' )
                    {
                    // InternalMinijava.g:1449:3: ( ( (otherlv_15= RULE_ID ) ) ( (lv_statementType_16_0= '=' ) ) ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ';' )
                    // InternalMinijava.g:1450:4: ( (otherlv_15= RULE_ID ) ) ( (lv_statementType_16_0= '=' ) ) ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ';'
                    {
                    // InternalMinijava.g:1450:4: ( (otherlv_15= RULE_ID ) )
                    // InternalMinijava.g:1451:5: (otherlv_15= RULE_ID )
                    {
                    // InternalMinijava.g:1451:5: (otherlv_15= RULE_ID )
                    // InternalMinijava.g:1452:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getVariableVariableCrossReference_3_0_0());
                    					

                    }


                    }

                    // InternalMinijava.g:1463:4: ( (lv_statementType_16_0= '=' ) )
                    // InternalMinijava.g:1464:5: (lv_statementType_16_0= '=' )
                    {
                    // InternalMinijava.g:1464:5: (lv_statementType_16_0= '=' )
                    // InternalMinijava.g:1465:6: lv_statementType_16_0= '='
                    {
                    lv_statementType_16_0=(Token)match(input,40,FOLLOW_28); 

                    						newLeafNode(lv_statementType_16_0, grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_16_0, "=");
                    					

                    }


                    }

                    // InternalMinijava.g:1477:4: ( (lv_firstExpression_17_0= ruleExpression ) )
                    // InternalMinijava.g:1478:5: (lv_firstExpression_17_0= ruleExpression )
                    {
                    // InternalMinijava.g:1478:5: (lv_firstExpression_17_0= ruleExpression )
                    // InternalMinijava.g:1479:6: lv_firstExpression_17_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_firstExpression_17_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_17_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getSemicolonKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMinijava.g:1502:3: ( ( (otherlv_19= RULE_ID ) ) ( (lv_isArrayElementAssignment_20_0= '[' ) ) ( (lv_firstExpression_21_0= ruleExpression ) ) otherlv_22= ']' ( (lv_statementType_23_0= '=' ) ) ( (lv_secondExpression_24_0= ruleExpression ) ) otherlv_25= ';' )
                    {
                    // InternalMinijava.g:1502:3: ( ( (otherlv_19= RULE_ID ) ) ( (lv_isArrayElementAssignment_20_0= '[' ) ) ( (lv_firstExpression_21_0= ruleExpression ) ) otherlv_22= ']' ( (lv_statementType_23_0= '=' ) ) ( (lv_secondExpression_24_0= ruleExpression ) ) otherlv_25= ';' )
                    // InternalMinijava.g:1503:4: ( (otherlv_19= RULE_ID ) ) ( (lv_isArrayElementAssignment_20_0= '[' ) ) ( (lv_firstExpression_21_0= ruleExpression ) ) otherlv_22= ']' ( (lv_statementType_23_0= '=' ) ) ( (lv_secondExpression_24_0= ruleExpression ) ) otherlv_25= ';'
                    {
                    // InternalMinijava.g:1503:4: ( (otherlv_19= RULE_ID ) )
                    // InternalMinijava.g:1504:5: (otherlv_19= RULE_ID )
                    {
                    // InternalMinijava.g:1504:5: (otherlv_19= RULE_ID )
                    // InternalMinijava.g:1505:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalMinijava.g:1516:4: ( (lv_isArrayElementAssignment_20_0= '[' ) )
                    // InternalMinijava.g:1517:5: (lv_isArrayElementAssignment_20_0= '[' )
                    {
                    // InternalMinijava.g:1517:5: (lv_isArrayElementAssignment_20_0= '[' )
                    // InternalMinijava.g:1518:6: lv_isArrayElementAssignment_20_0= '['
                    {
                    lv_isArrayElementAssignment_20_0=(Token)match(input,24,FOLLOW_28); 

                    						newLeafNode(lv_isArrayElementAssignment_20_0, grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "isArrayElementAssignment", lv_isArrayElementAssignment_20_0 != null, "[");
                    					

                    }


                    }

                    // InternalMinijava.g:1530:4: ( (lv_firstExpression_21_0= ruleExpression ) )
                    // InternalMinijava.g:1531:5: (lv_firstExpression_21_0= ruleExpression )
                    {
                    // InternalMinijava.g:1531:5: (lv_firstExpression_21_0= ruleExpression )
                    // InternalMinijava.g:1532:6: lv_firstExpression_21_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_firstExpression_21_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_21_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,25,FOLLOW_31); 

                    				newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getRightSquareBracketKeyword_4_3());
                    			
                    // InternalMinijava.g:1553:4: ( (lv_statementType_23_0= '=' ) )
                    // InternalMinijava.g:1554:5: (lv_statementType_23_0= '=' )
                    {
                    // InternalMinijava.g:1554:5: (lv_statementType_23_0= '=' )
                    // InternalMinijava.g:1555:6: lv_statementType_23_0= '='
                    {
                    lv_statementType_23_0=(Token)match(input,40,FOLLOW_28); 

                    						newLeafNode(lv_statementType_23_0, grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_23_0, "=");
                    					

                    }


                    }

                    // InternalMinijava.g:1567:4: ( (lv_secondExpression_24_0= ruleExpression ) )
                    // InternalMinijava.g:1568:5: (lv_secondExpression_24_0= ruleExpression )
                    {
                    // InternalMinijava.g:1568:5: (lv_secondExpression_24_0= ruleExpression )
                    // InternalMinijava.g:1569:6: lv_secondExpression_24_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getSecondExpressionExpressionParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_secondExpression_24_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"secondExpression",
                    							lv_secondExpression_24_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getStatementAccess().getSemicolonKeyword_4_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMinijava.g:1595:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMinijava.g:1595:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMinijava.g:1596:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMinijava.g:1602:1: ruleExpression returns [EObject current=null] : ( ( (lv_addition_0_0= ruleAddition ) ) ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        EObject lv_addition_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1608:2: ( ( ( (lv_addition_0_0= ruleAddition ) ) ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // InternalMinijava.g:1609:2: ( ( (lv_addition_0_0= ruleAddition ) ) ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // InternalMinijava.g:1609:2: ( ( (lv_addition_0_0= ruleAddition ) ) ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // InternalMinijava.g:1610:3: ( (lv_addition_0_0= ruleAddition ) ) ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
            // InternalMinijava.g:1610:3: ( (lv_addition_0_0= ruleAddition ) )
            // InternalMinijava.g:1611:4: (lv_addition_0_0= ruleAddition )
            {
            // InternalMinijava.g:1611:4: (lv_addition_0_0= ruleAddition )
            // InternalMinijava.g:1612:5: lv_addition_0_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getAdditionAdditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_addition_0_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"addition",
            						lv_addition_0_0,
            						"org.xtext.test.minijava.Minijava.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:1629:3: ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMinijava.g:1630:4: () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // InternalMinijava.g:1630:4: ()
                    // InternalMinijava.g:1631:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMinijava.g:1637:4: ( (lv_expressionType_2_0= '<' ) )
                    // InternalMinijava.g:1638:5: (lv_expressionType_2_0= '<' )
                    {
                    // InternalMinijava.g:1638:5: (lv_expressionType_2_0= '<' )
                    // InternalMinijava.g:1639:6: lv_expressionType_2_0= '<'
                    {
                    lv_expressionType_2_0=(Token)match(input,41,FOLLOW_28); 

                    						newLeafNode(lv_expressionType_2_0, grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "<");
                    					

                    }


                    }

                    // InternalMinijava.g:1651:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalMinijava.g:1652:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalMinijava.g:1652:5: (lv_right_3_0= ruleExpression )
                    // InternalMinijava.g:1653:6: lv_right_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalMinijava.g:1675:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalMinijava.g:1675:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalMinijava.g:1676:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMinijava.g:1682:1: ruleAddition returns [EObject current=null] : ( ( (lv_multiplication_0_0= ruleMultiplication ) ) ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_1=null;
        Token lv_expressionType_2_2=null;
        EObject lv_multiplication_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1688:2: ( ( ( (lv_multiplication_0_0= ruleMultiplication ) ) ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalMinijava.g:1689:2: ( ( (lv_multiplication_0_0= ruleMultiplication ) ) ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalMinijava.g:1689:2: ( ( (lv_multiplication_0_0= ruleMultiplication ) ) ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalMinijava.g:1690:3: ( (lv_multiplication_0_0= ruleMultiplication ) ) ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
            // InternalMinijava.g:1690:3: ( (lv_multiplication_0_0= ruleMultiplication ) )
            // InternalMinijava.g:1691:4: (lv_multiplication_0_0= ruleMultiplication )
            {
            // InternalMinijava.g:1691:4: (lv_multiplication_0_0= ruleMultiplication )
            // InternalMinijava.g:1692:5: lv_multiplication_0_0= ruleMultiplication
            {

            					newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationMultiplicationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_multiplication_0_0=ruleMultiplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionRule());
            					}
            					set(
            						current,
            						"multiplication",
            						lv_multiplication_0_0,
            						"org.xtext.test.minijava.Minijava.Multiplication");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:1709:3: ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=42 && LA19_0<=43)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMinijava.g:1710:4: () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalMinijava.g:1710:4: ()
            	    // InternalMinijava.g:1711:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMinijava.g:1717:4: ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) )
            	    // InternalMinijava.g:1718:5: ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) )
            	    {
            	    // InternalMinijava.g:1718:5: ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) )
            	    // InternalMinijava.g:1719:6: (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' )
            	    {
            	    // InternalMinijava.g:1719:6: (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==42) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==43) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMinijava.g:1720:7: lv_expressionType_2_1= '+'
            	            {
            	            lv_expressionType_2_1=(Token)match(input,42,FOLLOW_28); 

            	            							newLeafNode(lv_expressionType_2_1, grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMinijava.g:1731:7: lv_expressionType_2_2= '-'
            	            {
            	            lv_expressionType_2_2=(Token)match(input,43,FOLLOW_28); 

            	            							newLeafNode(lv_expressionType_2_2, grammarAccess.getAdditionAccess().getExpressionTypeHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMinijava.g:1744:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalMinijava.g:1745:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalMinijava.g:1745:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalMinijava.g:1746:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.test.minijava.Minijava.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMinijava.g:1768:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalMinijava.g:1768:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalMinijava.g:1769:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMinijava.g:1775:1: ruleMultiplication returns [EObject current=null] : ( ( (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression ) ) ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_1=null;
        Token lv_expressionType_2_2=null;
        EObject lv_negationOrPointExpression_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1781:2: ( ( ( (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression ) ) ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* ) )
            // InternalMinijava.g:1782:2: ( ( (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression ) ) ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* )
            {
            // InternalMinijava.g:1782:2: ( ( (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression ) ) ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* )
            // InternalMinijava.g:1783:3: ( (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression ) ) ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )*
            {
            // InternalMinijava.g:1783:3: ( (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression ) )
            // InternalMinijava.g:1784:4: (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression )
            {
            // InternalMinijava.g:1784:4: (lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression )
            // InternalMinijava.g:1785:5: lv_negationOrPointExpression_0_0= ruleNegationOrPointExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionNegationOrPointExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_negationOrPointExpression_0_0=ruleNegationOrPointExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            					}
            					set(
            						current,
            						"negationOrPointExpression",
            						lv_negationOrPointExpression_0_0,
            						"org.xtext.test.minijava.Minijava.NegationOrPointExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:1802:3: ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=44 && LA21_0<=45)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMinijava.g:1803:4: () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) )
            	    {
            	    // InternalMinijava.g:1803:4: ()
            	    // InternalMinijava.g:1804:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMinijava.g:1810:4: ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) )
            	    // InternalMinijava.g:1811:5: ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) )
            	    {
            	    // InternalMinijava.g:1811:5: ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) )
            	    // InternalMinijava.g:1812:6: (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' )
            	    {
            	    // InternalMinijava.g:1812:6: (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==44) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==45) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMinijava.g:1813:7: lv_expressionType_2_1= '*'
            	            {
            	            lv_expressionType_2_1=(Token)match(input,44,FOLLOW_28); 

            	            							newLeafNode(lv_expressionType_2_1, grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMinijava.g:1824:7: lv_expressionType_2_2= '&&'
            	            {
            	            lv_expressionType_2_2=(Token)match(input,45,FOLLOW_28); 

            	            							newLeafNode(lv_expressionType_2_2, grammarAccess.getMultiplicationAccess().getExpressionTypeAmpersandAmpersandKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMinijava.g:1837:4: ( (lv_right_3_0= ruleNegationOrPointExpression ) )
            	    // InternalMinijava.g:1838:5: (lv_right_3_0= ruleNegationOrPointExpression )
            	    {
            	    // InternalMinijava.g:1838:5: (lv_right_3_0= ruleNegationOrPointExpression )
            	    // InternalMinijava.g:1839:6: lv_right_3_0= ruleNegationOrPointExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNegationOrPointExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleNegationOrPointExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.test.minijava.Minijava.NegationOrPointExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNegationOrPointExpression"
    // InternalMinijava.g:1861:1: entryRuleNegationOrPointExpression returns [EObject current=null] : iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF ;
    public final EObject entryRuleNegationOrPointExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationOrPointExpression = null;


        try {
            // InternalMinijava.g:1861:66: (iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF )
            // InternalMinijava.g:1862:2: iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF
            {
             newCompositeNode(grammarAccess.getNegationOrPointExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegationOrPointExpression=ruleNegationOrPointExpression();

            state._fsp--;

             current =iv_ruleNegationOrPointExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegationOrPointExpression"


    // $ANTLR start "ruleNegationOrPointExpression"
    // InternalMinijava.g:1868:1: ruleNegationOrPointExpression returns [EObject current=null] : (this_Negation_0= ruleNegation | ( (lv_point_1_0= rulePoint ) ) ) ;
    public final EObject ruleNegationOrPointExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject lv_point_1_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1874:2: ( (this_Negation_0= ruleNegation | ( (lv_point_1_0= rulePoint ) ) ) )
            // InternalMinijava.g:1875:2: (this_Negation_0= ruleNegation | ( (lv_point_1_0= rulePoint ) ) )
            {
            // InternalMinijava.g:1875:2: (this_Negation_0= ruleNegation | ( (lv_point_1_0= rulePoint ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==22||(LA22_0>=47 && LA22_0<=50)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMinijava.g:1876:3: this_Negation_0= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getNegationOrPointExpressionAccess().getNegationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_0=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMinijava.g:1885:3: ( (lv_point_1_0= rulePoint ) )
                    {
                    // InternalMinijava.g:1885:3: ( (lv_point_1_0= rulePoint ) )
                    // InternalMinijava.g:1886:4: (lv_point_1_0= rulePoint )
                    {
                    // InternalMinijava.g:1886:4: (lv_point_1_0= rulePoint )
                    // InternalMinijava.g:1887:5: lv_point_1_0= rulePoint
                    {

                    					newCompositeNode(grammarAccess.getNegationOrPointExpressionAccess().getPointPointParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_point_1_0=rulePoint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNegationOrPointExpressionRule());
                    					}
                    					set(
                    						current,
                    						"point",
                    						lv_point_1_0,
                    						"org.xtext.test.minijava.Minijava.Point");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegationOrPointExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalMinijava.g:1908:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalMinijava.g:1908:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalMinijava.g:1909:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMinijava.g:1915:1: ruleNegation returns [EObject current=null] : ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1921:2: ( ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) ) )
            // InternalMinijava.g:1922:2: ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) )
            {
            // InternalMinijava.g:1922:2: ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) )
            // InternalMinijava.g:1923:3: ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) )
            {
            // InternalMinijava.g:1923:3: ( (lv_expressionType_0_0= '!' ) )
            // InternalMinijava.g:1924:4: (lv_expressionType_0_0= '!' )
            {
            // InternalMinijava.g:1924:4: (lv_expressionType_0_0= '!' )
            // InternalMinijava.g:1925:5: lv_expressionType_0_0= '!'
            {
            lv_expressionType_0_0=(Token)match(input,46,FOLLOW_28); 

            					newLeafNode(lv_expressionType_0_0, grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNegationRule());
            					}
            					setWithLastConsumed(current, "expressionType", lv_expressionType_0_0, "!");
            				

            }


            }

            // InternalMinijava.g:1937:3: ( (lv_right_1_0= rulePoint ) )
            // InternalMinijava.g:1938:4: (lv_right_1_0= rulePoint )
            {
            // InternalMinijava.g:1938:4: (lv_right_1_0= rulePoint )
            // InternalMinijava.g:1939:5: lv_right_1_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getRightPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_1_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.xtext.test.minijava.Minijava.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRulePoint"
    // InternalMinijava.g:1960:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalMinijava.g:1960:46: (iv_rulePoint= rulePoint EOF )
            // InternalMinijava.g:1961:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalMinijava.g:1967:1: rulePoint returns [EObject current=null] : ( ( (lv_squareBrackets_0_0= ruleSquareBrackets ) ) ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        EObject lv_squareBrackets_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:1973:2: ( ( ( (lv_squareBrackets_0_0= ruleSquareBrackets ) ) ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* ) )
            // InternalMinijava.g:1974:2: ( ( (lv_squareBrackets_0_0= ruleSquareBrackets ) ) ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* )
            {
            // InternalMinijava.g:1974:2: ( ( (lv_squareBrackets_0_0= ruleSquareBrackets ) ) ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* )
            // InternalMinijava.g:1975:3: ( (lv_squareBrackets_0_0= ruleSquareBrackets ) ) ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )*
            {
            // InternalMinijava.g:1975:3: ( (lv_squareBrackets_0_0= ruleSquareBrackets ) )
            // InternalMinijava.g:1976:4: (lv_squareBrackets_0_0= ruleSquareBrackets )
            {
            // InternalMinijava.g:1976:4: (lv_squareBrackets_0_0= ruleSquareBrackets )
            // InternalMinijava.g:1977:5: lv_squareBrackets_0_0= ruleSquareBrackets
            {

            					newCompositeNode(grammarAccess.getPointAccess().getSquareBracketsSquareBracketsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_squareBrackets_0_0=ruleSquareBrackets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"squareBrackets",
            						lv_squareBrackets_0_0,
            						"org.xtext.test.minijava.Minijava.SquareBrackets");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:1994:3: ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMinijava.g:1995:4: () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) )
            	    {
            	    // InternalMinijava.g:1995:4: ()
            	    // InternalMinijava.g:1996:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPointAccess().getPointLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMinijava.g:2002:4: ( (lv_expressionType_2_0= '.' ) )
            	    // InternalMinijava.g:2003:5: (lv_expressionType_2_0= '.' )
            	    {
            	    // InternalMinijava.g:2003:5: (lv_expressionType_2_0= '.' )
            	    // InternalMinijava.g:2004:6: lv_expressionType_2_0= '.'
            	    {
            	    lv_expressionType_2_0=(Token)match(input,14,FOLLOW_36); 

            	    						newLeafNode(lv_expressionType_2_0, grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPointRule());
            	    						}
            	    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, ".");
            	    					

            	    }


            	    }

            	    // InternalMinijava.g:2016:4: ( (lv_right_3_0= ruleMethodCallExpr ) )
            	    // InternalMinijava.g:2017:5: (lv_right_3_0= ruleMethodCallExpr )
            	    {
            	    // InternalMinijava.g:2017:5: (lv_right_3_0= ruleMethodCallExpr )
            	    // InternalMinijava.g:2018:6: lv_right_3_0= ruleMethodCallExpr
            	    {

            	    						newCompositeNode(grammarAccess.getPointAccess().getRightMethodCallExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=ruleMethodCallExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPointRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.test.minijava.Minijava.MethodCallExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleSquareBrackets"
    // InternalMinijava.g:2040:1: entryRuleSquareBrackets returns [EObject current=null] : iv_ruleSquareBrackets= ruleSquareBrackets EOF ;
    public final EObject entryRuleSquareBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBrackets = null;


        try {
            // InternalMinijava.g:2040:55: (iv_ruleSquareBrackets= ruleSquareBrackets EOF )
            // InternalMinijava.g:2041:2: iv_ruleSquareBrackets= ruleSquareBrackets EOF
            {
             newCompositeNode(grammarAccess.getSquareBracketsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquareBrackets=ruleSquareBrackets();

            state._fsp--;

             current =iv_ruleSquareBrackets; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquareBrackets"


    // $ANTLR start "ruleSquareBrackets"
    // InternalMinijava.g:2047:1: ruleSquareBrackets returns [EObject current=null] : ( ( (lv_primary_0_0= rulePrimary ) ) ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSquareBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        Token otherlv_4=null;
        EObject lv_primary_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:2053:2: ( ( ( (lv_primary_0_0= rulePrimary ) ) ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? ) )
            // InternalMinijava.g:2054:2: ( ( (lv_primary_0_0= rulePrimary ) ) ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? )
            {
            // InternalMinijava.g:2054:2: ( ( (lv_primary_0_0= rulePrimary ) ) ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? )
            // InternalMinijava.g:2055:3: ( (lv_primary_0_0= rulePrimary ) ) ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )?
            {
            // InternalMinijava.g:2055:3: ( (lv_primary_0_0= rulePrimary ) )
            // InternalMinijava.g:2056:4: (lv_primary_0_0= rulePrimary )
            {
            // InternalMinijava.g:2056:4: (lv_primary_0_0= rulePrimary )
            // InternalMinijava.g:2057:5: lv_primary_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getSquareBracketsAccess().getPrimaryPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_primary_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSquareBracketsRule());
            					}
            					set(
            						current,
            						"primary",
            						lv_primary_0_0,
            						"org.xtext.test.minijava.Minijava.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinijava.g:2074:3: ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMinijava.g:2075:4: () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']'
                    {
                    // InternalMinijava.g:2075:4: ()
                    // InternalMinijava.g:2076:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMinijava.g:2082:4: ( (lv_expressionType_2_0= '[' ) )
                    // InternalMinijava.g:2083:5: (lv_expressionType_2_0= '[' )
                    {
                    // InternalMinijava.g:2083:5: (lv_expressionType_2_0= '[' )
                    // InternalMinijava.g:2084:6: lv_expressionType_2_0= '['
                    {
                    lv_expressionType_2_0=(Token)match(input,24,FOLLOW_28); 

                    						newLeafNode(lv_expressionType_2_0, grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSquareBracketsRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "[");
                    					

                    }


                    }

                    // InternalMinijava.g:2096:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalMinijava.g:2097:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalMinijava.g:2097:5: (lv_right_3_0= rulePrimary )
                    // InternalMinijava.g:2098:6: lv_right_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_right_3_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSquareBracketsRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.xtext.test.minijava.Minijava.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSquareBracketsAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquareBrackets"


    // $ANTLR start "entryRulePrimary"
    // InternalMinijava.g:2124:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMinijava.g:2124:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMinijava.g:2125:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMinijava.g:2131:1: rulePrimary returns [EObject current=null] : ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_0_0=null;
        Token lv_expressionType_1_0=null;
        Token lv_expressionType_2_0=null;
        Token lv_expressionType_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_expressionType_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_expressionType_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_expression_6_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_expression_13_0 = null;

        EObject lv_number_16_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:2137:2: ( ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) ) )
            // InternalMinijava.g:2138:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) )
            {
            // InternalMinijava.g:2138:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) )
            int alt25=8;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalMinijava.g:2139:3: ( (lv_expressionType_0_0= 'true' ) )
                    {
                    // InternalMinijava.g:2139:3: ( (lv_expressionType_0_0= 'true' ) )
                    // InternalMinijava.g:2140:4: (lv_expressionType_0_0= 'true' )
                    {
                    // InternalMinijava.g:2140:4: (lv_expressionType_0_0= 'true' )
                    // InternalMinijava.g:2141:5: lv_expressionType_0_0= 'true'
                    {
                    lv_expressionType_0_0=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_0_0, grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:2154:3: ( (lv_expressionType_1_0= 'false' ) )
                    {
                    // InternalMinijava.g:2154:3: ( (lv_expressionType_1_0= 'false' ) )
                    // InternalMinijava.g:2155:4: (lv_expressionType_1_0= 'false' )
                    {
                    // InternalMinijava.g:2155:4: (lv_expressionType_1_0= 'false' )
                    // InternalMinijava.g:2156:5: lv_expressionType_1_0= 'false'
                    {
                    lv_expressionType_1_0=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_1_0, grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_1_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:2169:3: ( (lv_expressionType_2_0= 'this' ) )
                    {
                    // InternalMinijava.g:2169:3: ( (lv_expressionType_2_0= 'this' ) )
                    // InternalMinijava.g:2170:4: (lv_expressionType_2_0= 'this' )
                    {
                    // InternalMinijava.g:2170:4: (lv_expressionType_2_0= 'this' )
                    // InternalMinijava.g:2171:5: lv_expressionType_2_0= 'this'
                    {
                    lv_expressionType_2_0=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_2_0, grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "this");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMinijava.g:2184:3: ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalMinijava.g:2184:3: ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalMinijava.g:2185:4: ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalMinijava.g:2185:4: ( (lv_expressionType_3_0= 'new' ) )
                    // InternalMinijava.g:2186:5: (lv_expressionType_3_0= 'new' )
                    {
                    // InternalMinijava.g:2186:5: (lv_expressionType_3_0= 'new' )
                    // InternalMinijava.g:2187:6: lv_expressionType_3_0= 'new'
                    {
                    lv_expressionType_3_0=(Token)match(input,50,FOLLOW_38); 

                    						newLeafNode(lv_expressionType_3_0, grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_3_0, "new");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getIntKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalMinijava.g:2207:4: ( (lv_expression_6_0= ruleExpression ) )
                    // InternalMinijava.g:2208:5: (lv_expression_6_0= ruleExpression )
                    {
                    // InternalMinijava.g:2208:5: (lv_expression_6_0= ruleExpression )
                    // InternalMinijava.g:2209:6: lv_expression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMinijava.g:2232:3: ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' )
                    {
                    // InternalMinijava.g:2232:3: ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' )
                    // InternalMinijava.g:2233:4: ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')'
                    {
                    // InternalMinijava.g:2233:4: ( (lv_expressionType_8_0= 'new' ) )
                    // InternalMinijava.g:2234:5: (lv_expressionType_8_0= 'new' )
                    {
                    // InternalMinijava.g:2234:5: (lv_expressionType_8_0= 'new' )
                    // InternalMinijava.g:2235:6: lv_expressionType_8_0= 'new'
                    {
                    lv_expressionType_8_0=(Token)match(input,50,FOLLOW_25); 

                    						newLeafNode(lv_expressionType_8_0, grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_8_0, "new");
                    					

                    }


                    }

                    // InternalMinijava.g:2247:4: ( (lv_type_9_0= ruleType ) )
                    // InternalMinijava.g:2248:5: (lv_type_9_0= ruleType )
                    {
                    // InternalMinijava.g:2248:5: (lv_type_9_0= ruleType )
                    // InternalMinijava.g:2249:6: lv_type_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.xtext.test.minijava.Minijava.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2());
                    			
                    otherlv_11=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMinijava.g:2276:3: ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    {
                    // InternalMinijava.g:2276:3: ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    // InternalMinijava.g:2277:4: ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalMinijava.g:2277:4: ( (lv_expressionType_12_0= '(' ) )
                    // InternalMinijava.g:2278:5: (lv_expressionType_12_0= '(' )
                    {
                    // InternalMinijava.g:2278:5: (lv_expressionType_12_0= '(' )
                    // InternalMinijava.g:2279:6: lv_expressionType_12_0= '('
                    {
                    lv_expressionType_12_0=(Token)match(input,22,FOLLOW_28); 

                    						newLeafNode(lv_expressionType_12_0, grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_12_0, "(");
                    					

                    }


                    }

                    // InternalMinijava.g:2291:4: ( (lv_expression_13_0= ruleExpression ) )
                    // InternalMinijava.g:2292:5: (lv_expression_13_0= ruleExpression )
                    {
                    // InternalMinijava.g:2292:5: (lv_expression_13_0= ruleExpression )
                    // InternalMinijava.g:2293:6: lv_expression_13_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_expression_13_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_13_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMinijava.g:2316:3: ( (otherlv_15= RULE_ID ) )
                    {
                    // InternalMinijava.g:2316:3: ( (otherlv_15= RULE_ID ) )
                    // InternalMinijava.g:2317:4: (otherlv_15= RULE_ID )
                    {
                    // InternalMinijava.g:2317:4: (otherlv_15= RULE_ID )
                    // InternalMinijava.g:2318:5: otherlv_15= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    				
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_6_0());
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMinijava.g:2330:3: ( (lv_number_16_0= ruleNumberValue ) )
                    {
                    // InternalMinijava.g:2330:3: ( (lv_number_16_0= ruleNumberValue ) )
                    // InternalMinijava.g:2331:4: (lv_number_16_0= ruleNumberValue )
                    {
                    // InternalMinijava.g:2331:4: (lv_number_16_0= ruleNumberValue )
                    // InternalMinijava.g:2332:5: lv_number_16_0= ruleNumberValue
                    {

                    					newCompositeNode(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_16_0=ruleNumberValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_16_0,
                    						"org.xtext.test.minijava.Minijava.NumberValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMethodCallExpr"
    // InternalMinijava.g:2353:1: entryRuleMethodCallExpr returns [EObject current=null] : iv_ruleMethodCallExpr= ruleMethodCallExpr EOF ;
    public final EObject entryRuleMethodCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCallExpr = null;


        try {
            // InternalMinijava.g:2353:55: (iv_ruleMethodCallExpr= ruleMethodCallExpr EOF )
            // InternalMinijava.g:2354:2: iv_ruleMethodCallExpr= ruleMethodCallExpr EOF
            {
             newCompositeNode(grammarAccess.getMethodCallExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCallExpr=ruleMethodCallExpr();

            state._fsp--;

             current =iv_ruleMethodCallExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCallExpr"


    // $ANTLR start "ruleMethodCallExpr"
    // InternalMinijava.g:2360:1: ruleMethodCallExpr returns [EObject current=null] : ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) ) ;
    public final EObject ruleMethodCallExpr() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_0_0=null;
        EObject lv_methodCall_1_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:2366:2: ( ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) ) )
            // InternalMinijava.g:2367:2: ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) )
            {
            // InternalMinijava.g:2367:2: ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMinijava.g:2368:3: ( (lv_expressionType_0_0= 'length' ) )
                    {
                    // InternalMinijava.g:2368:3: ( (lv_expressionType_0_0= 'length' ) )
                    // InternalMinijava.g:2369:4: (lv_expressionType_0_0= 'length' )
                    {
                    // InternalMinijava.g:2369:4: (lv_expressionType_0_0= 'length' )
                    // InternalMinijava.g:2370:5: lv_expressionType_0_0= 'length'
                    {
                    lv_expressionType_0_0=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_0_0, grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodCallExprRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_0_0, "length");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:2383:3: ( (lv_methodCall_1_0= ruleMethodCall ) )
                    {
                    // InternalMinijava.g:2383:3: ( (lv_methodCall_1_0= ruleMethodCall ) )
                    // InternalMinijava.g:2384:4: (lv_methodCall_1_0= ruleMethodCall )
                    {
                    // InternalMinijava.g:2384:4: (lv_methodCall_1_0= ruleMethodCall )
                    // InternalMinijava.g:2385:5: lv_methodCall_1_0= ruleMethodCall
                    {

                    					newCompositeNode(grammarAccess.getMethodCallExprAccess().getMethodCallMethodCallParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_methodCall_1_0=ruleMethodCall();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodCallExprRule());
                    					}
                    					set(
                    						current,
                    						"methodCall",
                    						lv_methodCall_1_0,
                    						"org.xtext.test.minijava.Minijava.MethodCall");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCallExpr"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMinijava.g:2406:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalMinijava.g:2406:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalMinijava.g:2407:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMinijava.g:2413:1: ruleMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMinijava.g:2419:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalMinijava.g:2420:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalMinijava.g:2420:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalMinijava.g:2421:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalMinijava.g:2421:3: ( (otherlv_0= RULE_ID ) )
            // InternalMinijava.g:2422:4: (otherlv_0= RULE_ID )
            {
            // InternalMinijava.g:2422:4: (otherlv_0= RULE_ID )
            // InternalMinijava.g:2423:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMinijava.g:2438:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||LA28_0==22||(LA28_0>=46 && LA28_0<=50)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMinijava.g:2439:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalMinijava.g:2439:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalMinijava.g:2440:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalMinijava.g:2440:5: (lv_parameters_2_0= ruleExpression )
                    // InternalMinijava.g:2441:6: lv_parameters_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_parameters_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"org.xtext.test.minijava.Minijava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMinijava.g:2458:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMinijava.g:2459:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_28); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMinijava.g:2463:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalMinijava.g:2464:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalMinijava.g:2464:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalMinijava.g:2465:7: lv_parameters_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_parameters_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"org.xtext.test.minijava.Minijava.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleNumberValue"
    // InternalMinijava.g:2492:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalMinijava.g:2492:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalMinijava.g:2493:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalMinijava.g:2499:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMinijava.g:2505:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMinijava.g:2506:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMinijava.g:2506:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMinijava.g:2507:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMinijava.g:2507:3: (lv_value_0_0= RULE_INT )
            // InternalMinijava.g:2508:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValue"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\3\uffff\1\26\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\62\3\uffff\1\41\3\uffff\1\30\1\uffff\1\62\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\uffff\1\5\1\uffff\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\7\20\uffff\1\5\30\uffff\1\1\1\2\1\3\1\4",
            "",
            "",
            "",
            "\1\11\21\uffff\1\11\7\uffff\1\10\3\11",
            "",
            "",
            "",
            "\1\11\1\uffff\1\12",
            "",
            "\2\13\20\uffff\1\13\2\uffff\1\11\24\uffff\5\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2138:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000AFC8460010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000FC8440010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003C0400010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000003C4400010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000BFC8460010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0007C00000400030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000AFC0460010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0007C00004400030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000004008000L});

}