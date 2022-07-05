package org.xtext.test.minijava.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.test.minijava.services.MinijavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMinijavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'protected'", "'private'", "'+'", "'-'", "'*'", "'&&'", "'package'", "';'", "'import'", "'.'", "','", "'class'", "'{'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'}'", "'extends'", "'implements'", "'int'", "'return'", "'else'", "'boolean'", "'double'", "'char'", "'if'", "'while'", "'='", "'<'", "'!'", "'true'", "'false'", "'this'", "'new'", "'length'"
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

    	public void setGrammarAccess(MinijavaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGoal"
    // InternalMinijava.g:53:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // InternalMinijava.g:54:1: ( ruleGoal EOF )
            // InternalMinijava.g:55:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalMinijava.g:62:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:66:2: ( ( ( rule__Goal__Group__0 ) ) )
            // InternalMinijava.g:67:2: ( ( rule__Goal__Group__0 ) )
            {
            // InternalMinijava.g:67:2: ( ( rule__Goal__Group__0 ) )
            // InternalMinijava.g:68:3: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // InternalMinijava.g:69:3: ( rule__Goal__Group__0 )
            // InternalMinijava.g:69:4: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRulePackageDecl"
    // InternalMinijava.g:78:1: entryRulePackageDecl : rulePackageDecl EOF ;
    public final void entryRulePackageDecl() throws RecognitionException {
        try {
            // InternalMinijava.g:79:1: ( rulePackageDecl EOF )
            // InternalMinijava.g:80:1: rulePackageDecl EOF
            {
             before(grammarAccess.getPackageDeclRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDecl();

            state._fsp--;

             after(grammarAccess.getPackageDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDecl"


    // $ANTLR start "rulePackageDecl"
    // InternalMinijava.g:87:1: rulePackageDecl : ( ( rule__PackageDecl__Group__0 ) ) ;
    public final void rulePackageDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:91:2: ( ( ( rule__PackageDecl__Group__0 ) ) )
            // InternalMinijava.g:92:2: ( ( rule__PackageDecl__Group__0 ) )
            {
            // InternalMinijava.g:92:2: ( ( rule__PackageDecl__Group__0 ) )
            // InternalMinijava.g:93:3: ( rule__PackageDecl__Group__0 )
            {
             before(grammarAccess.getPackageDeclAccess().getGroup()); 
            // InternalMinijava.g:94:3: ( rule__PackageDecl__Group__0 )
            // InternalMinijava.g:94:4: rule__PackageDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDecl"


    // $ANTLR start "entryRuleImportDecl"
    // InternalMinijava.g:103:1: entryRuleImportDecl : ruleImportDecl EOF ;
    public final void entryRuleImportDecl() throws RecognitionException {
        try {
            // InternalMinijava.g:104:1: ( ruleImportDecl EOF )
            // InternalMinijava.g:105:1: ruleImportDecl EOF
            {
             before(grammarAccess.getImportDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleImportDecl();

            state._fsp--;

             after(grammarAccess.getImportDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportDecl"


    // $ANTLR start "ruleImportDecl"
    // InternalMinijava.g:112:1: ruleImportDecl : ( ( rule__ImportDecl__Group__0 ) ) ;
    public final void ruleImportDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:116:2: ( ( ( rule__ImportDecl__Group__0 ) ) )
            // InternalMinijava.g:117:2: ( ( rule__ImportDecl__Group__0 ) )
            {
            // InternalMinijava.g:117:2: ( ( rule__ImportDecl__Group__0 ) )
            // InternalMinijava.g:118:3: ( rule__ImportDecl__Group__0 )
            {
             before(grammarAccess.getImportDeclAccess().getGroup()); 
            // InternalMinijava.g:119:3: ( rule__ImportDecl__Group__0 )
            // InternalMinijava.g:119:4: rule__ImportDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportDecl"


    // $ANTLR start "entryRuleQualifiedName_"
    // InternalMinijava.g:128:1: entryRuleQualifiedName_ : ruleQualifiedName_ EOF ;
    public final void entryRuleQualifiedName_() throws RecognitionException {
        try {
            // InternalMinijava.g:129:1: ( ruleQualifiedName_ EOF )
            // InternalMinijava.g:130:1: ruleQualifiedName_ EOF
            {
             before(grammarAccess.getQualifiedName_Rule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName_();

            state._fsp--;

             after(grammarAccess.getQualifiedName_Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName_"


    // $ANTLR start "ruleQualifiedName_"
    // InternalMinijava.g:137:1: ruleQualifiedName_ : ( ( rule__QualifiedName___Group__0 ) ) ;
    public final void ruleQualifiedName_() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:141:2: ( ( ( rule__QualifiedName___Group__0 ) ) )
            // InternalMinijava.g:142:2: ( ( rule__QualifiedName___Group__0 ) )
            {
            // InternalMinijava.g:142:2: ( ( rule__QualifiedName___Group__0 ) )
            // InternalMinijava.g:143:3: ( rule__QualifiedName___Group__0 )
            {
             before(grammarAccess.getQualifiedName_Access().getGroup()); 
            // InternalMinijava.g:144:3: ( rule__QualifiedName___Group__0 )
            // InternalMinijava.g:144:4: rule__QualifiedName___Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName___Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedName_Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName_"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMinijava.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMinijava.g:154:1: ( ruleQualifiedName EOF )
            // InternalMinijava.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMinijava.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMinijava.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMinijava.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMinijava.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMinijava.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalMinijava.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameList"
    // InternalMinijava.g:178:1: entryRuleQualifiedNameList : ruleQualifiedNameList EOF ;
    public final void entryRuleQualifiedNameList() throws RecognitionException {
        try {
            // InternalMinijava.g:179:1: ( ruleQualifiedNameList EOF )
            // InternalMinijava.g:180:1: ruleQualifiedNameList EOF
            {
             before(grammarAccess.getQualifiedNameListRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameList();

            state._fsp--;

             after(grammarAccess.getQualifiedNameListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameList"


    // $ANTLR start "ruleQualifiedNameList"
    // InternalMinijava.g:187:1: ruleQualifiedNameList : ( ( rule__QualifiedNameList__Group__0 ) ) ;
    public final void ruleQualifiedNameList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:191:2: ( ( ( rule__QualifiedNameList__Group__0 ) ) )
            // InternalMinijava.g:192:2: ( ( rule__QualifiedNameList__Group__0 ) )
            {
            // InternalMinijava.g:192:2: ( ( rule__QualifiedNameList__Group__0 ) )
            // InternalMinijava.g:193:3: ( rule__QualifiedNameList__Group__0 )
            {
             before(grammarAccess.getQualifiedNameListAccess().getGroup()); 
            // InternalMinijava.g:194:3: ( rule__QualifiedNameList__Group__0 )
            // InternalMinijava.g:194:4: rule__QualifiedNameList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameList"


    // $ANTLR start "entryRuleQualifiedNameLi"
    // InternalMinijava.g:203:1: entryRuleQualifiedNameLi : ruleQualifiedNameLi EOF ;
    public final void entryRuleQualifiedNameLi() throws RecognitionException {
        try {
            // InternalMinijava.g:204:1: ( ruleQualifiedNameLi EOF )
            // InternalMinijava.g:205:1: ruleQualifiedNameLi EOF
            {
             before(grammarAccess.getQualifiedNameLiRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameLi();

            state._fsp--;

             after(grammarAccess.getQualifiedNameLiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameLi"


    // $ANTLR start "ruleQualifiedNameLi"
    // InternalMinijava.g:212:1: ruleQualifiedNameLi : ( ( rule__QualifiedNameLi__Group__0 ) ) ;
    public final void ruleQualifiedNameLi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:216:2: ( ( ( rule__QualifiedNameLi__Group__0 ) ) )
            // InternalMinijava.g:217:2: ( ( rule__QualifiedNameLi__Group__0 ) )
            {
            // InternalMinijava.g:217:2: ( ( rule__QualifiedNameLi__Group__0 ) )
            // InternalMinijava.g:218:3: ( rule__QualifiedNameLi__Group__0 )
            {
             before(grammarAccess.getQualifiedNameLiAccess().getGroup()); 
            // InternalMinijava.g:219:3: ( rule__QualifiedNameLi__Group__0 )
            // InternalMinijava.g:219:4: rule__QualifiedNameLi__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameLi__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameLiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameLi"


    // $ANTLR start "entryRuleMainClass"
    // InternalMinijava.g:228:1: entryRuleMainClass : ruleMainClass EOF ;
    public final void entryRuleMainClass() throws RecognitionException {
        try {
            // InternalMinijava.g:229:1: ( ruleMainClass EOF )
            // InternalMinijava.g:230:1: ruleMainClass EOF
            {
             before(grammarAccess.getMainClassRule()); 
            pushFollow(FOLLOW_1);
            ruleMainClass();

            state._fsp--;

             after(grammarAccess.getMainClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainClass"


    // $ANTLR start "ruleMainClass"
    // InternalMinijava.g:237:1: ruleMainClass : ( ( rule__MainClass__Group__0 ) ) ;
    public final void ruleMainClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:241:2: ( ( ( rule__MainClass__Group__0 ) ) )
            // InternalMinijava.g:242:2: ( ( rule__MainClass__Group__0 ) )
            {
            // InternalMinijava.g:242:2: ( ( rule__MainClass__Group__0 ) )
            // InternalMinijava.g:243:3: ( rule__MainClass__Group__0 )
            {
             before(grammarAccess.getMainClassAccess().getGroup()); 
            // InternalMinijava.g:244:3: ( rule__MainClass__Group__0 )
            // InternalMinijava.g:244:4: rule__MainClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainClass"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalMinijava.g:253:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalMinijava.g:254:1: ( ruleClassDeclaration EOF )
            // InternalMinijava.g:255:1: ruleClassDeclaration EOF
            {
             before(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalMinijava.g:262:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:266:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalMinijava.g:267:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalMinijava.g:267:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalMinijava.g:268:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalMinijava.g:269:3: ( rule__ClassDeclaration__Group__0 )
            // InternalMinijava.g:269:4: rule__ClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalMinijava.g:278:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMinijava.g:279:1: ( ruleType EOF )
            // InternalMinijava.g:280:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMinijava.g:287:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:291:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMinijava.g:292:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMinijava.g:292:2: ( ( rule__Type__Alternatives ) )
            // InternalMinijava.g:293:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMinijava.g:294:3: ( rule__Type__Alternatives )
            // InternalMinijava.g:294:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalMinijava.g:303:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalMinijava.g:304:1: ( ruleVarDeclaration EOF )
            // InternalMinijava.g:305:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalMinijava.g:312:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:316:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalMinijava.g:317:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalMinijava.g:317:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalMinijava.g:318:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalMinijava.g:319:3: ( rule__VarDeclaration__Group__0 )
            // InternalMinijava.g:319:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVariable"
    // InternalMinijava.g:328:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMinijava.g:329:1: ( ruleVariable EOF )
            // InternalMinijava.g:330:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMinijava.g:337:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:341:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMinijava.g:342:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMinijava.g:342:2: ( ( rule__Variable__Group__0 ) )
            // InternalMinijava.g:343:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMinijava.g:344:3: ( rule__Variable__Group__0 )
            // InternalMinijava.g:344:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarList"
    // InternalMinijava.g:353:1: entryRuleVarList : ruleVarList EOF ;
    public final void entryRuleVarList() throws RecognitionException {
        try {
            // InternalMinijava.g:354:1: ( ruleVarList EOF )
            // InternalMinijava.g:355:1: ruleVarList EOF
            {
             before(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            ruleVarList();

            state._fsp--;

             after(grammarAccess.getVarListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalMinijava.g:362:1: ruleVarList : ( ( rule__VarList__Group__0 ) ) ;
    public final void ruleVarList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:366:2: ( ( ( rule__VarList__Group__0 ) ) )
            // InternalMinijava.g:367:2: ( ( rule__VarList__Group__0 ) )
            {
            // InternalMinijava.g:367:2: ( ( rule__VarList__Group__0 ) )
            // InternalMinijava.g:368:3: ( rule__VarList__Group__0 )
            {
             before(grammarAccess.getVarListAccess().getGroup()); 
            // InternalMinijava.g:369:3: ( rule__VarList__Group__0 )
            // InternalMinijava.g:369:4: rule__VarList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleVarLi"
    // InternalMinijava.g:378:1: entryRuleVarLi : ruleVarLi EOF ;
    public final void entryRuleVarLi() throws RecognitionException {
        try {
            // InternalMinijava.g:379:1: ( ruleVarLi EOF )
            // InternalMinijava.g:380:1: ruleVarLi EOF
            {
             before(grammarAccess.getVarLiRule()); 
            pushFollow(FOLLOW_1);
            ruleVarLi();

            state._fsp--;

             after(grammarAccess.getVarLiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarLi"


    // $ANTLR start "ruleVarLi"
    // InternalMinijava.g:387:1: ruleVarLi : ( ( rule__VarLi__Group__0 ) ) ;
    public final void ruleVarLi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:391:2: ( ( ( rule__VarLi__Group__0 ) ) )
            // InternalMinijava.g:392:2: ( ( rule__VarLi__Group__0 ) )
            {
            // InternalMinijava.g:392:2: ( ( rule__VarLi__Group__0 ) )
            // InternalMinijava.g:393:3: ( rule__VarLi__Group__0 )
            {
             before(grammarAccess.getVarLiAccess().getGroup()); 
            // InternalMinijava.g:394:3: ( rule__VarLi__Group__0 )
            // InternalMinijava.g:394:4: rule__VarLi__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarLi__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarLiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarLi"


    // $ANTLR start "entryRuleMethodDeclaration"
    // InternalMinijava.g:403:1: entryRuleMethodDeclaration : ruleMethodDeclaration EOF ;
    public final void entryRuleMethodDeclaration() throws RecognitionException {
        try {
            // InternalMinijava.g:404:1: ( ruleMethodDeclaration EOF )
            // InternalMinijava.g:405:1: ruleMethodDeclaration EOF
            {
             before(grammarAccess.getMethodDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // InternalMinijava.g:412:1: ruleMethodDeclaration : ( ( rule__MethodDeclaration__Group__0 ) ) ;
    public final void ruleMethodDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:416:2: ( ( ( rule__MethodDeclaration__Group__0 ) ) )
            // InternalMinijava.g:417:2: ( ( rule__MethodDeclaration__Group__0 ) )
            {
            // InternalMinijava.g:417:2: ( ( rule__MethodDeclaration__Group__0 ) )
            // InternalMinijava.g:418:3: ( rule__MethodDeclaration__Group__0 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup()); 
            // InternalMinijava.g:419:3: ( rule__MethodDeclaration__Group__0 )
            // InternalMinijava.g:419:4: rule__MethodDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleStatement"
    // InternalMinijava.g:428:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMinijava.g:429:1: ( ruleStatement EOF )
            // InternalMinijava.g:430:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMinijava.g:437:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:441:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMinijava.g:442:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMinijava.g:442:2: ( ( rule__Statement__Alternatives ) )
            // InternalMinijava.g:443:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMinijava.g:444:3: ( rule__Statement__Alternatives )
            // InternalMinijava.g:444:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMinijava.g:453:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMinijava.g:454:1: ( ruleExpression EOF )
            // InternalMinijava.g:455:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMinijava.g:462:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:466:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMinijava.g:467:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMinijava.g:467:2: ( ( rule__Expression__Group__0 ) )
            // InternalMinijava.g:468:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMinijava.g:469:3: ( rule__Expression__Group__0 )
            // InternalMinijava.g:469:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalMinijava.g:478:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalMinijava.g:479:1: ( ruleAddition EOF )
            // InternalMinijava.g:480:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMinijava.g:487:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:491:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalMinijava.g:492:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalMinijava.g:492:2: ( ( rule__Addition__Group__0 ) )
            // InternalMinijava.g:493:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalMinijava.g:494:3: ( rule__Addition__Group__0 )
            // InternalMinijava.g:494:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMinijava.g:503:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalMinijava.g:504:1: ( ruleMultiplication EOF )
            // InternalMinijava.g:505:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMinijava.g:512:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:516:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalMinijava.g:517:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalMinijava.g:517:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalMinijava.g:518:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalMinijava.g:519:3: ( rule__Multiplication__Group__0 )
            // InternalMinijava.g:519:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNegationOrPointExpression"
    // InternalMinijava.g:528:1: entryRuleNegationOrPointExpression : ruleNegationOrPointExpression EOF ;
    public final void entryRuleNegationOrPointExpression() throws RecognitionException {
        try {
            // InternalMinijava.g:529:1: ( ruleNegationOrPointExpression EOF )
            // InternalMinijava.g:530:1: ruleNegationOrPointExpression EOF
            {
             before(grammarAccess.getNegationOrPointExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNegationOrPointExpression();

            state._fsp--;

             after(grammarAccess.getNegationOrPointExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegationOrPointExpression"


    // $ANTLR start "ruleNegationOrPointExpression"
    // InternalMinijava.g:537:1: ruleNegationOrPointExpression : ( ( rule__NegationOrPointExpression__Alternatives ) ) ;
    public final void ruleNegationOrPointExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:541:2: ( ( ( rule__NegationOrPointExpression__Alternatives ) ) )
            // InternalMinijava.g:542:2: ( ( rule__NegationOrPointExpression__Alternatives ) )
            {
            // InternalMinijava.g:542:2: ( ( rule__NegationOrPointExpression__Alternatives ) )
            // InternalMinijava.g:543:3: ( rule__NegationOrPointExpression__Alternatives )
            {
             before(grammarAccess.getNegationOrPointExpressionAccess().getAlternatives()); 
            // InternalMinijava.g:544:3: ( rule__NegationOrPointExpression__Alternatives )
            // InternalMinijava.g:544:4: rule__NegationOrPointExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NegationOrPointExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNegationOrPointExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegationOrPointExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalMinijava.g:553:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalMinijava.g:554:1: ( ruleNegation EOF )
            // InternalMinijava.g:555:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMinijava.g:562:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:566:2: ( ( ( rule__Negation__Group__0 ) ) )
            // InternalMinijava.g:567:2: ( ( rule__Negation__Group__0 ) )
            {
            // InternalMinijava.g:567:2: ( ( rule__Negation__Group__0 ) )
            // InternalMinijava.g:568:3: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // InternalMinijava.g:569:3: ( rule__Negation__Group__0 )
            // InternalMinijava.g:569:4: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRulePoint"
    // InternalMinijava.g:578:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalMinijava.g:579:1: ( rulePoint EOF )
            // InternalMinijava.g:580:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalMinijava.g:587:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:591:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalMinijava.g:592:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalMinijava.g:592:2: ( ( rule__Point__Group__0 ) )
            // InternalMinijava.g:593:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalMinijava.g:594:3: ( rule__Point__Group__0 )
            // InternalMinijava.g:594:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleSquareBrackets"
    // InternalMinijava.g:603:1: entryRuleSquareBrackets : ruleSquareBrackets EOF ;
    public final void entryRuleSquareBrackets() throws RecognitionException {
        try {
            // InternalMinijava.g:604:1: ( ruleSquareBrackets EOF )
            // InternalMinijava.g:605:1: ruleSquareBrackets EOF
            {
             before(grammarAccess.getSquareBracketsRule()); 
            pushFollow(FOLLOW_1);
            ruleSquareBrackets();

            state._fsp--;

             after(grammarAccess.getSquareBracketsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSquareBrackets"


    // $ANTLR start "ruleSquareBrackets"
    // InternalMinijava.g:612:1: ruleSquareBrackets : ( ( rule__SquareBrackets__Group__0 ) ) ;
    public final void ruleSquareBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:616:2: ( ( ( rule__SquareBrackets__Group__0 ) ) )
            // InternalMinijava.g:617:2: ( ( rule__SquareBrackets__Group__0 ) )
            {
            // InternalMinijava.g:617:2: ( ( rule__SquareBrackets__Group__0 ) )
            // InternalMinijava.g:618:3: ( rule__SquareBrackets__Group__0 )
            {
             before(grammarAccess.getSquareBracketsAccess().getGroup()); 
            // InternalMinijava.g:619:3: ( rule__SquareBrackets__Group__0 )
            // InternalMinijava.g:619:4: rule__SquareBrackets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSquareBracketsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquareBrackets"


    // $ANTLR start "entryRulePrimary"
    // InternalMinijava.g:628:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMinijava.g:629:1: ( rulePrimary EOF )
            // InternalMinijava.g:630:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMinijava.g:637:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:641:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMinijava.g:642:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMinijava.g:642:2: ( ( rule__Primary__Alternatives ) )
            // InternalMinijava.g:643:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMinijava.g:644:3: ( rule__Primary__Alternatives )
            // InternalMinijava.g:644:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMethodCallExpr"
    // InternalMinijava.g:653:1: entryRuleMethodCallExpr : ruleMethodCallExpr EOF ;
    public final void entryRuleMethodCallExpr() throws RecognitionException {
        try {
            // InternalMinijava.g:654:1: ( ruleMethodCallExpr EOF )
            // InternalMinijava.g:655:1: ruleMethodCallExpr EOF
            {
             before(grammarAccess.getMethodCallExprRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodCallExpr();

            state._fsp--;

             after(grammarAccess.getMethodCallExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodCallExpr"


    // $ANTLR start "ruleMethodCallExpr"
    // InternalMinijava.g:662:1: ruleMethodCallExpr : ( ( rule__MethodCallExpr__Alternatives ) ) ;
    public final void ruleMethodCallExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:666:2: ( ( ( rule__MethodCallExpr__Alternatives ) ) )
            // InternalMinijava.g:667:2: ( ( rule__MethodCallExpr__Alternatives ) )
            {
            // InternalMinijava.g:667:2: ( ( rule__MethodCallExpr__Alternatives ) )
            // InternalMinijava.g:668:3: ( rule__MethodCallExpr__Alternatives )
            {
             before(grammarAccess.getMethodCallExprAccess().getAlternatives()); 
            // InternalMinijava.g:669:3: ( rule__MethodCallExpr__Alternatives )
            // InternalMinijava.g:669:4: rule__MethodCallExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MethodCallExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCallExpr"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMinijava.g:678:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalMinijava.g:679:1: ( ruleMethodCall EOF )
            // InternalMinijava.g:680:1: ruleMethodCall EOF
            {
             before(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getMethodCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMinijava.g:687:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:691:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalMinijava.g:692:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalMinijava.g:692:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalMinijava.g:693:3: ( rule__MethodCall__Group__0 )
            {
             before(grammarAccess.getMethodCallAccess().getGroup()); 
            // InternalMinijava.g:694:3: ( rule__MethodCall__Group__0 )
            // InternalMinijava.g:694:4: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleNumberValue"
    // InternalMinijava.g:703:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalMinijava.g:704:1: ( ruleNumberValue EOF )
            // InternalMinijava.g:705:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalMinijava.g:712:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:716:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalMinijava.g:717:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalMinijava.g:717:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalMinijava.g:718:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalMinijava.g:719:3: ( rule__NumberValue__ValueAssignment )
            // InternalMinijava.g:719:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "rule__MainClass__Alternatives_14"
    // InternalMinijava.g:727:1: rule__MainClass__Alternatives_14 : ( ( ( rule__MainClass__VarDeclarationsAssignment_14_0 ) ) | ( ( rule__MainClass__MethodDeclarationsAssignment_14_1 ) ) | ( ( rule__MainClass__StatementAssignment_14_2 ) ) );
    public final void rule__MainClass__Alternatives_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:731:1: ( ( ( rule__MainClass__VarDeclarationsAssignment_14_0 ) ) | ( ( rule__MainClass__MethodDeclarationsAssignment_14_1 ) ) | ( ( rule__MainClass__StatementAssignment_14_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 28:
            case 36:
            case 39:
            case 40:
            case 41:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==30||LA1_2==44) ) {
                    alt1=3;
                }
                else if ( (LA1_2==21) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 11:
            case 12:
            case 13:
                {
                alt1=2;
                }
                break;
            case 24:
            case 42:
            case 43:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMinijava.g:732:2: ( ( rule__MainClass__VarDeclarationsAssignment_14_0 ) )
                    {
                    // InternalMinijava.g:732:2: ( ( rule__MainClass__VarDeclarationsAssignment_14_0 ) )
                    // InternalMinijava.g:733:3: ( rule__MainClass__VarDeclarationsAssignment_14_0 )
                    {
                     before(grammarAccess.getMainClassAccess().getVarDeclarationsAssignment_14_0()); 
                    // InternalMinijava.g:734:3: ( rule__MainClass__VarDeclarationsAssignment_14_0 )
                    // InternalMinijava.g:734:4: rule__MainClass__VarDeclarationsAssignment_14_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainClass__VarDeclarationsAssignment_14_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainClassAccess().getVarDeclarationsAssignment_14_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:738:2: ( ( rule__MainClass__MethodDeclarationsAssignment_14_1 ) )
                    {
                    // InternalMinijava.g:738:2: ( ( rule__MainClass__MethodDeclarationsAssignment_14_1 ) )
                    // InternalMinijava.g:739:3: ( rule__MainClass__MethodDeclarationsAssignment_14_1 )
                    {
                     before(grammarAccess.getMainClassAccess().getMethodDeclarationsAssignment_14_1()); 
                    // InternalMinijava.g:740:3: ( rule__MainClass__MethodDeclarationsAssignment_14_1 )
                    // InternalMinijava.g:740:4: rule__MainClass__MethodDeclarationsAssignment_14_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainClass__MethodDeclarationsAssignment_14_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainClassAccess().getMethodDeclarationsAssignment_14_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:744:2: ( ( rule__MainClass__StatementAssignment_14_2 ) )
                    {
                    // InternalMinijava.g:744:2: ( ( rule__MainClass__StatementAssignment_14_2 ) )
                    // InternalMinijava.g:745:3: ( rule__MainClass__StatementAssignment_14_2 )
                    {
                     before(grammarAccess.getMainClassAccess().getStatementAssignment_14_2()); 
                    // InternalMinijava.g:746:3: ( rule__MainClass__StatementAssignment_14_2 )
                    // InternalMinijava.g:746:4: rule__MainClass__StatementAssignment_14_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainClass__StatementAssignment_14_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainClassAccess().getStatementAssignment_14_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Alternatives_14"


    // $ANTLR start "rule__ClassDeclaration__Alternatives_5"
    // InternalMinijava.g:754:1: rule__ClassDeclaration__Alternatives_5 : ( ( ( rule__ClassDeclaration__VarDeclarationsAssignment_5_0 ) ) | ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5_1 ) ) );
    public final void rule__ClassDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:758:1: ( ( ( rule__ClassDeclaration__VarDeclarationsAssignment_5_0 ) ) | ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==28||LA2_0==36||(LA2_0>=39 && LA2_0<=41)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMinijava.g:759:2: ( ( rule__ClassDeclaration__VarDeclarationsAssignment_5_0 ) )
                    {
                    // InternalMinijava.g:759:2: ( ( rule__ClassDeclaration__VarDeclarationsAssignment_5_0 ) )
                    // InternalMinijava.g:760:3: ( rule__ClassDeclaration__VarDeclarationsAssignment_5_0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getVarDeclarationsAssignment_5_0()); 
                    // InternalMinijava.g:761:3: ( rule__ClassDeclaration__VarDeclarationsAssignment_5_0 )
                    // InternalMinijava.g:761:4: rule__ClassDeclaration__VarDeclarationsAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__VarDeclarationsAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDeclarationAccess().getVarDeclarationsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:765:2: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5_1 ) )
                    {
                    // InternalMinijava.g:765:2: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5_1 ) )
                    // InternalMinijava.g:766:3: ( rule__ClassDeclaration__MethodDeclarationsAssignment_5_1 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_5_1()); 
                    // InternalMinijava.g:767:3: ( rule__ClassDeclaration__MethodDeclarationsAssignment_5_1 )
                    // InternalMinijava.g:767:4: rule__ClassDeclaration__MethodDeclarationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__MethodDeclarationsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Alternatives_5"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMinijava.g:775:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__TypeNameAssignment_1 ) ) | ( ( rule__Type__TypeNameAssignment_2 ) ) | ( ( rule__Type__TypeNameAssignment_3 ) ) | ( ( rule__Type__TypeNameAssignment_4 ) ) | ( ( rule__Type__QualifiedNameAssignment_5 ) ) | ( ( rule__Type__Group_6__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:779:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__TypeNameAssignment_1 ) ) | ( ( rule__Type__TypeNameAssignment_2 ) ) | ( ( rule__Type__TypeNameAssignment_3 ) ) | ( ( rule__Type__TypeNameAssignment_4 ) ) | ( ( rule__Type__QualifiedNameAssignment_5 ) ) | ( ( rule__Type__Group_6__0 ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||LA3_1==28) ) {
                    alt3=2;
                }
                else if ( (LA3_1==30) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 41:
                {
                alt3=5;
                }
                break;
            case RULE_ID:
                {
                alt3=6;
                }
                break;
            case 28:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMinijava.g:780:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalMinijava.g:780:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalMinijava.g:781:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalMinijava.g:782:3: ( rule__Type__Group_0__0 )
                    // InternalMinijava.g:782:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:786:2: ( ( rule__Type__TypeNameAssignment_1 ) )
                    {
                    // InternalMinijava.g:786:2: ( ( rule__Type__TypeNameAssignment_1 ) )
                    // InternalMinijava.g:787:3: ( rule__Type__TypeNameAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_1()); 
                    // InternalMinijava.g:788:3: ( rule__Type__TypeNameAssignment_1 )
                    // InternalMinijava.g:788:4: rule__Type__TypeNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:792:2: ( ( rule__Type__TypeNameAssignment_2 ) )
                    {
                    // InternalMinijava.g:792:2: ( ( rule__Type__TypeNameAssignment_2 ) )
                    // InternalMinijava.g:793:3: ( rule__Type__TypeNameAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_2()); 
                    // InternalMinijava.g:794:3: ( rule__Type__TypeNameAssignment_2 )
                    // InternalMinijava.g:794:4: rule__Type__TypeNameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeNameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMinijava.g:798:2: ( ( rule__Type__TypeNameAssignment_3 ) )
                    {
                    // InternalMinijava.g:798:2: ( ( rule__Type__TypeNameAssignment_3 ) )
                    // InternalMinijava.g:799:3: ( rule__Type__TypeNameAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_3()); 
                    // InternalMinijava.g:800:3: ( rule__Type__TypeNameAssignment_3 )
                    // InternalMinijava.g:800:4: rule__Type__TypeNameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeNameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMinijava.g:804:2: ( ( rule__Type__TypeNameAssignment_4 ) )
                    {
                    // InternalMinijava.g:804:2: ( ( rule__Type__TypeNameAssignment_4 ) )
                    // InternalMinijava.g:805:3: ( rule__Type__TypeNameAssignment_4 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_4()); 
                    // InternalMinijava.g:806:3: ( rule__Type__TypeNameAssignment_4 )
                    // InternalMinijava.g:806:4: rule__Type__TypeNameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeNameAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeNameAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMinijava.g:810:2: ( ( rule__Type__QualifiedNameAssignment_5 ) )
                    {
                    // InternalMinijava.g:810:2: ( ( rule__Type__QualifiedNameAssignment_5 ) )
                    // InternalMinijava.g:811:3: ( rule__Type__QualifiedNameAssignment_5 )
                    {
                     before(grammarAccess.getTypeAccess().getQualifiedNameAssignment_5()); 
                    // InternalMinijava.g:812:3: ( rule__Type__QualifiedNameAssignment_5 )
                    // InternalMinijava.g:812:4: rule__Type__QualifiedNameAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__QualifiedNameAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getQualifiedNameAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMinijava.g:816:2: ( ( rule__Type__Group_6__0 ) )
                    {
                    // InternalMinijava.g:816:2: ( ( rule__Type__Group_6__0 ) )
                    // InternalMinijava.g:817:3: ( rule__Type__Group_6__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_6()); 
                    // InternalMinijava.g:818:3: ( rule__Type__Group_6__0 )
                    // InternalMinijava.g:818:4: rule__Type__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__MethodDeclaration__Alternatives_0"
    // InternalMinijava.g:826:1: rule__MethodDeclaration__Alternatives_0 : ( ( 'public' ) | ( 'protected' ) | ( 'private' ) );
    public final void rule__MethodDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:830:1: ( ( 'public' ) | ( 'protected' ) | ( 'private' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMinijava.g:831:2: ( 'public' )
                    {
                    // InternalMinijava.g:831:2: ( 'public' )
                    // InternalMinijava.g:832:3: 'public'
                    {
                     before(grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:837:2: ( 'protected' )
                    {
                    // InternalMinijava.g:837:2: ( 'protected' )
                    // InternalMinijava.g:838:3: 'protected'
                    {
                     before(grammarAccess.getMethodDeclarationAccess().getProtectedKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMethodDeclarationAccess().getProtectedKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:843:2: ( 'private' )
                    {
                    // InternalMinijava.g:843:2: ( 'private' )
                    // InternalMinijava.g:844:3: 'private'
                    {
                     before(grammarAccess.getMethodDeclarationAccess().getPrivateKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMethodDeclarationAccess().getPrivateKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Alternatives_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMinijava.g:853:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:857:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==44) ) {
                    alt5=4;
                }
                else if ( (LA5_4==30) ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMinijava.g:858:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalMinijava.g:858:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalMinijava.g:859:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalMinijava.g:860:3: ( rule__Statement__Group_0__0 )
                    // InternalMinijava.g:860:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:864:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalMinijava.g:864:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalMinijava.g:865:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalMinijava.g:866:3: ( rule__Statement__Group_1__0 )
                    // InternalMinijava.g:866:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:870:2: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // InternalMinijava.g:870:2: ( ( rule__Statement__Group_2__0 ) )
                    // InternalMinijava.g:871:3: ( rule__Statement__Group_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2()); 
                    // InternalMinijava.g:872:3: ( rule__Statement__Group_2__0 )
                    // InternalMinijava.g:872:4: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMinijava.g:876:2: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // InternalMinijava.g:876:2: ( ( rule__Statement__Group_3__0 ) )
                    // InternalMinijava.g:877:3: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // InternalMinijava.g:878:3: ( rule__Statement__Group_3__0 )
                    // InternalMinijava.g:878:4: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMinijava.g:882:2: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // InternalMinijava.g:882:2: ( ( rule__Statement__Group_4__0 ) )
                    // InternalMinijava.g:883:3: ( rule__Statement__Group_4__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_4()); 
                    // InternalMinijava.g:884:3: ( rule__Statement__Group_4__0 )
                    // InternalMinijava.g:884:4: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Addition__ExpressionTypeAlternatives_1_1_0"
    // InternalMinijava.g:892:1: rule__Addition__ExpressionTypeAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__ExpressionTypeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:896:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMinijava.g:897:2: ( '+' )
                    {
                    // InternalMinijava.g:897:2: ( '+' )
                    // InternalMinijava.g:898:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:903:2: ( '-' )
                    {
                    // InternalMinijava.g:903:2: ( '-' )
                    // InternalMinijava.g:904:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getExpressionTypeHyphenMinusKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getExpressionTypeHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__ExpressionTypeAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__ExpressionTypeAlternatives_1_1_0"
    // InternalMinijava.g:913:1: rule__Multiplication__ExpressionTypeAlternatives_1_1_0 : ( ( '*' ) | ( '&&' ) );
    public final void rule__Multiplication__ExpressionTypeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:917:1: ( ( '*' ) | ( '&&' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMinijava.g:918:2: ( '*' )
                    {
                    // InternalMinijava.g:918:2: ( '*' )
                    // InternalMinijava.g:919:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:924:2: ( '&&' )
                    {
                    // InternalMinijava.g:924:2: ( '&&' )
                    // InternalMinijava.g:925:3: '&&'
                    {
                     before(grammarAccess.getMultiplicationAccess().getExpressionTypeAmpersandAmpersandKeyword_1_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getExpressionTypeAmpersandAmpersandKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__ExpressionTypeAlternatives_1_1_0"


    // $ANTLR start "rule__NegationOrPointExpression__Alternatives"
    // InternalMinijava.g:934:1: rule__NegationOrPointExpression__Alternatives : ( ( ruleNegation ) | ( ( rule__NegationOrPointExpression__PointAssignment_1 ) ) );
    public final void rule__NegationOrPointExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:938:1: ( ( ruleNegation ) | ( ( rule__NegationOrPointExpression__PointAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==46) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||LA8_0==28||(LA8_0>=47 && LA8_0<=50)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMinijava.g:939:2: ( ruleNegation )
                    {
                    // InternalMinijava.g:939:2: ( ruleNegation )
                    // InternalMinijava.g:940:3: ruleNegation
                    {
                     before(grammarAccess.getNegationOrPointExpressionAccess().getNegationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getNegationOrPointExpressionAccess().getNegationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:945:2: ( ( rule__NegationOrPointExpression__PointAssignment_1 ) )
                    {
                    // InternalMinijava.g:945:2: ( ( rule__NegationOrPointExpression__PointAssignment_1 ) )
                    // InternalMinijava.g:946:3: ( rule__NegationOrPointExpression__PointAssignment_1 )
                    {
                     before(grammarAccess.getNegationOrPointExpressionAccess().getPointAssignment_1()); 
                    // InternalMinijava.g:947:3: ( rule__NegationOrPointExpression__PointAssignment_1 )
                    // InternalMinijava.g:947:4: rule__NegationOrPointExpression__PointAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NegationOrPointExpression__PointAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNegationOrPointExpressionAccess().getPointAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegationOrPointExpression__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMinijava.g:955:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__VariableAssignment_6 ) ) | ( ( rule__Primary__NumberAssignment_7 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:959:1: ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__VariableAssignment_6 ) ) | ( ( rule__Primary__NumberAssignment_7 ) ) )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMinijava.g:960:2: ( ( rule__Primary__ExpressionTypeAssignment_0 ) )
                    {
                    // InternalMinijava.g:960:2: ( ( rule__Primary__ExpressionTypeAssignment_0 ) )
                    // InternalMinijava.g:961:3: ( rule__Primary__ExpressionTypeAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_0()); 
                    // InternalMinijava.g:962:3: ( rule__Primary__ExpressionTypeAssignment_0 )
                    // InternalMinijava.g:962:4: rule__Primary__ExpressionTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ExpressionTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:966:2: ( ( rule__Primary__ExpressionTypeAssignment_1 ) )
                    {
                    // InternalMinijava.g:966:2: ( ( rule__Primary__ExpressionTypeAssignment_1 ) )
                    // InternalMinijava.g:967:3: ( rule__Primary__ExpressionTypeAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_1()); 
                    // InternalMinijava.g:968:3: ( rule__Primary__ExpressionTypeAssignment_1 )
                    // InternalMinijava.g:968:4: rule__Primary__ExpressionTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ExpressionTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMinijava.g:972:2: ( ( rule__Primary__ExpressionTypeAssignment_2 ) )
                    {
                    // InternalMinijava.g:972:2: ( ( rule__Primary__ExpressionTypeAssignment_2 ) )
                    // InternalMinijava.g:973:3: ( rule__Primary__ExpressionTypeAssignment_2 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_2()); 
                    // InternalMinijava.g:974:3: ( rule__Primary__ExpressionTypeAssignment_2 )
                    // InternalMinijava.g:974:4: rule__Primary__ExpressionTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ExpressionTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMinijava.g:978:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalMinijava.g:978:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalMinijava.g:979:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalMinijava.g:980:3: ( rule__Primary__Group_3__0 )
                    // InternalMinijava.g:980:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMinijava.g:984:2: ( ( rule__Primary__Group_4__0 ) )
                    {
                    // InternalMinijava.g:984:2: ( ( rule__Primary__Group_4__0 ) )
                    // InternalMinijava.g:985:3: ( rule__Primary__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    // InternalMinijava.g:986:3: ( rule__Primary__Group_4__0 )
                    // InternalMinijava.g:986:4: rule__Primary__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMinijava.g:990:2: ( ( rule__Primary__Group_5__0 ) )
                    {
                    // InternalMinijava.g:990:2: ( ( rule__Primary__Group_5__0 ) )
                    // InternalMinijava.g:991:3: ( rule__Primary__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_5()); 
                    // InternalMinijava.g:992:3: ( rule__Primary__Group_5__0 )
                    // InternalMinijava.g:992:4: rule__Primary__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMinijava.g:996:2: ( ( rule__Primary__VariableAssignment_6 ) )
                    {
                    // InternalMinijava.g:996:2: ( ( rule__Primary__VariableAssignment_6 ) )
                    // InternalMinijava.g:997:3: ( rule__Primary__VariableAssignment_6 )
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableAssignment_6()); 
                    // InternalMinijava.g:998:3: ( rule__Primary__VariableAssignment_6 )
                    // InternalMinijava.g:998:4: rule__Primary__VariableAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__VariableAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getVariableAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMinijava.g:1002:2: ( ( rule__Primary__NumberAssignment_7 ) )
                    {
                    // InternalMinijava.g:1002:2: ( ( rule__Primary__NumberAssignment_7 ) )
                    // InternalMinijava.g:1003:3: ( rule__Primary__NumberAssignment_7 )
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberAssignment_7()); 
                    // InternalMinijava.g:1004:3: ( rule__Primary__NumberAssignment_7 )
                    // InternalMinijava.g:1004:4: rule__Primary__NumberAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__NumberAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getNumberAssignment_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MethodCallExpr__Alternatives"
    // InternalMinijava.g:1012:1: rule__MethodCallExpr__Alternatives : ( ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) ) | ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) ) );
    public final void rule__MethodCallExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1016:1: ( ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) ) | ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMinijava.g:1017:2: ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) )
                    {
                    // InternalMinijava.g:1017:2: ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) )
                    // InternalMinijava.g:1018:3: ( rule__MethodCallExpr__ExpressionTypeAssignment_0 )
                    {
                     before(grammarAccess.getMethodCallExprAccess().getExpressionTypeAssignment_0()); 
                    // InternalMinijava.g:1019:3: ( rule__MethodCallExpr__ExpressionTypeAssignment_0 )
                    // InternalMinijava.g:1019:4: rule__MethodCallExpr__ExpressionTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCallExpr__ExpressionTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodCallExprAccess().getExpressionTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinijava.g:1023:2: ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) )
                    {
                    // InternalMinijava.g:1023:2: ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) )
                    // InternalMinijava.g:1024:3: ( rule__MethodCallExpr__MethodCallAssignment_1 )
                    {
                     before(grammarAccess.getMethodCallExprAccess().getMethodCallAssignment_1()); 
                    // InternalMinijava.g:1025:3: ( rule__MethodCallExpr__MethodCallAssignment_1 )
                    // InternalMinijava.g:1025:4: rule__MethodCallExpr__MethodCallAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCallExpr__MethodCallAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodCallExprAccess().getMethodCallAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCallExpr__Alternatives"


    // $ANTLR start "rule__Goal__Group__0"
    // InternalMinijava.g:1033:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1037:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // InternalMinijava.g:1038:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Goal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0"


    // $ANTLR start "rule__Goal__Group__0__Impl"
    // InternalMinijava.g:1045:1: rule__Goal__Group__0__Impl : ( ( rule__Goal__PackageAssignment_0 )? ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1049:1: ( ( ( rule__Goal__PackageAssignment_0 )? ) )
            // InternalMinijava.g:1050:1: ( ( rule__Goal__PackageAssignment_0 )? )
            {
            // InternalMinijava.g:1050:1: ( ( rule__Goal__PackageAssignment_0 )? )
            // InternalMinijava.g:1051:2: ( rule__Goal__PackageAssignment_0 )?
            {
             before(grammarAccess.getGoalAccess().getPackageAssignment_0()); 
            // InternalMinijava.g:1052:2: ( rule__Goal__PackageAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMinijava.g:1052:3: rule__Goal__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goal__PackageAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalAccess().getPackageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0__Impl"


    // $ANTLR start "rule__Goal__Group__1"
    // InternalMinijava.g:1060:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1064:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // InternalMinijava.g:1065:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Goal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1"


    // $ANTLR start "rule__Goal__Group__1__Impl"
    // InternalMinijava.g:1072:1: rule__Goal__Group__1__Impl : ( ( rule__Goal__ImportdeclAssignment_1 )* ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1076:1: ( ( ( rule__Goal__ImportdeclAssignment_1 )* ) )
            // InternalMinijava.g:1077:1: ( ( rule__Goal__ImportdeclAssignment_1 )* )
            {
            // InternalMinijava.g:1077:1: ( ( rule__Goal__ImportdeclAssignment_1 )* )
            // InternalMinijava.g:1078:2: ( rule__Goal__ImportdeclAssignment_1 )*
            {
             before(grammarAccess.getGoalAccess().getImportdeclAssignment_1()); 
            // InternalMinijava.g:1079:2: ( rule__Goal__ImportdeclAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMinijava.g:1079:3: rule__Goal__ImportdeclAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Goal__ImportdeclAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getImportdeclAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1__Impl"


    // $ANTLR start "rule__Goal__Group__2"
    // InternalMinijava.g:1087:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl rule__Goal__Group__3 ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1091:1: ( rule__Goal__Group__2__Impl rule__Goal__Group__3 )
            // InternalMinijava.g:1092:2: rule__Goal__Group__2__Impl rule__Goal__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Goal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__2"


    // $ANTLR start "rule__Goal__Group__2__Impl"
    // InternalMinijava.g:1099:1: rule__Goal__Group__2__Impl : ( ( rule__Goal__ClassDeclarationsAssignment_2 ) ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1103:1: ( ( ( rule__Goal__ClassDeclarationsAssignment_2 ) ) )
            // InternalMinijava.g:1104:1: ( ( rule__Goal__ClassDeclarationsAssignment_2 ) )
            {
            // InternalMinijava.g:1104:1: ( ( rule__Goal__ClassDeclarationsAssignment_2 ) )
            // InternalMinijava.g:1105:2: ( rule__Goal__ClassDeclarationsAssignment_2 )
            {
             before(grammarAccess.getGoalAccess().getClassDeclarationsAssignment_2()); 
            // InternalMinijava.g:1106:2: ( rule__Goal__ClassDeclarationsAssignment_2 )
            // InternalMinijava.g:1106:3: rule__Goal__ClassDeclarationsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Goal__ClassDeclarationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getClassDeclarationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group__3"
    // InternalMinijava.g:1114:1: rule__Goal__Group__3 : rule__Goal__Group__3__Impl ;
    public final void rule__Goal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1118:1: ( rule__Goal__Group__3__Impl )
            // InternalMinijava.g:1119:2: rule__Goal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__3"


    // $ANTLR start "rule__Goal__Group__3__Impl"
    // InternalMinijava.g:1125:1: rule__Goal__Group__3__Impl : ( ( rule__Goal__ClassDeclarationsAssignment_3 )* ) ;
    public final void rule__Goal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1129:1: ( ( ( rule__Goal__ClassDeclarationsAssignment_3 )* ) )
            // InternalMinijava.g:1130:1: ( ( rule__Goal__ClassDeclarationsAssignment_3 )* )
            {
            // InternalMinijava.g:1130:1: ( ( rule__Goal__ClassDeclarationsAssignment_3 )* )
            // InternalMinijava.g:1131:2: ( rule__Goal__ClassDeclarationsAssignment_3 )*
            {
             before(grammarAccess.getGoalAccess().getClassDeclarationsAssignment_3()); 
            // InternalMinijava.g:1132:2: ( rule__Goal__ClassDeclarationsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMinijava.g:1132:3: rule__Goal__ClassDeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Goal__ClassDeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getClassDeclarationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__3__Impl"


    // $ANTLR start "rule__PackageDecl__Group__0"
    // InternalMinijava.g:1141:1: rule__PackageDecl__Group__0 : rule__PackageDecl__Group__0__Impl rule__PackageDecl__Group__1 ;
    public final void rule__PackageDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1145:1: ( rule__PackageDecl__Group__0__Impl rule__PackageDecl__Group__1 )
            // InternalMinijava.g:1146:2: rule__PackageDecl__Group__0__Impl rule__PackageDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PackageDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__0"


    // $ANTLR start "rule__PackageDecl__Group__0__Impl"
    // InternalMinijava.g:1153:1: rule__PackageDecl__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1157:1: ( ( 'package' ) )
            // InternalMinijava.g:1158:1: ( 'package' )
            {
            // InternalMinijava.g:1158:1: ( 'package' )
            // InternalMinijava.g:1159:2: 'package'
            {
             before(grammarAccess.getPackageDeclAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackageDeclAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__0__Impl"


    // $ANTLR start "rule__PackageDecl__Group__1"
    // InternalMinijava.g:1168:1: rule__PackageDecl__Group__1 : rule__PackageDecl__Group__1__Impl rule__PackageDecl__Group__2 ;
    public final void rule__PackageDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1172:1: ( rule__PackageDecl__Group__1__Impl rule__PackageDecl__Group__2 )
            // InternalMinijava.g:1173:2: rule__PackageDecl__Group__1__Impl rule__PackageDecl__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PackageDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__1"


    // $ANTLR start "rule__PackageDecl__Group__1__Impl"
    // InternalMinijava.g:1180:1: rule__PackageDecl__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__PackageDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1184:1: ( ( ruleQualifiedName ) )
            // InternalMinijava.g:1185:1: ( ruleQualifiedName )
            {
            // InternalMinijava.g:1185:1: ( ruleQualifiedName )
            // InternalMinijava.g:1186:2: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclAccess().getQualifiedNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclAccess().getQualifiedNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__1__Impl"


    // $ANTLR start "rule__PackageDecl__Group__2"
    // InternalMinijava.g:1195:1: rule__PackageDecl__Group__2 : rule__PackageDecl__Group__2__Impl ;
    public final void rule__PackageDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1199:1: ( rule__PackageDecl__Group__2__Impl )
            // InternalMinijava.g:1200:2: rule__PackageDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__2"


    // $ANTLR start "rule__PackageDecl__Group__2__Impl"
    // InternalMinijava.g:1206:1: rule__PackageDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__PackageDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1210:1: ( ( ';' ) )
            // InternalMinijava.g:1211:1: ( ';' )
            {
            // InternalMinijava.g:1211:1: ( ';' )
            // InternalMinijava.g:1212:2: ';'
            {
             before(grammarAccess.getPackageDeclAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPackageDeclAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__2__Impl"


    // $ANTLR start "rule__ImportDecl__Group__0"
    // InternalMinijava.g:1222:1: rule__ImportDecl__Group__0 : rule__ImportDecl__Group__0__Impl rule__ImportDecl__Group__1 ;
    public final void rule__ImportDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1226:1: ( rule__ImportDecl__Group__0__Impl rule__ImportDecl__Group__1 )
            // InternalMinijava.g:1227:2: rule__ImportDecl__Group__0__Impl rule__ImportDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ImportDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__0"


    // $ANTLR start "rule__ImportDecl__Group__0__Impl"
    // InternalMinijava.g:1234:1: rule__ImportDecl__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1238:1: ( ( 'import' ) )
            // InternalMinijava.g:1239:1: ( 'import' )
            {
            // InternalMinijava.g:1239:1: ( 'import' )
            // InternalMinijava.g:1240:2: 'import'
            {
             before(grammarAccess.getImportDeclAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImportDeclAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__0__Impl"


    // $ANTLR start "rule__ImportDecl__Group__1"
    // InternalMinijava.g:1249:1: rule__ImportDecl__Group__1 : rule__ImportDecl__Group__1__Impl rule__ImportDecl__Group__2 ;
    public final void rule__ImportDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1253:1: ( rule__ImportDecl__Group__1__Impl rule__ImportDecl__Group__2 )
            // InternalMinijava.g:1254:2: rule__ImportDecl__Group__1__Impl rule__ImportDecl__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ImportDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__1"


    // $ANTLR start "rule__ImportDecl__Group__1__Impl"
    // InternalMinijava.g:1261:1: rule__ImportDecl__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__ImportDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1265:1: ( ( ruleQualifiedName ) )
            // InternalMinijava.g:1266:1: ( ruleQualifiedName )
            {
            // InternalMinijava.g:1266:1: ( ruleQualifiedName )
            // InternalMinijava.g:1267:2: ruleQualifiedName
            {
             before(grammarAccess.getImportDeclAccess().getQualifiedNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportDeclAccess().getQualifiedNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__1__Impl"


    // $ANTLR start "rule__ImportDecl__Group__2"
    // InternalMinijava.g:1276:1: rule__ImportDecl__Group__2 : rule__ImportDecl__Group__2__Impl ;
    public final void rule__ImportDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1280:1: ( rule__ImportDecl__Group__2__Impl )
            // InternalMinijava.g:1281:2: rule__ImportDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__2"


    // $ANTLR start "rule__ImportDecl__Group__2__Impl"
    // InternalMinijava.g:1287:1: rule__ImportDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__ImportDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1291:1: ( ( ';' ) )
            // InternalMinijava.g:1292:1: ( ';' )
            {
            // InternalMinijava.g:1292:1: ( ';' )
            // InternalMinijava.g:1293:2: ';'
            {
             before(grammarAccess.getImportDeclAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportDeclAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName___Group__0"
    // InternalMinijava.g:1303:1: rule__QualifiedName___Group__0 : rule__QualifiedName___Group__0__Impl rule__QualifiedName___Group__1 ;
    public final void rule__QualifiedName___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1307:1: ( rule__QualifiedName___Group__0__Impl rule__QualifiedName___Group__1 )
            // InternalMinijava.g:1308:2: rule__QualifiedName___Group__0__Impl rule__QualifiedName___Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName___Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName___Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName___Group__0"


    // $ANTLR start "rule__QualifiedName___Group__0__Impl"
    // InternalMinijava.g:1315:1: rule__QualifiedName___Group__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1319:1: ( ( '.' ) )
            // InternalMinijava.g:1320:1: ( '.' )
            {
            // InternalMinijava.g:1320:1: ( '.' )
            // InternalMinijava.g:1321:2: '.'
            {
             before(grammarAccess.getQualifiedName_Access().getFullStopKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualifiedName_Access().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName___Group__0__Impl"


    // $ANTLR start "rule__QualifiedName___Group__1"
    // InternalMinijava.g:1330:1: rule__QualifiedName___Group__1 : rule__QualifiedName___Group__1__Impl rule__QualifiedName___Group__2 ;
    public final void rule__QualifiedName___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1334:1: ( rule__QualifiedName___Group__1__Impl rule__QualifiedName___Group__2 )
            // InternalMinijava.g:1335:2: rule__QualifiedName___Group__1__Impl rule__QualifiedName___Group__2
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName___Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName___Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName___Group__1"


    // $ANTLR start "rule__QualifiedName___Group__1__Impl"
    // InternalMinijava.g:1342:1: rule__QualifiedName___Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1346:1: ( ( RULE_ID ) )
            // InternalMinijava.g:1347:1: ( RULE_ID )
            {
            // InternalMinijava.g:1347:1: ( RULE_ID )
            // InternalMinijava.g:1348:2: RULE_ID
            {
             before(grammarAccess.getQualifiedName_Access().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedName_Access().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName___Group__1__Impl"


    // $ANTLR start "rule__QualifiedName___Group__2"
    // InternalMinijava.g:1357:1: rule__QualifiedName___Group__2 : rule__QualifiedName___Group__2__Impl ;
    public final void rule__QualifiedName___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1361:1: ( rule__QualifiedName___Group__2__Impl )
            // InternalMinijava.g:1362:2: rule__QualifiedName___Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName___Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName___Group__2"


    // $ANTLR start "rule__QualifiedName___Group__2__Impl"
    // InternalMinijava.g:1368:1: rule__QualifiedName___Group__2__Impl : ( ruleQualifiedName_ ) ;
    public final void rule__QualifiedName___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1372:1: ( ( ruleQualifiedName_ ) )
            // InternalMinijava.g:1373:1: ( ruleQualifiedName_ )
            {
            // InternalMinijava.g:1373:1: ( ruleQualifiedName_ )
            // InternalMinijava.g:1374:2: ruleQualifiedName_
            {
             before(grammarAccess.getQualifiedName_Access().getQualifiedName_ParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName_();

            state._fsp--;

             after(grammarAccess.getQualifiedName_Access().getQualifiedName_ParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName___Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMinijava.g:1384:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1388:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMinijava.g:1389:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMinijava.g:1396:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1400:1: ( ( RULE_ID ) )
            // InternalMinijava.g:1401:1: ( RULE_ID )
            {
            // InternalMinijava.g:1401:1: ( RULE_ID )
            // InternalMinijava.g:1402:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMinijava.g:1411:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1415:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMinijava.g:1416:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMinijava.g:1422:1: rule__QualifiedName__Group__1__Impl : ( ruleQualifiedName_ ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1426:1: ( ( ruleQualifiedName_ ) )
            // InternalMinijava.g:1427:1: ( ruleQualifiedName_ )
            {
            // InternalMinijava.g:1427:1: ( ruleQualifiedName_ )
            // InternalMinijava.g:1428:2: ruleQualifiedName_
            {
             before(grammarAccess.getQualifiedNameAccess().getQualifiedName_ParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName_();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getQualifiedName_ParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameList__Group__0"
    // InternalMinijava.g:1438:1: rule__QualifiedNameList__Group__0 : rule__QualifiedNameList__Group__0__Impl rule__QualifiedNameList__Group__1 ;
    public final void rule__QualifiedNameList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1442:1: ( rule__QualifiedNameList__Group__0__Impl rule__QualifiedNameList__Group__1 )
            // InternalMinijava.g:1443:2: rule__QualifiedNameList__Group__0__Impl rule__QualifiedNameList__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameList__Group__0"


    // $ANTLR start "rule__QualifiedNameList__Group__0__Impl"
    // InternalMinijava.g:1450:1: rule__QualifiedNameList__Group__0__Impl : ( ( rule__QualifiedNameList__QualifiedNameAssignment_0 ) ) ;
    public final void rule__QualifiedNameList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1454:1: ( ( ( rule__QualifiedNameList__QualifiedNameAssignment_0 ) ) )
            // InternalMinijava.g:1455:1: ( ( rule__QualifiedNameList__QualifiedNameAssignment_0 ) )
            {
            // InternalMinijava.g:1455:1: ( ( rule__QualifiedNameList__QualifiedNameAssignment_0 ) )
            // InternalMinijava.g:1456:2: ( rule__QualifiedNameList__QualifiedNameAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameListAccess().getQualifiedNameAssignment_0()); 
            // InternalMinijava.g:1457:2: ( rule__QualifiedNameList__QualifiedNameAssignment_0 )
            // InternalMinijava.g:1457:3: rule__QualifiedNameList__QualifiedNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameList__QualifiedNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameListAccess().getQualifiedNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameList__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameList__Group__1"
    // InternalMinijava.g:1465:1: rule__QualifiedNameList__Group__1 : rule__QualifiedNameList__Group__1__Impl ;
    public final void rule__QualifiedNameList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1469:1: ( rule__QualifiedNameList__Group__1__Impl )
            // InternalMinijava.g:1470:2: rule__QualifiedNameList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameList__Group__1"


    // $ANTLR start "rule__QualifiedNameList__Group__1__Impl"
    // InternalMinijava.g:1476:1: rule__QualifiedNameList__Group__1__Impl : ( ( rule__QualifiedNameList__QualifiedNameLiAssignment_1 )? ) ;
    public final void rule__QualifiedNameList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1480:1: ( ( ( rule__QualifiedNameList__QualifiedNameLiAssignment_1 )? ) )
            // InternalMinijava.g:1481:1: ( ( rule__QualifiedNameList__QualifiedNameLiAssignment_1 )? )
            {
            // InternalMinijava.g:1481:1: ( ( rule__QualifiedNameList__QualifiedNameLiAssignment_1 )? )
            // InternalMinijava.g:1482:2: ( rule__QualifiedNameList__QualifiedNameLiAssignment_1 )?
            {
             before(grammarAccess.getQualifiedNameListAccess().getQualifiedNameLiAssignment_1()); 
            // InternalMinijava.g:1483:2: ( rule__QualifiedNameList__QualifiedNameLiAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMinijava.g:1483:3: rule__QualifiedNameList__QualifiedNameLiAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedNameList__QualifiedNameLiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameListAccess().getQualifiedNameLiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameList__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameLi__Group__0"
    // InternalMinijava.g:1492:1: rule__QualifiedNameLi__Group__0 : rule__QualifiedNameLi__Group__0__Impl rule__QualifiedNameLi__Group__1 ;
    public final void rule__QualifiedNameLi__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1496:1: ( rule__QualifiedNameLi__Group__0__Impl rule__QualifiedNameLi__Group__1 )
            // InternalMinijava.g:1497:2: rule__QualifiedNameLi__Group__0__Impl rule__QualifiedNameLi__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameLi__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameLi__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__Group__0"


    // $ANTLR start "rule__QualifiedNameLi__Group__0__Impl"
    // InternalMinijava.g:1504:1: rule__QualifiedNameLi__Group__0__Impl : ( ',' ) ;
    public final void rule__QualifiedNameLi__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1508:1: ( ( ',' ) )
            // InternalMinijava.g:1509:1: ( ',' )
            {
            // InternalMinijava.g:1509:1: ( ',' )
            // InternalMinijava.g:1510:2: ','
            {
             before(grammarAccess.getQualifiedNameLiAccess().getCommaKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameLiAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameLi__Group__1"
    // InternalMinijava.g:1519:1: rule__QualifiedNameLi__Group__1 : rule__QualifiedNameLi__Group__1__Impl rule__QualifiedNameLi__Group__2 ;
    public final void rule__QualifiedNameLi__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1523:1: ( rule__QualifiedNameLi__Group__1__Impl rule__QualifiedNameLi__Group__2 )
            // InternalMinijava.g:1524:2: rule__QualifiedNameLi__Group__1__Impl rule__QualifiedNameLi__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameLi__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameLi__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__Group__1"


    // $ANTLR start "rule__QualifiedNameLi__Group__1__Impl"
    // InternalMinijava.g:1531:1: rule__QualifiedNameLi__Group__1__Impl : ( ( rule__QualifiedNameLi__QualifiedNameAssignment_1 ) ) ;
    public final void rule__QualifiedNameLi__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1535:1: ( ( ( rule__QualifiedNameLi__QualifiedNameAssignment_1 ) ) )
            // InternalMinijava.g:1536:1: ( ( rule__QualifiedNameLi__QualifiedNameAssignment_1 ) )
            {
            // InternalMinijava.g:1536:1: ( ( rule__QualifiedNameLi__QualifiedNameAssignment_1 ) )
            // InternalMinijava.g:1537:2: ( rule__QualifiedNameLi__QualifiedNameAssignment_1 )
            {
             before(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameAssignment_1()); 
            // InternalMinijava.g:1538:2: ( rule__QualifiedNameLi__QualifiedNameAssignment_1 )
            // InternalMinijava.g:1538:3: rule__QualifiedNameLi__QualifiedNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameLi__QualifiedNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameLi__Group__2"
    // InternalMinijava.g:1546:1: rule__QualifiedNameLi__Group__2 : rule__QualifiedNameLi__Group__2__Impl ;
    public final void rule__QualifiedNameLi__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1550:1: ( rule__QualifiedNameLi__Group__2__Impl )
            // InternalMinijava.g:1551:2: rule__QualifiedNameLi__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameLi__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__Group__2"


    // $ANTLR start "rule__QualifiedNameLi__Group__2__Impl"
    // InternalMinijava.g:1557:1: rule__QualifiedNameLi__Group__2__Impl : ( ( rule__QualifiedNameLi__QualifiedNameLiAssignment_2 ) ) ;
    public final void rule__QualifiedNameLi__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1561:1: ( ( ( rule__QualifiedNameLi__QualifiedNameLiAssignment_2 ) ) )
            // InternalMinijava.g:1562:1: ( ( rule__QualifiedNameLi__QualifiedNameLiAssignment_2 ) )
            {
            // InternalMinijava.g:1562:1: ( ( rule__QualifiedNameLi__QualifiedNameLiAssignment_2 ) )
            // InternalMinijava.g:1563:2: ( rule__QualifiedNameLi__QualifiedNameLiAssignment_2 )
            {
             before(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameLiAssignment_2()); 
            // InternalMinijava.g:1564:2: ( rule__QualifiedNameLi__QualifiedNameLiAssignment_2 )
            // InternalMinijava.g:1564:3: rule__QualifiedNameLi__QualifiedNameLiAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameLi__QualifiedNameLiAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameLiAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__Group__2__Impl"


    // $ANTLR start "rule__MainClass__Group__0"
    // InternalMinijava.g:1573:1: rule__MainClass__Group__0 : rule__MainClass__Group__0__Impl rule__MainClass__Group__1 ;
    public final void rule__MainClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1577:1: ( rule__MainClass__Group__0__Impl rule__MainClass__Group__1 )
            // InternalMinijava.g:1578:2: rule__MainClass__Group__0__Impl rule__MainClass__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MainClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__0"


    // $ANTLR start "rule__MainClass__Group__0__Impl"
    // InternalMinijava.g:1585:1: rule__MainClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__MainClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1589:1: ( ( 'class' ) )
            // InternalMinijava.g:1590:1: ( 'class' )
            {
            // InternalMinijava.g:1590:1: ( 'class' )
            // InternalMinijava.g:1591:2: 'class'
            {
             before(grammarAccess.getMainClassAccess().getClassKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__0__Impl"


    // $ANTLR start "rule__MainClass__Group__1"
    // InternalMinijava.g:1600:1: rule__MainClass__Group__1 : rule__MainClass__Group__1__Impl rule__MainClass__Group__2 ;
    public final void rule__MainClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1604:1: ( rule__MainClass__Group__1__Impl rule__MainClass__Group__2 )
            // InternalMinijava.g:1605:2: rule__MainClass__Group__1__Impl rule__MainClass__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__MainClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__1"


    // $ANTLR start "rule__MainClass__Group__1__Impl"
    // InternalMinijava.g:1612:1: rule__MainClass__Group__1__Impl : ( ( rule__MainClass__NameAssignment_1 ) ) ;
    public final void rule__MainClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1616:1: ( ( ( rule__MainClass__NameAssignment_1 ) ) )
            // InternalMinijava.g:1617:1: ( ( rule__MainClass__NameAssignment_1 ) )
            {
            // InternalMinijava.g:1617:1: ( ( rule__MainClass__NameAssignment_1 ) )
            // InternalMinijava.g:1618:2: ( rule__MainClass__NameAssignment_1 )
            {
             before(grammarAccess.getMainClassAccess().getNameAssignment_1()); 
            // InternalMinijava.g:1619:2: ( rule__MainClass__NameAssignment_1 )
            // InternalMinijava.g:1619:3: rule__MainClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__1__Impl"


    // $ANTLR start "rule__MainClass__Group__2"
    // InternalMinijava.g:1627:1: rule__MainClass__Group__2 : rule__MainClass__Group__2__Impl rule__MainClass__Group__3 ;
    public final void rule__MainClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1631:1: ( rule__MainClass__Group__2__Impl rule__MainClass__Group__3 )
            // InternalMinijava.g:1632:2: rule__MainClass__Group__2__Impl rule__MainClass__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MainClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__2"


    // $ANTLR start "rule__MainClass__Group__2__Impl"
    // InternalMinijava.g:1639:1: rule__MainClass__Group__2__Impl : ( '{' ) ;
    public final void rule__MainClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1643:1: ( ( '{' ) )
            // InternalMinijava.g:1644:1: ( '{' )
            {
            // InternalMinijava.g:1644:1: ( '{' )
            // InternalMinijava.g:1645:2: '{'
            {
             before(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__2__Impl"


    // $ANTLR start "rule__MainClass__Group__3"
    // InternalMinijava.g:1654:1: rule__MainClass__Group__3 : rule__MainClass__Group__3__Impl rule__MainClass__Group__4 ;
    public final void rule__MainClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1658:1: ( rule__MainClass__Group__3__Impl rule__MainClass__Group__4 )
            // InternalMinijava.g:1659:2: rule__MainClass__Group__3__Impl rule__MainClass__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__MainClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__3"


    // $ANTLR start "rule__MainClass__Group__3__Impl"
    // InternalMinijava.g:1666:1: rule__MainClass__Group__3__Impl : ( 'public' ) ;
    public final void rule__MainClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1670:1: ( ( 'public' ) )
            // InternalMinijava.g:1671:1: ( 'public' )
            {
            // InternalMinijava.g:1671:1: ( 'public' )
            // InternalMinijava.g:1672:2: 'public'
            {
             before(grammarAccess.getMainClassAccess().getPublicKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getPublicKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__3__Impl"


    // $ANTLR start "rule__MainClass__Group__4"
    // InternalMinijava.g:1681:1: rule__MainClass__Group__4 : rule__MainClass__Group__4__Impl rule__MainClass__Group__5 ;
    public final void rule__MainClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1685:1: ( rule__MainClass__Group__4__Impl rule__MainClass__Group__5 )
            // InternalMinijava.g:1686:2: rule__MainClass__Group__4__Impl rule__MainClass__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__MainClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__4"


    // $ANTLR start "rule__MainClass__Group__4__Impl"
    // InternalMinijava.g:1693:1: rule__MainClass__Group__4__Impl : ( 'static' ) ;
    public final void rule__MainClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1697:1: ( ( 'static' ) )
            // InternalMinijava.g:1698:1: ( 'static' )
            {
            // InternalMinijava.g:1698:1: ( 'static' )
            // InternalMinijava.g:1699:2: 'static'
            {
             before(grammarAccess.getMainClassAccess().getStaticKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getStaticKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__4__Impl"


    // $ANTLR start "rule__MainClass__Group__5"
    // InternalMinijava.g:1708:1: rule__MainClass__Group__5 : rule__MainClass__Group__5__Impl rule__MainClass__Group__6 ;
    public final void rule__MainClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1712:1: ( rule__MainClass__Group__5__Impl rule__MainClass__Group__6 )
            // InternalMinijava.g:1713:2: rule__MainClass__Group__5__Impl rule__MainClass__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__MainClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__5"


    // $ANTLR start "rule__MainClass__Group__5__Impl"
    // InternalMinijava.g:1720:1: rule__MainClass__Group__5__Impl : ( 'void' ) ;
    public final void rule__MainClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1724:1: ( ( 'void' ) )
            // InternalMinijava.g:1725:1: ( 'void' )
            {
            // InternalMinijava.g:1725:1: ( 'void' )
            // InternalMinijava.g:1726:2: 'void'
            {
             before(grammarAccess.getMainClassAccess().getVoidKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getVoidKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__5__Impl"


    // $ANTLR start "rule__MainClass__Group__6"
    // InternalMinijava.g:1735:1: rule__MainClass__Group__6 : rule__MainClass__Group__6__Impl rule__MainClass__Group__7 ;
    public final void rule__MainClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1739:1: ( rule__MainClass__Group__6__Impl rule__MainClass__Group__7 )
            // InternalMinijava.g:1740:2: rule__MainClass__Group__6__Impl rule__MainClass__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__MainClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__6"


    // $ANTLR start "rule__MainClass__Group__6__Impl"
    // InternalMinijava.g:1747:1: rule__MainClass__Group__6__Impl : ( 'main' ) ;
    public final void rule__MainClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1751:1: ( ( 'main' ) )
            // InternalMinijava.g:1752:1: ( 'main' )
            {
            // InternalMinijava.g:1752:1: ( 'main' )
            // InternalMinijava.g:1753:2: 'main'
            {
             before(grammarAccess.getMainClassAccess().getMainKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getMainKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__6__Impl"


    // $ANTLR start "rule__MainClass__Group__7"
    // InternalMinijava.g:1762:1: rule__MainClass__Group__7 : rule__MainClass__Group__7__Impl rule__MainClass__Group__8 ;
    public final void rule__MainClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1766:1: ( rule__MainClass__Group__7__Impl rule__MainClass__Group__8 )
            // InternalMinijava.g:1767:2: rule__MainClass__Group__7__Impl rule__MainClass__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__MainClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__7"


    // $ANTLR start "rule__MainClass__Group__7__Impl"
    // InternalMinijava.g:1774:1: rule__MainClass__Group__7__Impl : ( '(' ) ;
    public final void rule__MainClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1778:1: ( ( '(' ) )
            // InternalMinijava.g:1779:1: ( '(' )
            {
            // InternalMinijava.g:1779:1: ( '(' )
            // InternalMinijava.g:1780:2: '('
            {
             before(grammarAccess.getMainClassAccess().getLeftParenthesisKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__7__Impl"


    // $ANTLR start "rule__MainClass__Group__8"
    // InternalMinijava.g:1789:1: rule__MainClass__Group__8 : rule__MainClass__Group__8__Impl rule__MainClass__Group__9 ;
    public final void rule__MainClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1793:1: ( rule__MainClass__Group__8__Impl rule__MainClass__Group__9 )
            // InternalMinijava.g:1794:2: rule__MainClass__Group__8__Impl rule__MainClass__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__MainClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__8"


    // $ANTLR start "rule__MainClass__Group__8__Impl"
    // InternalMinijava.g:1801:1: rule__MainClass__Group__8__Impl : ( 'String' ) ;
    public final void rule__MainClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1805:1: ( ( 'String' ) )
            // InternalMinijava.g:1806:1: ( 'String' )
            {
            // InternalMinijava.g:1806:1: ( 'String' )
            // InternalMinijava.g:1807:2: 'String'
            {
             before(grammarAccess.getMainClassAccess().getStringKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getStringKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__8__Impl"


    // $ANTLR start "rule__MainClass__Group__9"
    // InternalMinijava.g:1816:1: rule__MainClass__Group__9 : rule__MainClass__Group__9__Impl rule__MainClass__Group__10 ;
    public final void rule__MainClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1820:1: ( rule__MainClass__Group__9__Impl rule__MainClass__Group__10 )
            // InternalMinijava.g:1821:2: rule__MainClass__Group__9__Impl rule__MainClass__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__MainClass__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__9"


    // $ANTLR start "rule__MainClass__Group__9__Impl"
    // InternalMinijava.g:1828:1: rule__MainClass__Group__9__Impl : ( '[' ) ;
    public final void rule__MainClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1832:1: ( ( '[' ) )
            // InternalMinijava.g:1833:1: ( '[' )
            {
            // InternalMinijava.g:1833:1: ( '[' )
            // InternalMinijava.g:1834:2: '['
            {
             before(grammarAccess.getMainClassAccess().getLeftSquareBracketKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__9__Impl"


    // $ANTLR start "rule__MainClass__Group__10"
    // InternalMinijava.g:1843:1: rule__MainClass__Group__10 : rule__MainClass__Group__10__Impl rule__MainClass__Group__11 ;
    public final void rule__MainClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1847:1: ( rule__MainClass__Group__10__Impl rule__MainClass__Group__11 )
            // InternalMinijava.g:1848:2: rule__MainClass__Group__10__Impl rule__MainClass__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__MainClass__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__10"


    // $ANTLR start "rule__MainClass__Group__10__Impl"
    // InternalMinijava.g:1855:1: rule__MainClass__Group__10__Impl : ( ']' ) ;
    public final void rule__MainClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1859:1: ( ( ']' ) )
            // InternalMinijava.g:1860:1: ( ']' )
            {
            // InternalMinijava.g:1860:1: ( ']' )
            // InternalMinijava.g:1861:2: ']'
            {
             before(grammarAccess.getMainClassAccess().getRightSquareBracketKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__10__Impl"


    // $ANTLR start "rule__MainClass__Group__11"
    // InternalMinijava.g:1870:1: rule__MainClass__Group__11 : rule__MainClass__Group__11__Impl rule__MainClass__Group__12 ;
    public final void rule__MainClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1874:1: ( rule__MainClass__Group__11__Impl rule__MainClass__Group__12 )
            // InternalMinijava.g:1875:2: rule__MainClass__Group__11__Impl rule__MainClass__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__MainClass__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__11"


    // $ANTLR start "rule__MainClass__Group__11__Impl"
    // InternalMinijava.g:1882:1: rule__MainClass__Group__11__Impl : ( RULE_ID ) ;
    public final void rule__MainClass__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1886:1: ( ( RULE_ID ) )
            // InternalMinijava.g:1887:1: ( RULE_ID )
            {
            // InternalMinijava.g:1887:1: ( RULE_ID )
            // InternalMinijava.g:1888:2: RULE_ID
            {
             before(grammarAccess.getMainClassAccess().getIDTerminalRuleCall_11()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getIDTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__11__Impl"


    // $ANTLR start "rule__MainClass__Group__12"
    // InternalMinijava.g:1897:1: rule__MainClass__Group__12 : rule__MainClass__Group__12__Impl rule__MainClass__Group__13 ;
    public final void rule__MainClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1901:1: ( rule__MainClass__Group__12__Impl rule__MainClass__Group__13 )
            // InternalMinijava.g:1902:2: rule__MainClass__Group__12__Impl rule__MainClass__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__MainClass__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__12"


    // $ANTLR start "rule__MainClass__Group__12__Impl"
    // InternalMinijava.g:1909:1: rule__MainClass__Group__12__Impl : ( ')' ) ;
    public final void rule__MainClass__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1913:1: ( ( ')' ) )
            // InternalMinijava.g:1914:1: ( ')' )
            {
            // InternalMinijava.g:1914:1: ( ')' )
            // InternalMinijava.g:1915:2: ')'
            {
             before(grammarAccess.getMainClassAccess().getRightParenthesisKeyword_12()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__12__Impl"


    // $ANTLR start "rule__MainClass__Group__13"
    // InternalMinijava.g:1924:1: rule__MainClass__Group__13 : rule__MainClass__Group__13__Impl rule__MainClass__Group__14 ;
    public final void rule__MainClass__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1928:1: ( rule__MainClass__Group__13__Impl rule__MainClass__Group__14 )
            // InternalMinijava.g:1929:2: rule__MainClass__Group__13__Impl rule__MainClass__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__MainClass__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__13"


    // $ANTLR start "rule__MainClass__Group__13__Impl"
    // InternalMinijava.g:1936:1: rule__MainClass__Group__13__Impl : ( '{' ) ;
    public final void rule__MainClass__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1940:1: ( ( '{' ) )
            // InternalMinijava.g:1941:1: ( '{' )
            {
            // InternalMinijava.g:1941:1: ( '{' )
            // InternalMinijava.g:1942:2: '{'
            {
             before(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__13__Impl"


    // $ANTLR start "rule__MainClass__Group__14"
    // InternalMinijava.g:1951:1: rule__MainClass__Group__14 : rule__MainClass__Group__14__Impl rule__MainClass__Group__15 ;
    public final void rule__MainClass__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1955:1: ( rule__MainClass__Group__14__Impl rule__MainClass__Group__15 )
            // InternalMinijava.g:1956:2: rule__MainClass__Group__14__Impl rule__MainClass__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__MainClass__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__14"


    // $ANTLR start "rule__MainClass__Group__14__Impl"
    // InternalMinijava.g:1963:1: rule__MainClass__Group__14__Impl : ( ( rule__MainClass__Alternatives_14 )* ) ;
    public final void rule__MainClass__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1967:1: ( ( ( rule__MainClass__Alternatives_14 )* ) )
            // InternalMinijava.g:1968:1: ( ( rule__MainClass__Alternatives_14 )* )
            {
            // InternalMinijava.g:1968:1: ( ( rule__MainClass__Alternatives_14 )* )
            // InternalMinijava.g:1969:2: ( rule__MainClass__Alternatives_14 )*
            {
             before(grammarAccess.getMainClassAccess().getAlternatives_14()); 
            // InternalMinijava.g:1970:2: ( rule__MainClass__Alternatives_14 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=11 && LA15_0<=13)||LA15_0==24||LA15_0==28||LA15_0==36||(LA15_0>=39 && LA15_0<=43)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMinijava.g:1970:3: rule__MainClass__Alternatives_14
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MainClass__Alternatives_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMainClassAccess().getAlternatives_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__14__Impl"


    // $ANTLR start "rule__MainClass__Group__15"
    // InternalMinijava.g:1978:1: rule__MainClass__Group__15 : rule__MainClass__Group__15__Impl rule__MainClass__Group__16 ;
    public final void rule__MainClass__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1982:1: ( rule__MainClass__Group__15__Impl rule__MainClass__Group__16 )
            // InternalMinijava.g:1983:2: rule__MainClass__Group__15__Impl rule__MainClass__Group__16
            {
            pushFollow(FOLLOW_23);
            rule__MainClass__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__15"


    // $ANTLR start "rule__MainClass__Group__15__Impl"
    // InternalMinijava.g:1990:1: rule__MainClass__Group__15__Impl : ( '}' ) ;
    public final void rule__MainClass__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:1994:1: ( ( '}' ) )
            // InternalMinijava.g:1995:1: ( '}' )
            {
            // InternalMinijava.g:1995:1: ( '}' )
            // InternalMinijava.g:1996:2: '}'
            {
             before(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_15()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__15__Impl"


    // $ANTLR start "rule__MainClass__Group__16"
    // InternalMinijava.g:2005:1: rule__MainClass__Group__16 : rule__MainClass__Group__16__Impl ;
    public final void rule__MainClass__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2009:1: ( rule__MainClass__Group__16__Impl )
            // InternalMinijava.g:2010:2: rule__MainClass__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__16"


    // $ANTLR start "rule__MainClass__Group__16__Impl"
    // InternalMinijava.g:2016:1: rule__MainClass__Group__16__Impl : ( '}' ) ;
    public final void rule__MainClass__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2020:1: ( ( '}' ) )
            // InternalMinijava.g:2021:1: ( '}' )
            {
            // InternalMinijava.g:2021:1: ( '}' )
            // InternalMinijava.g:2022:2: '}'
            {
             before(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_16()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__16__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalMinijava.g:2032:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2036:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalMinijava.g:2037:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0"


    // $ANTLR start "rule__ClassDeclaration__Group__0__Impl"
    // InternalMinijava.g:2044:1: rule__ClassDeclaration__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2048:1: ( ( 'class' ) )
            // InternalMinijava.g:2049:1: ( 'class' )
            {
            // InternalMinijava.g:2049:1: ( 'class' )
            // InternalMinijava.g:2050:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__1"
    // InternalMinijava.g:2059:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2063:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalMinijava.g:2064:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ClassDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1"


    // $ANTLR start "rule__ClassDeclaration__Group__1__Impl"
    // InternalMinijava.g:2071:1: rule__ClassDeclaration__Group__1__Impl : ( ( rule__ClassDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2075:1: ( ( ( rule__ClassDeclaration__NameAssignment_1 ) ) )
            // InternalMinijava.g:2076:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            {
            // InternalMinijava.g:2076:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            // InternalMinijava.g:2077:2: ( rule__ClassDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_1()); 
            // InternalMinijava.g:2078:2: ( rule__ClassDeclaration__NameAssignment_1 )
            // InternalMinijava.g:2078:3: rule__ClassDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__2"
    // InternalMinijava.g:2086:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2090:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalMinijava.g:2091:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ClassDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2"


    // $ANTLR start "rule__ClassDeclaration__Group__2__Impl"
    // InternalMinijava.g:2098:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__Group_2__0 )? ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2102:1: ( ( ( rule__ClassDeclaration__Group_2__0 )? ) )
            // InternalMinijava.g:2103:1: ( ( rule__ClassDeclaration__Group_2__0 )? )
            {
            // InternalMinijava.g:2103:1: ( ( rule__ClassDeclaration__Group_2__0 )? )
            // InternalMinijava.g:2104:2: ( rule__ClassDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_2()); 
            // InternalMinijava.g:2105:2: ( rule__ClassDeclaration__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMinijava.g:2105:3: rule__ClassDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__3"
    // InternalMinijava.g:2113:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2117:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalMinijava.g:2118:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ClassDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3"


    // $ANTLR start "rule__ClassDeclaration__Group__3__Impl"
    // InternalMinijava.g:2125:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2129:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalMinijava.g:2130:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalMinijava.g:2130:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalMinijava.g:2131:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalMinijava.g:2132:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMinijava.g:2132:3: rule__ClassDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__4"
    // InternalMinijava.g:2140:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2144:1: ( rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 )
            // InternalMinijava.g:2145:2: rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ClassDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4"


    // $ANTLR start "rule__ClassDeclaration__Group__4__Impl"
    // InternalMinijava.g:2152:1: rule__ClassDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2156:1: ( ( '{' ) )
            // InternalMinijava.g:2157:1: ( '{' )
            {
            // InternalMinijava.g:2157:1: ( '{' )
            // InternalMinijava.g:2158:2: '{'
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__5"
    // InternalMinijava.g:2167:1: rule__ClassDeclaration__Group__5 : rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 ;
    public final void rule__ClassDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2171:1: ( rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 )
            // InternalMinijava.g:2172:2: rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ClassDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__5"


    // $ANTLR start "rule__ClassDeclaration__Group__5__Impl"
    // InternalMinijava.g:2179:1: rule__ClassDeclaration__Group__5__Impl : ( ( rule__ClassDeclaration__Alternatives_5 )* ) ;
    public final void rule__ClassDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2183:1: ( ( ( rule__ClassDeclaration__Alternatives_5 )* ) )
            // InternalMinijava.g:2184:1: ( ( rule__ClassDeclaration__Alternatives_5 )* )
            {
            // InternalMinijava.g:2184:1: ( ( rule__ClassDeclaration__Alternatives_5 )* )
            // InternalMinijava.g:2185:2: ( rule__ClassDeclaration__Alternatives_5 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_5()); 
            // InternalMinijava.g:2186:2: ( rule__ClassDeclaration__Alternatives_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=13)||LA18_0==28||LA18_0==36||(LA18_0>=39 && LA18_0<=41)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMinijava.g:2186:3: rule__ClassDeclaration__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ClassDeclaration__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__6"
    // InternalMinijava.g:2194:1: rule__ClassDeclaration__Group__6 : rule__ClassDeclaration__Group__6__Impl ;
    public final void rule__ClassDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2198:1: ( rule__ClassDeclaration__Group__6__Impl )
            // InternalMinijava.g:2199:2: rule__ClassDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__6"


    // $ANTLR start "rule__ClassDeclaration__Group__6__Impl"
    // InternalMinijava.g:2205:1: rule__ClassDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2209:1: ( ( '}' ) )
            // InternalMinijava.g:2210:1: ( '}' )
            {
            // InternalMinijava.g:2210:1: ( '}' )
            // InternalMinijava.g:2211:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_2__0"
    // InternalMinijava.g:2221:1: rule__ClassDeclaration__Group_2__0 : rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1 ;
    public final void rule__ClassDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2225:1: ( rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1 )
            // InternalMinijava.g:2226:2: rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_2__0"


    // $ANTLR start "rule__ClassDeclaration__Group_2__0__Impl"
    // InternalMinijava.g:2233:1: rule__ClassDeclaration__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2237:1: ( ( 'extends' ) )
            // InternalMinijava.g:2238:1: ( 'extends' )
            {
            // InternalMinijava.g:2238:1: ( 'extends' )
            // InternalMinijava.g:2239:2: 'extends'
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_2__1"
    // InternalMinijava.g:2248:1: rule__ClassDeclaration__Group_2__1 : rule__ClassDeclaration__Group_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2252:1: ( rule__ClassDeclaration__Group_2__1__Impl )
            // InternalMinijava.g:2253:2: rule__ClassDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_2__1"


    // $ANTLR start "rule__ClassDeclaration__Group_2__1__Impl"
    // InternalMinijava.g:2259:1: rule__ClassDeclaration__Group_2__1__Impl : ( ( rule__ClassDeclaration__QualifiedNameAssignment_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2263:1: ( ( ( rule__ClassDeclaration__QualifiedNameAssignment_2_1 ) ) )
            // InternalMinijava.g:2264:1: ( ( rule__ClassDeclaration__QualifiedNameAssignment_2_1 ) )
            {
            // InternalMinijava.g:2264:1: ( ( rule__ClassDeclaration__QualifiedNameAssignment_2_1 ) )
            // InternalMinijava.g:2265:2: ( rule__ClassDeclaration__QualifiedNameAssignment_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getQualifiedNameAssignment_2_1()); 
            // InternalMinijava.g:2266:2: ( rule__ClassDeclaration__QualifiedNameAssignment_2_1 )
            // InternalMinijava.g:2266:3: rule__ClassDeclaration__QualifiedNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__QualifiedNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getQualifiedNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3__0"
    // InternalMinijava.g:2275:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2279:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalMinijava.g:2280:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3__0__Impl"
    // InternalMinijava.g:2287:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2291:1: ( ( 'implements' ) )
            // InternalMinijava.g:2292:1: ( 'implements' )
            {
            // InternalMinijava.g:2292:1: ( 'implements' )
            // InternalMinijava.g:2293:2: 'implements'
            {
             before(grammarAccess.getClassDeclarationAccess().getImplementsKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getImplementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3__1"
    // InternalMinijava.g:2302:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2306:1: ( rule__ClassDeclaration__Group_3__1__Impl )
            // InternalMinijava.g:2307:2: rule__ClassDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3__1__Impl"
    // InternalMinijava.g:2313:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__QualifiedNameListAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2317:1: ( ( ( rule__ClassDeclaration__QualifiedNameListAssignment_3_1 ) ) )
            // InternalMinijava.g:2318:1: ( ( rule__ClassDeclaration__QualifiedNameListAssignment_3_1 ) )
            {
            // InternalMinijava.g:2318:1: ( ( rule__ClassDeclaration__QualifiedNameListAssignment_3_1 ) )
            // InternalMinijava.g:2319:2: ( rule__ClassDeclaration__QualifiedNameListAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getQualifiedNameListAssignment_3_1()); 
            // InternalMinijava.g:2320:2: ( rule__ClassDeclaration__QualifiedNameListAssignment_3_1 )
            // InternalMinijava.g:2320:3: rule__ClassDeclaration__QualifiedNameListAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__QualifiedNameListAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getQualifiedNameListAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalMinijava.g:2329:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2333:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalMinijava.g:2334:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalMinijava.g:2341:1: rule__Type__Group_0__0__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2345:1: ( ( 'int' ) )
            // InternalMinijava.g:2346:1: ( 'int' )
            {
            // InternalMinijava.g:2346:1: ( 'int' )
            // InternalMinijava.g:2347:2: 'int'
            {
             before(grammarAccess.getTypeAccess().getIntKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalMinijava.g:2356:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl rule__Type__Group_0__2 ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2360:1: ( rule__Type__Group_0__1__Impl rule__Type__Group_0__2 )
            // InternalMinijava.g:2361:2: rule__Type__Group_0__1__Impl rule__Type__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Type__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalMinijava.g:2368:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__TypeNameAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2372:1: ( ( ( rule__Type__TypeNameAssignment_0_1 ) ) )
            // InternalMinijava.g:2373:1: ( ( rule__Type__TypeNameAssignment_0_1 ) )
            {
            // InternalMinijava.g:2373:1: ( ( rule__Type__TypeNameAssignment_0_1 ) )
            // InternalMinijava.g:2374:2: ( rule__Type__TypeNameAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeNameAssignment_0_1()); 
            // InternalMinijava.g:2375:2: ( rule__Type__TypeNameAssignment_0_1 )
            // InternalMinijava.g:2375:3: rule__Type__TypeNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_0__2"
    // InternalMinijava.g:2383:1: rule__Type__Group_0__2 : rule__Type__Group_0__2__Impl ;
    public final void rule__Type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2387:1: ( rule__Type__Group_0__2__Impl )
            // InternalMinijava.g:2388:2: rule__Type__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__2"


    // $ANTLR start "rule__Type__Group_0__2__Impl"
    // InternalMinijava.g:2394:1: rule__Type__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2398:1: ( ( ']' ) )
            // InternalMinijava.g:2399:1: ( ']' )
            {
            // InternalMinijava.g:2399:1: ( ']' )
            // InternalMinijava.g:2400:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__2__Impl"


    // $ANTLR start "rule__Type__Group_6__0"
    // InternalMinijava.g:2410:1: rule__Type__Group_6__0 : rule__Type__Group_6__0__Impl rule__Type__Group_6__1 ;
    public final void rule__Type__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2414:1: ( rule__Type__Group_6__0__Impl rule__Type__Group_6__1 )
            // InternalMinijava.g:2415:2: rule__Type__Group_6__0__Impl rule__Type__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__Type__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0"


    // $ANTLR start "rule__Type__Group_6__0__Impl"
    // InternalMinijava.g:2422:1: rule__Type__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2426:1: ( ( '(' ) )
            // InternalMinijava.g:2427:1: ( '(' )
            {
            // InternalMinijava.g:2427:1: ( '(' )
            // InternalMinijava.g:2428:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__0__Impl"


    // $ANTLR start "rule__Type__Group_6__1"
    // InternalMinijava.g:2437:1: rule__Type__Group_6__1 : rule__Type__Group_6__1__Impl rule__Type__Group_6__2 ;
    public final void rule__Type__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2441:1: ( rule__Type__Group_6__1__Impl rule__Type__Group_6__2 )
            // InternalMinijava.g:2442:2: rule__Type__Group_6__1__Impl rule__Type__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__Type__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1"


    // $ANTLR start "rule__Type__Group_6__1__Impl"
    // InternalMinijava.g:2449:1: rule__Type__Group_6__1__Impl : ( ( rule__Type__VarListAssignment_6_1 ) ) ;
    public final void rule__Type__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2453:1: ( ( ( rule__Type__VarListAssignment_6_1 ) ) )
            // InternalMinijava.g:2454:1: ( ( rule__Type__VarListAssignment_6_1 ) )
            {
            // InternalMinijava.g:2454:1: ( ( rule__Type__VarListAssignment_6_1 ) )
            // InternalMinijava.g:2455:2: ( rule__Type__VarListAssignment_6_1 )
            {
             before(grammarAccess.getTypeAccess().getVarListAssignment_6_1()); 
            // InternalMinijava.g:2456:2: ( rule__Type__VarListAssignment_6_1 )
            // InternalMinijava.g:2456:3: rule__Type__VarListAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__VarListAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getVarListAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__1__Impl"


    // $ANTLR start "rule__Type__Group_6__2"
    // InternalMinijava.g:2464:1: rule__Type__Group_6__2 : rule__Type__Group_6__2__Impl ;
    public final void rule__Type__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2468:1: ( rule__Type__Group_6__2__Impl )
            // InternalMinijava.g:2469:2: rule__Type__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__2"


    // $ANTLR start "rule__Type__Group_6__2__Impl"
    // InternalMinijava.g:2475:1: rule__Type__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2479:1: ( ( ')' ) )
            // InternalMinijava.g:2480:1: ( ')' )
            {
            // InternalMinijava.g:2480:1: ( ')' )
            // InternalMinijava.g:2481:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_6_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_6__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalMinijava.g:2491:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2495:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalMinijava.g:2496:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalMinijava.g:2503:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VariableAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2507:1: ( ( ( rule__VarDeclaration__VariableAssignment_0 ) ) )
            // InternalMinijava.g:2508:1: ( ( rule__VarDeclaration__VariableAssignment_0 ) )
            {
            // InternalMinijava.g:2508:1: ( ( rule__VarDeclaration__VariableAssignment_0 ) )
            // InternalMinijava.g:2509:2: ( rule__VarDeclaration__VariableAssignment_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariableAssignment_0()); 
            // InternalMinijava.g:2510:2: ( rule__VarDeclaration__VariableAssignment_0 )
            // InternalMinijava.g:2510:3: rule__VarDeclaration__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalMinijava.g:2518:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2522:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalMinijava.g:2523:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalMinijava.g:2529:1: rule__VarDeclaration__Group__1__Impl : ( ';' ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2533:1: ( ( ';' ) )
            // InternalMinijava.g:2534:1: ( ';' )
            {
            // InternalMinijava.g:2534:1: ( ';' )
            // InternalMinijava.g:2535:2: ';'
            {
             before(grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMinijava.g:2545:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2549:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMinijava.g:2550:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMinijava.g:2557:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VariableTypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2561:1: ( ( ( rule__Variable__VariableTypeAssignment_0 ) ) )
            // InternalMinijava.g:2562:1: ( ( rule__Variable__VariableTypeAssignment_0 ) )
            {
            // InternalMinijava.g:2562:1: ( ( rule__Variable__VariableTypeAssignment_0 ) )
            // InternalMinijava.g:2563:2: ( rule__Variable__VariableTypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getVariableTypeAssignment_0()); 
            // InternalMinijava.g:2564:2: ( rule__Variable__VariableTypeAssignment_0 )
            // InternalMinijava.g:2564:3: rule__Variable__VariableTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMinijava.g:2572:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2576:1: ( rule__Variable__Group__1__Impl )
            // InternalMinijava.g:2577:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMinijava.g:2583:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2587:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMinijava.g:2588:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMinijava.g:2588:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMinijava.g:2589:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMinijava.g:2590:2: ( rule__Variable__NameAssignment_1 )
            // InternalMinijava.g:2590:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__VarList__Group__0"
    // InternalMinijava.g:2599:1: rule__VarList__Group__0 : rule__VarList__Group__0__Impl rule__VarList__Group__1 ;
    public final void rule__VarList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2603:1: ( rule__VarList__Group__0__Impl rule__VarList__Group__1 )
            // InternalMinijava.g:2604:2: rule__VarList__Group__0__Impl rule__VarList__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VarList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__0"


    // $ANTLR start "rule__VarList__Group__0__Impl"
    // InternalMinijava.g:2611:1: rule__VarList__Group__0__Impl : ( ruleVarDeclaration ) ;
    public final void rule__VarList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2615:1: ( ( ruleVarDeclaration ) )
            // InternalMinijava.g:2616:1: ( ruleVarDeclaration )
            {
            // InternalMinijava.g:2616:1: ( ruleVarDeclaration )
            // InternalMinijava.g:2617:2: ruleVarDeclaration
            {
             before(grammarAccess.getVarListAccess().getVarDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarListAccess().getVarDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__0__Impl"


    // $ANTLR start "rule__VarList__Group__1"
    // InternalMinijava.g:2626:1: rule__VarList__Group__1 : rule__VarList__Group__1__Impl ;
    public final void rule__VarList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2630:1: ( rule__VarList__Group__1__Impl )
            // InternalMinijava.g:2631:2: rule__VarList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__1"


    // $ANTLR start "rule__VarList__Group__1__Impl"
    // InternalMinijava.g:2637:1: rule__VarList__Group__1__Impl : ( ( rule__VarList__VarLiAssignment_1 ) ) ;
    public final void rule__VarList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2641:1: ( ( ( rule__VarList__VarLiAssignment_1 ) ) )
            // InternalMinijava.g:2642:1: ( ( rule__VarList__VarLiAssignment_1 ) )
            {
            // InternalMinijava.g:2642:1: ( ( rule__VarList__VarLiAssignment_1 ) )
            // InternalMinijava.g:2643:2: ( rule__VarList__VarLiAssignment_1 )
            {
             before(grammarAccess.getVarListAccess().getVarLiAssignment_1()); 
            // InternalMinijava.g:2644:2: ( rule__VarList__VarLiAssignment_1 )
            // InternalMinijava.g:2644:3: rule__VarList__VarLiAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarList__VarLiAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarListAccess().getVarLiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__1__Impl"


    // $ANTLR start "rule__VarLi__Group__0"
    // InternalMinijava.g:2653:1: rule__VarLi__Group__0 : rule__VarLi__Group__0__Impl rule__VarLi__Group__1 ;
    public final void rule__VarLi__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2657:1: ( rule__VarLi__Group__0__Impl rule__VarLi__Group__1 )
            // InternalMinijava.g:2658:2: rule__VarLi__Group__0__Impl rule__VarLi__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__VarLi__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarLi__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarLi__Group__0"


    // $ANTLR start "rule__VarLi__Group__0__Impl"
    // InternalMinijava.g:2665:1: rule__VarLi__Group__0__Impl : ( ',' ) ;
    public final void rule__VarLi__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2669:1: ( ( ',' ) )
            // InternalMinijava.g:2670:1: ( ',' )
            {
            // InternalMinijava.g:2670:1: ( ',' )
            // InternalMinijava.g:2671:2: ','
            {
             before(grammarAccess.getVarLiAccess().getCommaKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVarLiAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarLi__Group__0__Impl"


    // $ANTLR start "rule__VarLi__Group__1"
    // InternalMinijava.g:2680:1: rule__VarLi__Group__1 : rule__VarLi__Group__1__Impl rule__VarLi__Group__2 ;
    public final void rule__VarLi__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2684:1: ( rule__VarLi__Group__1__Impl rule__VarLi__Group__2 )
            // InternalMinijava.g:2685:2: rule__VarLi__Group__1__Impl rule__VarLi__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VarLi__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarLi__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarLi__Group__1"


    // $ANTLR start "rule__VarLi__Group__1__Impl"
    // InternalMinijava.g:2692:1: rule__VarLi__Group__1__Impl : ( ruleVarDeclaration ) ;
    public final void rule__VarLi__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2696:1: ( ( ruleVarDeclaration ) )
            // InternalMinijava.g:2697:1: ( ruleVarDeclaration )
            {
            // InternalMinijava.g:2697:1: ( ruleVarDeclaration )
            // InternalMinijava.g:2698:2: ruleVarDeclaration
            {
             before(grammarAccess.getVarLiAccess().getVarDeclarationParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarLiAccess().getVarDeclarationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarLi__Group__1__Impl"


    // $ANTLR start "rule__VarLi__Group__2"
    // InternalMinijava.g:2707:1: rule__VarLi__Group__2 : rule__VarLi__Group__2__Impl ;
    public final void rule__VarLi__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2711:1: ( rule__VarLi__Group__2__Impl )
            // InternalMinijava.g:2712:2: rule__VarLi__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarLi__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarLi__Group__2"


    // $ANTLR start "rule__VarLi__Group__2__Impl"
    // InternalMinijava.g:2718:1: rule__VarLi__Group__2__Impl : ( ( rule__VarLi__VarLiAssignment_2 ) ) ;
    public final void rule__VarLi__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2722:1: ( ( ( rule__VarLi__VarLiAssignment_2 ) ) )
            // InternalMinijava.g:2723:1: ( ( rule__VarLi__VarLiAssignment_2 ) )
            {
            // InternalMinijava.g:2723:1: ( ( rule__VarLi__VarLiAssignment_2 ) )
            // InternalMinijava.g:2724:2: ( rule__VarLi__VarLiAssignment_2 )
            {
             before(grammarAccess.getVarLiAccess().getVarLiAssignment_2()); 
            // InternalMinijava.g:2725:2: ( rule__VarLi__VarLiAssignment_2 )
            // InternalMinijava.g:2725:3: rule__VarLi__VarLiAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarLi__VarLiAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarLiAccess().getVarLiAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarLi__Group__2__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__0"
    // InternalMinijava.g:2734:1: rule__MethodDeclaration__Group__0 : rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 ;
    public final void rule__MethodDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2738:1: ( rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 )
            // InternalMinijava.g:2739:2: rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MethodDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__0"


    // $ANTLR start "rule__MethodDeclaration__Group__0__Impl"
    // InternalMinijava.g:2746:1: rule__MethodDeclaration__Group__0__Impl : ( ( rule__MethodDeclaration__Alternatives_0 ) ) ;
    public final void rule__MethodDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2750:1: ( ( ( rule__MethodDeclaration__Alternatives_0 ) ) )
            // InternalMinijava.g:2751:1: ( ( rule__MethodDeclaration__Alternatives_0 ) )
            {
            // InternalMinijava.g:2751:1: ( ( rule__MethodDeclaration__Alternatives_0 ) )
            // InternalMinijava.g:2752:2: ( rule__MethodDeclaration__Alternatives_0 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getAlternatives_0()); 
            // InternalMinijava.g:2753:2: ( rule__MethodDeclaration__Alternatives_0 )
            // InternalMinijava.g:2753:3: rule__MethodDeclaration__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__1"
    // InternalMinijava.g:2761:1: rule__MethodDeclaration__Group__1 : rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 ;
    public final void rule__MethodDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2765:1: ( rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 )
            // InternalMinijava.g:2766:2: rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MethodDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__1"


    // $ANTLR start "rule__MethodDeclaration__Group__1__Impl"
    // InternalMinijava.g:2773:1: rule__MethodDeclaration__Group__1__Impl : ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) ) ;
    public final void rule__MethodDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2777:1: ( ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) ) )
            // InternalMinijava.g:2778:1: ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) )
            {
            // InternalMinijava.g:2778:1: ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) )
            // InternalMinijava.g:2779:2: ( rule__MethodDeclaration__MethodTypeAssignment_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getMethodTypeAssignment_1()); 
            // InternalMinijava.g:2780:2: ( rule__MethodDeclaration__MethodTypeAssignment_1 )
            // InternalMinijava.g:2780:3: rule__MethodDeclaration__MethodTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__MethodTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getMethodTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__2"
    // InternalMinijava.g:2788:1: rule__MethodDeclaration__Group__2 : rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 ;
    public final void rule__MethodDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2792:1: ( rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 )
            // InternalMinijava.g:2793:2: rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__MethodDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__2"


    // $ANTLR start "rule__MethodDeclaration__Group__2__Impl"
    // InternalMinijava.g:2800:1: rule__MethodDeclaration__Group__2__Impl : ( ( rule__MethodDeclaration__NameAssignment_2 ) ) ;
    public final void rule__MethodDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2804:1: ( ( ( rule__MethodDeclaration__NameAssignment_2 ) ) )
            // InternalMinijava.g:2805:1: ( ( rule__MethodDeclaration__NameAssignment_2 ) )
            {
            // InternalMinijava.g:2805:1: ( ( rule__MethodDeclaration__NameAssignment_2 ) )
            // InternalMinijava.g:2806:2: ( rule__MethodDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getNameAssignment_2()); 
            // InternalMinijava.g:2807:2: ( rule__MethodDeclaration__NameAssignment_2 )
            // InternalMinijava.g:2807:3: rule__MethodDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__2__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__3"
    // InternalMinijava.g:2815:1: rule__MethodDeclaration__Group__3 : rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 ;
    public final void rule__MethodDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2819:1: ( rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 )
            // InternalMinijava.g:2820:2: rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MethodDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__3"


    // $ANTLR start "rule__MethodDeclaration__Group__3__Impl"
    // InternalMinijava.g:2827:1: rule__MethodDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2831:1: ( ( '(' ) )
            // InternalMinijava.g:2832:1: ( '(' )
            {
            // InternalMinijava.g:2832:1: ( '(' )
            // InternalMinijava.g:2833:2: '('
            {
             before(grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__3__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__4"
    // InternalMinijava.g:2842:1: rule__MethodDeclaration__Group__4 : rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 ;
    public final void rule__MethodDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2846:1: ( rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 )
            // InternalMinijava.g:2847:2: rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__MethodDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__4"


    // $ANTLR start "rule__MethodDeclaration__Group__4__Impl"
    // InternalMinijava.g:2854:1: rule__MethodDeclaration__Group__4__Impl : ( ( rule__MethodDeclaration__VarListAssignment_4 )? ) ;
    public final void rule__MethodDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2858:1: ( ( ( rule__MethodDeclaration__VarListAssignment_4 )? ) )
            // InternalMinijava.g:2859:1: ( ( rule__MethodDeclaration__VarListAssignment_4 )? )
            {
            // InternalMinijava.g:2859:1: ( ( rule__MethodDeclaration__VarListAssignment_4 )? )
            // InternalMinijava.g:2860:2: ( rule__MethodDeclaration__VarListAssignment_4 )?
            {
             before(grammarAccess.getMethodDeclarationAccess().getVarListAssignment_4()); 
            // InternalMinijava.g:2861:2: ( rule__MethodDeclaration__VarListAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==28||LA19_0==36||(LA19_0>=39 && LA19_0<=41)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMinijava.g:2861:3: rule__MethodDeclaration__VarListAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDeclaration__VarListAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDeclarationAccess().getVarListAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__4__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__5"
    // InternalMinijava.g:2869:1: rule__MethodDeclaration__Group__5 : rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 ;
    public final void rule__MethodDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2873:1: ( rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 )
            // InternalMinijava.g:2874:2: rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__MethodDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__5"


    // $ANTLR start "rule__MethodDeclaration__Group__5__Impl"
    // InternalMinijava.g:2881:1: rule__MethodDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2885:1: ( ( ')' ) )
            // InternalMinijava.g:2886:1: ( ')' )
            {
            // InternalMinijava.g:2886:1: ( ')' )
            // InternalMinijava.g:2887:2: ')'
            {
             before(grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__5__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__6"
    // InternalMinijava.g:2896:1: rule__MethodDeclaration__Group__6 : rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7 ;
    public final void rule__MethodDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2900:1: ( rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7 )
            // InternalMinijava.g:2901:2: rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__MethodDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__6"


    // $ANTLR start "rule__MethodDeclaration__Group__6__Impl"
    // InternalMinijava.g:2908:1: rule__MethodDeclaration__Group__6__Impl : ( '{' ) ;
    public final void rule__MethodDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2912:1: ( ( '{' ) )
            // InternalMinijava.g:2913:1: ( '{' )
            {
            // InternalMinijava.g:2913:1: ( '{' )
            // InternalMinijava.g:2914:2: '{'
            {
             before(grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__6__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__7"
    // InternalMinijava.g:2923:1: rule__MethodDeclaration__Group__7 : rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8 ;
    public final void rule__MethodDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2927:1: ( rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8 )
            // InternalMinijava.g:2928:2: rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__MethodDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__7"


    // $ANTLR start "rule__MethodDeclaration__Group__7__Impl"
    // InternalMinijava.g:2935:1: rule__MethodDeclaration__Group__7__Impl : ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* ) ;
    public final void rule__MethodDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2939:1: ( ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* ) )
            // InternalMinijava.g:2940:1: ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* )
            {
            // InternalMinijava.g:2940:1: ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* )
            // InternalMinijava.g:2941:2: ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsAssignment_7()); 
            // InternalMinijava.g:2942:2: ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==21) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==28||LA20_0==36||(LA20_0>=39 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMinijava.g:2942:3: rule__MethodDeclaration__LocalVarDeclarationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__MethodDeclaration__LocalVarDeclarationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__7__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__8"
    // InternalMinijava.g:2950:1: rule__MethodDeclaration__Group__8 : rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9 ;
    public final void rule__MethodDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2954:1: ( rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9 )
            // InternalMinijava.g:2955:2: rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__MethodDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__8"


    // $ANTLR start "rule__MethodDeclaration__Group__8__Impl"
    // InternalMinijava.g:2962:1: rule__MethodDeclaration__Group__8__Impl : ( ( rule__MethodDeclaration__StatementsAssignment_8 )* ) ;
    public final void rule__MethodDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2966:1: ( ( ( rule__MethodDeclaration__StatementsAssignment_8 )* ) )
            // InternalMinijava.g:2967:1: ( ( rule__MethodDeclaration__StatementsAssignment_8 )* )
            {
            // InternalMinijava.g:2967:1: ( ( rule__MethodDeclaration__StatementsAssignment_8 )* )
            // InternalMinijava.g:2968:2: ( rule__MethodDeclaration__StatementsAssignment_8 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getStatementsAssignment_8()); 
            // InternalMinijava.g:2969:2: ( rule__MethodDeclaration__StatementsAssignment_8 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==24||(LA21_0>=42 && LA21_0<=43)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMinijava.g:2969:3: rule__MethodDeclaration__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MethodDeclaration__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMethodDeclarationAccess().getStatementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__8__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__9"
    // InternalMinijava.g:2977:1: rule__MethodDeclaration__Group__9 : rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10 ;
    public final void rule__MethodDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2981:1: ( rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10 )
            // InternalMinijava.g:2982:2: rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__MethodDeclaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__9"


    // $ANTLR start "rule__MethodDeclaration__Group__9__Impl"
    // InternalMinijava.g:2989:1: rule__MethodDeclaration__Group__9__Impl : ( ( rule__MethodDeclaration__Group_9__0 )? ) ;
    public final void rule__MethodDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:2993:1: ( ( ( rule__MethodDeclaration__Group_9__0 )? ) )
            // InternalMinijava.g:2994:1: ( ( rule__MethodDeclaration__Group_9__0 )? )
            {
            // InternalMinijava.g:2994:1: ( ( rule__MethodDeclaration__Group_9__0 )? )
            // InternalMinijava.g:2995:2: ( rule__MethodDeclaration__Group_9__0 )?
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup_9()); 
            // InternalMinijava.g:2996:2: ( rule__MethodDeclaration__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMinijava.g:2996:3: rule__MethodDeclaration__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDeclaration__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDeclarationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__9__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__10"
    // InternalMinijava.g:3004:1: rule__MethodDeclaration__Group__10 : rule__MethodDeclaration__Group__10__Impl ;
    public final void rule__MethodDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3008:1: ( rule__MethodDeclaration__Group__10__Impl )
            // InternalMinijava.g:3009:2: rule__MethodDeclaration__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__10"


    // $ANTLR start "rule__MethodDeclaration__Group__10__Impl"
    // InternalMinijava.g:3015:1: rule__MethodDeclaration__Group__10__Impl : ( '}' ) ;
    public final void rule__MethodDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3019:1: ( ( '}' ) )
            // InternalMinijava.g:3020:1: ( '}' )
            {
            // InternalMinijava.g:3020:1: ( '}' )
            // InternalMinijava.g:3021:2: '}'
            {
             before(grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__10__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_9__0"
    // InternalMinijava.g:3031:1: rule__MethodDeclaration__Group_9__0 : rule__MethodDeclaration__Group_9__0__Impl rule__MethodDeclaration__Group_9__1 ;
    public final void rule__MethodDeclaration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3035:1: ( rule__MethodDeclaration__Group_9__0__Impl rule__MethodDeclaration__Group_9__1 )
            // InternalMinijava.g:3036:2: rule__MethodDeclaration__Group_9__0__Impl rule__MethodDeclaration__Group_9__1
            {
            pushFollow(FOLLOW_31);
            rule__MethodDeclaration__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__0"


    // $ANTLR start "rule__MethodDeclaration__Group_9__0__Impl"
    // InternalMinijava.g:3043:1: rule__MethodDeclaration__Group_9__0__Impl : ( 'return' ) ;
    public final void rule__MethodDeclaration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3047:1: ( ( 'return' ) )
            // InternalMinijava.g:3048:1: ( 'return' )
            {
            // InternalMinijava.g:3048:1: ( 'return' )
            // InternalMinijava.g:3049:2: 'return'
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_9__1"
    // InternalMinijava.g:3058:1: rule__MethodDeclaration__Group_9__1 : rule__MethodDeclaration__Group_9__1__Impl rule__MethodDeclaration__Group_9__2 ;
    public final void rule__MethodDeclaration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3062:1: ( rule__MethodDeclaration__Group_9__1__Impl rule__MethodDeclaration__Group_9__2 )
            // InternalMinijava.g:3063:2: rule__MethodDeclaration__Group_9__1__Impl rule__MethodDeclaration__Group_9__2
            {
            pushFollow(FOLLOW_8);
            rule__MethodDeclaration__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__1"


    // $ANTLR start "rule__MethodDeclaration__Group_9__1__Impl"
    // InternalMinijava.g:3070:1: rule__MethodDeclaration__Group_9__1__Impl : ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) ) ;
    public final void rule__MethodDeclaration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3074:1: ( ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) ) )
            // InternalMinijava.g:3075:1: ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) )
            {
            // InternalMinijava.g:3075:1: ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) )
            // InternalMinijava.g:3076:2: ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnExpressionAssignment_9_1()); 
            // InternalMinijava.g:3077:2: ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 )
            // InternalMinijava.g:3077:3: rule__MethodDeclaration__ReturnExpressionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__ReturnExpressionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getReturnExpressionAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_9__2"
    // InternalMinijava.g:3085:1: rule__MethodDeclaration__Group_9__2 : rule__MethodDeclaration__Group_9__2__Impl ;
    public final void rule__MethodDeclaration__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3089:1: ( rule__MethodDeclaration__Group_9__2__Impl )
            // InternalMinijava.g:3090:2: rule__MethodDeclaration__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__2"


    // $ANTLR start "rule__MethodDeclaration__Group_9__2__Impl"
    // InternalMinijava.g:3096:1: rule__MethodDeclaration__Group_9__2__Impl : ( ';' ) ;
    public final void rule__MethodDeclaration__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3100:1: ( ( ';' ) )
            // InternalMinijava.g:3101:1: ( ';' )
            {
            // InternalMinijava.g:3101:1: ( ';' )
            // InternalMinijava.g:3102:2: ';'
            {
             before(grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_9_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__2__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalMinijava.g:3112:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3116:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMinijava.g:3117:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalMinijava.g:3124:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__StatementTypeAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3128:1: ( ( ( rule__Statement__StatementTypeAssignment_0_0 ) ) )
            // InternalMinijava.g:3129:1: ( ( rule__Statement__StatementTypeAssignment_0_0 ) )
            {
            // InternalMinijava.g:3129:1: ( ( rule__Statement__StatementTypeAssignment_0_0 ) )
            // InternalMinijava.g:3130:2: ( rule__Statement__StatementTypeAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_0_0()); 
            // InternalMinijava.g:3131:2: ( rule__Statement__StatementTypeAssignment_0_0 )
            // InternalMinijava.g:3131:3: rule__Statement__StatementTypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalMinijava.g:3139:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3143:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalMinijava.g:3144:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalMinijava.g:3151:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__StatementsAssignment_0_1 )* ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3155:1: ( ( ( rule__Statement__StatementsAssignment_0_1 )* ) )
            // InternalMinijava.g:3156:1: ( ( rule__Statement__StatementsAssignment_0_1 )* )
            {
            // InternalMinijava.g:3156:1: ( ( rule__Statement__StatementsAssignment_0_1 )* )
            // InternalMinijava.g:3157:2: ( rule__Statement__StatementsAssignment_0_1 )*
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_0_1()); 
            // InternalMinijava.g:3158:2: ( rule__Statement__StatementsAssignment_0_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==24||(LA23_0>=42 && LA23_0<=43)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMinijava.g:3158:3: rule__Statement__StatementsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Statement__StatementsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getStatementsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__2"
    // InternalMinijava.g:3166:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3170:1: ( rule__Statement__Group_0__2__Impl )
            // InternalMinijava.g:3171:2: rule__Statement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__2"


    // $ANTLR start "rule__Statement__Group_0__2__Impl"
    // InternalMinijava.g:3177:1: rule__Statement__Group_0__2__Impl : ( '}' ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3181:1: ( ( '}' ) )
            // InternalMinijava.g:3182:1: ( '}' )
            {
            // InternalMinijava.g:3182:1: ( '}' )
            // InternalMinijava.g:3183:2: '}'
            {
             before(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalMinijava.g:3193:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3197:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalMinijava.g:3198:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalMinijava.g:3205:1: rule__Statement__Group_1__0__Impl : ( ( rule__Statement__StatementTypeAssignment_1_0 ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3209:1: ( ( ( rule__Statement__StatementTypeAssignment_1_0 ) ) )
            // InternalMinijava.g:3210:1: ( ( rule__Statement__StatementTypeAssignment_1_0 ) )
            {
            // InternalMinijava.g:3210:1: ( ( rule__Statement__StatementTypeAssignment_1_0 ) )
            // InternalMinijava.g:3211:2: ( rule__Statement__StatementTypeAssignment_1_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_1_0()); 
            // InternalMinijava.g:3212:2: ( rule__Statement__StatementTypeAssignment_1_0 )
            // InternalMinijava.g:3212:3: rule__Statement__StatementTypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalMinijava.g:3220:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3224:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalMinijava.g:3225:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalMinijava.g:3232:1: rule__Statement__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3236:1: ( ( '(' ) )
            // InternalMinijava.g:3237:1: ( '(' )
            {
            // InternalMinijava.g:3237:1: ( '(' )
            // InternalMinijava.g:3238:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // InternalMinijava.g:3247:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3251:1: ( rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 )
            // InternalMinijava.g:3252:2: rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // InternalMinijava.g:3259:1: rule__Statement__Group_1__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_1_2 ) ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3263:1: ( ( ( rule__Statement__FirstExpressionAssignment_1_2 ) ) )
            // InternalMinijava.g:3264:1: ( ( rule__Statement__FirstExpressionAssignment_1_2 ) )
            {
            // InternalMinijava.g:3264:1: ( ( rule__Statement__FirstExpressionAssignment_1_2 ) )
            // InternalMinijava.g:3265:2: ( rule__Statement__FirstExpressionAssignment_1_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_1_2()); 
            // InternalMinijava.g:3266:2: ( rule__Statement__FirstExpressionAssignment_1_2 )
            // InternalMinijava.g:3266:3: rule__Statement__FirstExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__3"
    // InternalMinijava.g:3274:1: rule__Statement__Group_1__3 : rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 ;
    public final void rule__Statement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3278:1: ( rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 )
            // InternalMinijava.g:3279:2: rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4
            {
            pushFollow(FOLLOW_32);
            rule__Statement__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__3"


    // $ANTLR start "rule__Statement__Group_1__3__Impl"
    // InternalMinijava.g:3286:1: rule__Statement__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3290:1: ( ( ')' ) )
            // InternalMinijava.g:3291:1: ( ')' )
            {
            // InternalMinijava.g:3291:1: ( ')' )
            // InternalMinijava.g:3292:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__3__Impl"


    // $ANTLR start "rule__Statement__Group_1__4"
    // InternalMinijava.g:3301:1: rule__Statement__Group_1__4 : rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5 ;
    public final void rule__Statement__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3305:1: ( rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5 )
            // InternalMinijava.g:3306:2: rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5
            {
            pushFollow(FOLLOW_33);
            rule__Statement__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__4"


    // $ANTLR start "rule__Statement__Group_1__4__Impl"
    // InternalMinijava.g:3313:1: rule__Statement__Group_1__4__Impl : ( ( rule__Statement__StatementsAssignment_1_4 ) ) ;
    public final void rule__Statement__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3317:1: ( ( ( rule__Statement__StatementsAssignment_1_4 ) ) )
            // InternalMinijava.g:3318:1: ( ( rule__Statement__StatementsAssignment_1_4 ) )
            {
            // InternalMinijava.g:3318:1: ( ( rule__Statement__StatementsAssignment_1_4 ) )
            // InternalMinijava.g:3319:2: ( rule__Statement__StatementsAssignment_1_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_1_4()); 
            // InternalMinijava.g:3320:2: ( rule__Statement__StatementsAssignment_1_4 )
            // InternalMinijava.g:3320:3: rule__Statement__StatementsAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementsAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementsAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__4__Impl"


    // $ANTLR start "rule__Statement__Group_1__5"
    // InternalMinijava.g:3328:1: rule__Statement__Group_1__5 : rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6 ;
    public final void rule__Statement__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3332:1: ( rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6 )
            // InternalMinijava.g:3333:2: rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6
            {
            pushFollow(FOLLOW_32);
            rule__Statement__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__5"


    // $ANTLR start "rule__Statement__Group_1__5__Impl"
    // InternalMinijava.g:3340:1: rule__Statement__Group_1__5__Impl : ( 'else' ) ;
    public final void rule__Statement__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3344:1: ( ( 'else' ) )
            // InternalMinijava.g:3345:1: ( 'else' )
            {
            // InternalMinijava.g:3345:1: ( 'else' )
            // InternalMinijava.g:3346:2: 'else'
            {
             before(grammarAccess.getStatementAccess().getElseKeyword_1_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getElseKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__5__Impl"


    // $ANTLR start "rule__Statement__Group_1__6"
    // InternalMinijava.g:3355:1: rule__Statement__Group_1__6 : rule__Statement__Group_1__6__Impl ;
    public final void rule__Statement__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3359:1: ( rule__Statement__Group_1__6__Impl )
            // InternalMinijava.g:3360:2: rule__Statement__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__6"


    // $ANTLR start "rule__Statement__Group_1__6__Impl"
    // InternalMinijava.g:3366:1: rule__Statement__Group_1__6__Impl : ( ( rule__Statement__StatementsAssignment_1_6 ) ) ;
    public final void rule__Statement__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3370:1: ( ( ( rule__Statement__StatementsAssignment_1_6 ) ) )
            // InternalMinijava.g:3371:1: ( ( rule__Statement__StatementsAssignment_1_6 ) )
            {
            // InternalMinijava.g:3371:1: ( ( rule__Statement__StatementsAssignment_1_6 ) )
            // InternalMinijava.g:3372:2: ( rule__Statement__StatementsAssignment_1_6 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_1_6()); 
            // InternalMinijava.g:3373:2: ( rule__Statement__StatementsAssignment_1_6 )
            // InternalMinijava.g:3373:3: rule__Statement__StatementsAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementsAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementsAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__6__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // InternalMinijava.g:3382:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3386:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // InternalMinijava.g:3387:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // InternalMinijava.g:3394:1: rule__Statement__Group_2__0__Impl : ( ( rule__Statement__StatementTypeAssignment_2_0 ) ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3398:1: ( ( ( rule__Statement__StatementTypeAssignment_2_0 ) ) )
            // InternalMinijava.g:3399:1: ( ( rule__Statement__StatementTypeAssignment_2_0 ) )
            {
            // InternalMinijava.g:3399:1: ( ( rule__Statement__StatementTypeAssignment_2_0 ) )
            // InternalMinijava.g:3400:2: ( rule__Statement__StatementTypeAssignment_2_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_2_0()); 
            // InternalMinijava.g:3401:2: ( rule__Statement__StatementTypeAssignment_2_0 )
            // InternalMinijava.g:3401:3: rule__Statement__StatementTypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // InternalMinijava.g:3409:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3413:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // InternalMinijava.g:3414:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_31);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // InternalMinijava.g:3421:1: rule__Statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3425:1: ( ( '(' ) )
            // InternalMinijava.g:3426:1: ( '(' )
            {
            // InternalMinijava.g:3426:1: ( '(' )
            // InternalMinijava.g:3427:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__2"
    // InternalMinijava.g:3436:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3440:1: ( rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 )
            // InternalMinijava.g:3441:2: rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__Statement__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2"


    // $ANTLR start "rule__Statement__Group_2__2__Impl"
    // InternalMinijava.g:3448:1: rule__Statement__Group_2__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_2_2 ) ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3452:1: ( ( ( rule__Statement__FirstExpressionAssignment_2_2 ) ) )
            // InternalMinijava.g:3453:1: ( ( rule__Statement__FirstExpressionAssignment_2_2 ) )
            {
            // InternalMinijava.g:3453:1: ( ( rule__Statement__FirstExpressionAssignment_2_2 ) )
            // InternalMinijava.g:3454:2: ( rule__Statement__FirstExpressionAssignment_2_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_2_2()); 
            // InternalMinijava.g:3455:2: ( rule__Statement__FirstExpressionAssignment_2_2 )
            // InternalMinijava.g:3455:3: rule__Statement__FirstExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2__Impl"


    // $ANTLR start "rule__Statement__Group_2__3"
    // InternalMinijava.g:3463:1: rule__Statement__Group_2__3 : rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 ;
    public final void rule__Statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3467:1: ( rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 )
            // InternalMinijava.g:3468:2: rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4
            {
            pushFollow(FOLLOW_32);
            rule__Statement__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__3"


    // $ANTLR start "rule__Statement__Group_2__3__Impl"
    // InternalMinijava.g:3475:1: rule__Statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3479:1: ( ( ')' ) )
            // InternalMinijava.g:3480:1: ( ')' )
            {
            // InternalMinijava.g:3480:1: ( ')' )
            // InternalMinijava.g:3481:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__3__Impl"


    // $ANTLR start "rule__Statement__Group_2__4"
    // InternalMinijava.g:3490:1: rule__Statement__Group_2__4 : rule__Statement__Group_2__4__Impl ;
    public final void rule__Statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3494:1: ( rule__Statement__Group_2__4__Impl )
            // InternalMinijava.g:3495:2: rule__Statement__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__4"


    // $ANTLR start "rule__Statement__Group_2__4__Impl"
    // InternalMinijava.g:3501:1: rule__Statement__Group_2__4__Impl : ( ( rule__Statement__StatementsAssignment_2_4 ) ) ;
    public final void rule__Statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3505:1: ( ( ( rule__Statement__StatementsAssignment_2_4 ) ) )
            // InternalMinijava.g:3506:1: ( ( rule__Statement__StatementsAssignment_2_4 ) )
            {
            // InternalMinijava.g:3506:1: ( ( rule__Statement__StatementsAssignment_2_4 ) )
            // InternalMinijava.g:3507:2: ( rule__Statement__StatementsAssignment_2_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_2_4()); 
            // InternalMinijava.g:3508:2: ( rule__Statement__StatementsAssignment_2_4 )
            // InternalMinijava.g:3508:3: rule__Statement__StatementsAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementsAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementsAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__4__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // InternalMinijava.g:3517:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3521:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // InternalMinijava.g:3522:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_34);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // InternalMinijava.g:3529:1: rule__Statement__Group_3__0__Impl : ( ( rule__Statement__VariableAssignment_3_0 ) ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3533:1: ( ( ( rule__Statement__VariableAssignment_3_0 ) ) )
            // InternalMinijava.g:3534:1: ( ( rule__Statement__VariableAssignment_3_0 ) )
            {
            // InternalMinijava.g:3534:1: ( ( rule__Statement__VariableAssignment_3_0 ) )
            // InternalMinijava.g:3535:2: ( rule__Statement__VariableAssignment_3_0 )
            {
             before(grammarAccess.getStatementAccess().getVariableAssignment_3_0()); 
            // InternalMinijava.g:3536:2: ( rule__Statement__VariableAssignment_3_0 )
            // InternalMinijava.g:3536:3: rule__Statement__VariableAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__VariableAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getVariableAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // InternalMinijava.g:3544:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3548:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // InternalMinijava.g:3549:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_31);
            rule__Statement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // InternalMinijava.g:3556:1: rule__Statement__Group_3__1__Impl : ( ( rule__Statement__StatementTypeAssignment_3_1 ) ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3560:1: ( ( ( rule__Statement__StatementTypeAssignment_3_1 ) ) )
            // InternalMinijava.g:3561:1: ( ( rule__Statement__StatementTypeAssignment_3_1 ) )
            {
            // InternalMinijava.g:3561:1: ( ( rule__Statement__StatementTypeAssignment_3_1 ) )
            // InternalMinijava.g:3562:2: ( rule__Statement__StatementTypeAssignment_3_1 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_3_1()); 
            // InternalMinijava.g:3563:2: ( rule__Statement__StatementTypeAssignment_3_1 )
            // InternalMinijava.g:3563:3: rule__Statement__StatementTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__2"
    // InternalMinijava.g:3571:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3575:1: ( rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 )
            // InternalMinijava.g:3576:2: rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__2"


    // $ANTLR start "rule__Statement__Group_3__2__Impl"
    // InternalMinijava.g:3583:1: rule__Statement__Group_3__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_3_2 ) ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3587:1: ( ( ( rule__Statement__FirstExpressionAssignment_3_2 ) ) )
            // InternalMinijava.g:3588:1: ( ( rule__Statement__FirstExpressionAssignment_3_2 ) )
            {
            // InternalMinijava.g:3588:1: ( ( rule__Statement__FirstExpressionAssignment_3_2 ) )
            // InternalMinijava.g:3589:2: ( rule__Statement__FirstExpressionAssignment_3_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_3_2()); 
            // InternalMinijava.g:3590:2: ( rule__Statement__FirstExpressionAssignment_3_2 )
            // InternalMinijava.g:3590:3: rule__Statement__FirstExpressionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__2__Impl"


    // $ANTLR start "rule__Statement__Group_3__3"
    // InternalMinijava.g:3598:1: rule__Statement__Group_3__3 : rule__Statement__Group_3__3__Impl ;
    public final void rule__Statement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3602:1: ( rule__Statement__Group_3__3__Impl )
            // InternalMinijava.g:3603:2: rule__Statement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__3"


    // $ANTLR start "rule__Statement__Group_3__3__Impl"
    // InternalMinijava.g:3609:1: rule__Statement__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3613:1: ( ( ';' ) )
            // InternalMinijava.g:3614:1: ( ';' )
            {
            // InternalMinijava.g:3614:1: ( ';' )
            // InternalMinijava.g:3615:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__3__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // InternalMinijava.g:3625:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3629:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalMinijava.g:3630:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // InternalMinijava.g:3637:1: rule__Statement__Group_4__0__Impl : ( ( rule__Statement__VariableAssignment_4_0 ) ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3641:1: ( ( ( rule__Statement__VariableAssignment_4_0 ) ) )
            // InternalMinijava.g:3642:1: ( ( rule__Statement__VariableAssignment_4_0 ) )
            {
            // InternalMinijava.g:3642:1: ( ( rule__Statement__VariableAssignment_4_0 ) )
            // InternalMinijava.g:3643:2: ( rule__Statement__VariableAssignment_4_0 )
            {
             before(grammarAccess.getStatementAccess().getVariableAssignment_4_0()); 
            // InternalMinijava.g:3644:2: ( rule__Statement__VariableAssignment_4_0 )
            // InternalMinijava.g:3644:3: rule__Statement__VariableAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__VariableAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getVariableAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // InternalMinijava.g:3652:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3656:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // InternalMinijava.g:3657:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_31);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // InternalMinijava.g:3664:1: rule__Statement__Group_4__1__Impl : ( ( rule__Statement__IsArrayElementAssignmentAssignment_4_1 ) ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3668:1: ( ( ( rule__Statement__IsArrayElementAssignmentAssignment_4_1 ) ) )
            // InternalMinijava.g:3669:1: ( ( rule__Statement__IsArrayElementAssignmentAssignment_4_1 ) )
            {
            // InternalMinijava.g:3669:1: ( ( rule__Statement__IsArrayElementAssignmentAssignment_4_1 ) )
            // InternalMinijava.g:3670:2: ( rule__Statement__IsArrayElementAssignmentAssignment_4_1 )
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentAssignment_4_1()); 
            // InternalMinijava.g:3671:2: ( rule__Statement__IsArrayElementAssignmentAssignment_4_1 )
            // InternalMinijava.g:3671:3: rule__Statement__IsArrayElementAssignmentAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__IsArrayElementAssignmentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getIsArrayElementAssignmentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_4__2"
    // InternalMinijava.g:3679:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3683:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // InternalMinijava.g:3684:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__Statement__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__2"


    // $ANTLR start "rule__Statement__Group_4__2__Impl"
    // InternalMinijava.g:3691:1: rule__Statement__Group_4__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_4_2 ) ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3695:1: ( ( ( rule__Statement__FirstExpressionAssignment_4_2 ) ) )
            // InternalMinijava.g:3696:1: ( ( rule__Statement__FirstExpressionAssignment_4_2 ) )
            {
            // InternalMinijava.g:3696:1: ( ( rule__Statement__FirstExpressionAssignment_4_2 ) )
            // InternalMinijava.g:3697:2: ( rule__Statement__FirstExpressionAssignment_4_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_4_2()); 
            // InternalMinijava.g:3698:2: ( rule__Statement__FirstExpressionAssignment_4_2 )
            // InternalMinijava.g:3698:3: rule__Statement__FirstExpressionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__2__Impl"


    // $ANTLR start "rule__Statement__Group_4__3"
    // InternalMinijava.g:3706:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3710:1: ( rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 )
            // InternalMinijava.g:3711:2: rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4
            {
            pushFollow(FOLLOW_34);
            rule__Statement__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__3"


    // $ANTLR start "rule__Statement__Group_4__3__Impl"
    // InternalMinijava.g:3718:1: rule__Statement__Group_4__3__Impl : ( ']' ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3722:1: ( ( ']' ) )
            // InternalMinijava.g:3723:1: ( ']' )
            {
            // InternalMinijava.g:3723:1: ( ']' )
            // InternalMinijava.g:3724:2: ']'
            {
             before(grammarAccess.getStatementAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__3__Impl"


    // $ANTLR start "rule__Statement__Group_4__4"
    // InternalMinijava.g:3733:1: rule__Statement__Group_4__4 : rule__Statement__Group_4__4__Impl rule__Statement__Group_4__5 ;
    public final void rule__Statement__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3737:1: ( rule__Statement__Group_4__4__Impl rule__Statement__Group_4__5 )
            // InternalMinijava.g:3738:2: rule__Statement__Group_4__4__Impl rule__Statement__Group_4__5
            {
            pushFollow(FOLLOW_31);
            rule__Statement__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__4"


    // $ANTLR start "rule__Statement__Group_4__4__Impl"
    // InternalMinijava.g:3745:1: rule__Statement__Group_4__4__Impl : ( ( rule__Statement__StatementTypeAssignment_4_4 ) ) ;
    public final void rule__Statement__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3749:1: ( ( ( rule__Statement__StatementTypeAssignment_4_4 ) ) )
            // InternalMinijava.g:3750:1: ( ( rule__Statement__StatementTypeAssignment_4_4 ) )
            {
            // InternalMinijava.g:3750:1: ( ( rule__Statement__StatementTypeAssignment_4_4 ) )
            // InternalMinijava.g:3751:2: ( rule__Statement__StatementTypeAssignment_4_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_4_4()); 
            // InternalMinijava.g:3752:2: ( rule__Statement__StatementTypeAssignment_4_4 )
            // InternalMinijava.g:3752:3: rule__Statement__StatementTypeAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__4__Impl"


    // $ANTLR start "rule__Statement__Group_4__5"
    // InternalMinijava.g:3760:1: rule__Statement__Group_4__5 : rule__Statement__Group_4__5__Impl rule__Statement__Group_4__6 ;
    public final void rule__Statement__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3764:1: ( rule__Statement__Group_4__5__Impl rule__Statement__Group_4__6 )
            // InternalMinijava.g:3765:2: rule__Statement__Group_4__5__Impl rule__Statement__Group_4__6
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__5"


    // $ANTLR start "rule__Statement__Group_4__5__Impl"
    // InternalMinijava.g:3772:1: rule__Statement__Group_4__5__Impl : ( ( rule__Statement__SecondExpressionAssignment_4_5 ) ) ;
    public final void rule__Statement__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3776:1: ( ( ( rule__Statement__SecondExpressionAssignment_4_5 ) ) )
            // InternalMinijava.g:3777:1: ( ( rule__Statement__SecondExpressionAssignment_4_5 ) )
            {
            // InternalMinijava.g:3777:1: ( ( rule__Statement__SecondExpressionAssignment_4_5 ) )
            // InternalMinijava.g:3778:2: ( rule__Statement__SecondExpressionAssignment_4_5 )
            {
             before(grammarAccess.getStatementAccess().getSecondExpressionAssignment_4_5()); 
            // InternalMinijava.g:3779:2: ( rule__Statement__SecondExpressionAssignment_4_5 )
            // InternalMinijava.g:3779:3: rule__Statement__SecondExpressionAssignment_4_5
            {
            pushFollow(FOLLOW_2);
            rule__Statement__SecondExpressionAssignment_4_5();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getSecondExpressionAssignment_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__5__Impl"


    // $ANTLR start "rule__Statement__Group_4__6"
    // InternalMinijava.g:3787:1: rule__Statement__Group_4__6 : rule__Statement__Group_4__6__Impl ;
    public final void rule__Statement__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3791:1: ( rule__Statement__Group_4__6__Impl )
            // InternalMinijava.g:3792:2: rule__Statement__Group_4__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__6"


    // $ANTLR start "rule__Statement__Group_4__6__Impl"
    // InternalMinijava.g:3798:1: rule__Statement__Group_4__6__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3802:1: ( ( ';' ) )
            // InternalMinijava.g:3803:1: ( ';' )
            {
            // InternalMinijava.g:3803:1: ( ';' )
            // InternalMinijava.g:3804:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__6__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMinijava.g:3814:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3818:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMinijava.g:3819:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMinijava.g:3826:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__AdditionAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3830:1: ( ( ( rule__Expression__AdditionAssignment_0 ) ) )
            // InternalMinijava.g:3831:1: ( ( rule__Expression__AdditionAssignment_0 ) )
            {
            // InternalMinijava.g:3831:1: ( ( rule__Expression__AdditionAssignment_0 ) )
            // InternalMinijava.g:3832:2: ( rule__Expression__AdditionAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getAdditionAssignment_0()); 
            // InternalMinijava.g:3833:2: ( rule__Expression__AdditionAssignment_0 )
            // InternalMinijava.g:3833:3: rule__Expression__AdditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__AdditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAdditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMinijava.g:3841:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3845:1: ( rule__Expression__Group__1__Impl )
            // InternalMinijava.g:3846:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMinijava.g:3852:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3856:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalMinijava.g:3857:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalMinijava.g:3857:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalMinijava.g:3858:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalMinijava.g:3859:2: ( rule__Expression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMinijava.g:3859:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMinijava.g:3868:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3872:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMinijava.g:3873:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMinijava.g:3880:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3884:1: ( ( () ) )
            // InternalMinijava.g:3885:1: ( () )
            {
            // InternalMinijava.g:3885:1: ( () )
            // InternalMinijava.g:3886:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            // InternalMinijava.g:3887:2: ()
            // InternalMinijava.g:3887:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMinijava.g:3895:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3899:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalMinijava.g:3900:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMinijava.g:3907:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3911:1: ( ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMinijava.g:3912:1: ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMinijava.g:3912:1: ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) )
            // InternalMinijava.g:3913:2: ( rule__Expression__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMinijava.g:3914:2: ( rule__Expression__ExpressionTypeAssignment_1_1 )
            // InternalMinijava.g:3914:3: rule__Expression__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalMinijava.g:3922:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3926:1: ( rule__Expression__Group_1__2__Impl )
            // InternalMinijava.g:3927:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalMinijava.g:3933:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3937:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalMinijava.g:3938:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalMinijava.g:3938:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalMinijava.g:3939:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalMinijava.g:3940:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalMinijava.g:3940:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalMinijava.g:3949:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3953:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalMinijava.g:3954:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalMinijava.g:3961:1: rule__Addition__Group__0__Impl : ( ( rule__Addition__MultiplicationAssignment_0 ) ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3965:1: ( ( ( rule__Addition__MultiplicationAssignment_0 ) ) )
            // InternalMinijava.g:3966:1: ( ( rule__Addition__MultiplicationAssignment_0 ) )
            {
            // InternalMinijava.g:3966:1: ( ( rule__Addition__MultiplicationAssignment_0 ) )
            // InternalMinijava.g:3967:2: ( rule__Addition__MultiplicationAssignment_0 )
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationAssignment_0()); 
            // InternalMinijava.g:3968:2: ( rule__Addition__MultiplicationAssignment_0 )
            // InternalMinijava.g:3968:3: rule__Addition__MultiplicationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__MultiplicationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getMultiplicationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalMinijava.g:3976:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3980:1: ( rule__Addition__Group__1__Impl )
            // InternalMinijava.g:3981:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalMinijava.g:3987:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:3991:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalMinijava.g:3992:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalMinijava.g:3992:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalMinijava.g:3993:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalMinijava.g:3994:2: ( rule__Addition__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=14 && LA25_0<=15)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMinijava.g:3994:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalMinijava.g:4003:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4007:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalMinijava.g:4008:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalMinijava.g:4015:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4019:1: ( ( () ) )
            // InternalMinijava.g:4020:1: ( () )
            {
            // InternalMinijava.g:4020:1: ( () )
            // InternalMinijava.g:4021:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalMinijava.g:4022:2: ()
            // InternalMinijava.g:4022:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalMinijava.g:4030:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4034:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalMinijava.g:4035:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalMinijava.g:4042:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4046:1: ( ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMinijava.g:4047:1: ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMinijava.g:4047:1: ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) )
            // InternalMinijava.g:4048:2: ( rule__Addition__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMinijava.g:4049:2: ( rule__Addition__ExpressionTypeAssignment_1_1 )
            // InternalMinijava.g:4049:3: rule__Addition__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalMinijava.g:4057:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4061:1: ( rule__Addition__Group_1__2__Impl )
            // InternalMinijava.g:4062:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalMinijava.g:4068:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4072:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalMinijava.g:4073:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalMinijava.g:4073:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalMinijava.g:4074:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalMinijava.g:4075:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalMinijava.g:4075:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalMinijava.g:4084:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4088:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalMinijava.g:4089:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalMinijava.g:4096:1: rule__Multiplication__Group__0__Impl : ( ( rule__Multiplication__NegationOrPointExpressionAssignment_0 ) ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4100:1: ( ( ( rule__Multiplication__NegationOrPointExpressionAssignment_0 ) ) )
            // InternalMinijava.g:4101:1: ( ( rule__Multiplication__NegationOrPointExpressionAssignment_0 ) )
            {
            // InternalMinijava.g:4101:1: ( ( rule__Multiplication__NegationOrPointExpressionAssignment_0 ) )
            // InternalMinijava.g:4102:2: ( rule__Multiplication__NegationOrPointExpressionAssignment_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionAssignment_0()); 
            // InternalMinijava.g:4103:2: ( rule__Multiplication__NegationOrPointExpressionAssignment_0 )
            // InternalMinijava.g:4103:3: rule__Multiplication__NegationOrPointExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__NegationOrPointExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalMinijava.g:4111:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4115:1: ( rule__Multiplication__Group__1__Impl )
            // InternalMinijava.g:4116:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalMinijava.g:4122:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4126:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalMinijava.g:4127:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalMinijava.g:4127:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalMinijava.g:4128:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalMinijava.g:4129:2: ( rule__Multiplication__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=16 && LA26_0<=17)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMinijava.g:4129:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalMinijava.g:4138:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4142:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalMinijava.g:4143:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalMinijava.g:4150:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4154:1: ( ( () ) )
            // InternalMinijava.g:4155:1: ( () )
            {
            // InternalMinijava.g:4155:1: ( () )
            // InternalMinijava.g:4156:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalMinijava.g:4157:2: ()
            // InternalMinijava.g:4157:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalMinijava.g:4165:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4169:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalMinijava.g:4170:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalMinijava.g:4177:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4181:1: ( ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMinijava.g:4182:1: ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMinijava.g:4182:1: ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) )
            // InternalMinijava.g:4183:2: ( rule__Multiplication__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMinijava.g:4184:2: ( rule__Multiplication__ExpressionTypeAssignment_1_1 )
            // InternalMinijava.g:4184:3: rule__Multiplication__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalMinijava.g:4192:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4196:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalMinijava.g:4197:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalMinijava.g:4203:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4207:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalMinijava.g:4208:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalMinijava.g:4208:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalMinijava.g:4209:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalMinijava.g:4210:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalMinijava.g:4210:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Negation__Group__0"
    // InternalMinijava.g:4219:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4223:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // InternalMinijava.g:4224:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // InternalMinijava.g:4231:1: rule__Negation__Group__0__Impl : ( ( rule__Negation__ExpressionTypeAssignment_0 ) ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4235:1: ( ( ( rule__Negation__ExpressionTypeAssignment_0 ) ) )
            // InternalMinijava.g:4236:1: ( ( rule__Negation__ExpressionTypeAssignment_0 ) )
            {
            // InternalMinijava.g:4236:1: ( ( rule__Negation__ExpressionTypeAssignment_0 ) )
            // InternalMinijava.g:4237:2: ( rule__Negation__ExpressionTypeAssignment_0 )
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeAssignment_0()); 
            // InternalMinijava.g:4238:2: ( rule__Negation__ExpressionTypeAssignment_0 )
            // InternalMinijava.g:4238:3: rule__Negation__ExpressionTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Negation__ExpressionTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getExpressionTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // InternalMinijava.g:4246:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4250:1: ( rule__Negation__Group__1__Impl )
            // InternalMinijava.g:4251:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // InternalMinijava.g:4257:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__RightAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4261:1: ( ( ( rule__Negation__RightAssignment_1 ) ) )
            // InternalMinijava.g:4262:1: ( ( rule__Negation__RightAssignment_1 ) )
            {
            // InternalMinijava.g:4262:1: ( ( rule__Negation__RightAssignment_1 ) )
            // InternalMinijava.g:4263:2: ( rule__Negation__RightAssignment_1 )
            {
             before(grammarAccess.getNegationAccess().getRightAssignment_1()); 
            // InternalMinijava.g:4264:2: ( rule__Negation__RightAssignment_1 )
            // InternalMinijava.g:4264:3: rule__Negation__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negation__RightAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getRightAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalMinijava.g:4273:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4277:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalMinijava.g:4278:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalMinijava.g:4285:1: rule__Point__Group__0__Impl : ( ( rule__Point__SquareBracketsAssignment_0 ) ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4289:1: ( ( ( rule__Point__SquareBracketsAssignment_0 ) ) )
            // InternalMinijava.g:4290:1: ( ( rule__Point__SquareBracketsAssignment_0 ) )
            {
            // InternalMinijava.g:4290:1: ( ( rule__Point__SquareBracketsAssignment_0 ) )
            // InternalMinijava.g:4291:2: ( rule__Point__SquareBracketsAssignment_0 )
            {
             before(grammarAccess.getPointAccess().getSquareBracketsAssignment_0()); 
            // InternalMinijava.g:4292:2: ( rule__Point__SquareBracketsAssignment_0 )
            // InternalMinijava.g:4292:3: rule__Point__SquareBracketsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Point__SquareBracketsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getSquareBracketsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalMinijava.g:4300:1: rule__Point__Group__1 : rule__Point__Group__1__Impl ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4304:1: ( rule__Point__Group__1__Impl )
            // InternalMinijava.g:4305:2: rule__Point__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalMinijava.g:4311:1: rule__Point__Group__1__Impl : ( ( rule__Point__Group_1__0 )* ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4315:1: ( ( ( rule__Point__Group_1__0 )* ) )
            // InternalMinijava.g:4316:1: ( ( rule__Point__Group_1__0 )* )
            {
            // InternalMinijava.g:4316:1: ( ( rule__Point__Group_1__0 )* )
            // InternalMinijava.g:4317:2: ( rule__Point__Group_1__0 )*
            {
             before(grammarAccess.getPointAccess().getGroup_1()); 
            // InternalMinijava.g:4318:2: ( rule__Point__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMinijava.g:4318:3: rule__Point__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Point__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPointAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group_1__0"
    // InternalMinijava.g:4327:1: rule__Point__Group_1__0 : rule__Point__Group_1__0__Impl rule__Point__Group_1__1 ;
    public final void rule__Point__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4331:1: ( rule__Point__Group_1__0__Impl rule__Point__Group_1__1 )
            // InternalMinijava.g:4332:2: rule__Point__Group_1__0__Impl rule__Point__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Point__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__0"


    // $ANTLR start "rule__Point__Group_1__0__Impl"
    // InternalMinijava.g:4339:1: rule__Point__Group_1__0__Impl : ( () ) ;
    public final void rule__Point__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4343:1: ( ( () ) )
            // InternalMinijava.g:4344:1: ( () )
            {
            // InternalMinijava.g:4344:1: ( () )
            // InternalMinijava.g:4345:2: ()
            {
             before(grammarAccess.getPointAccess().getPointLeftAction_1_0()); 
            // InternalMinijava.g:4346:2: ()
            // InternalMinijava.g:4346:3: 
            {
            }

             after(grammarAccess.getPointAccess().getPointLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__0__Impl"


    // $ANTLR start "rule__Point__Group_1__1"
    // InternalMinijava.g:4354:1: rule__Point__Group_1__1 : rule__Point__Group_1__1__Impl rule__Point__Group_1__2 ;
    public final void rule__Point__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4358:1: ( rule__Point__Group_1__1__Impl rule__Point__Group_1__2 )
            // InternalMinijava.g:4359:2: rule__Point__Group_1__1__Impl rule__Point__Group_1__2
            {
            pushFollow(FOLLOW_41);
            rule__Point__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__1"


    // $ANTLR start "rule__Point__Group_1__1__Impl"
    // InternalMinijava.g:4366:1: rule__Point__Group_1__1__Impl : ( ( rule__Point__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Point__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4370:1: ( ( ( rule__Point__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMinijava.g:4371:1: ( ( rule__Point__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMinijava.g:4371:1: ( ( rule__Point__ExpressionTypeAssignment_1_1 ) )
            // InternalMinijava.g:4372:2: ( rule__Point__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getPointAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMinijava.g:4373:2: ( rule__Point__ExpressionTypeAssignment_1_1 )
            // InternalMinijava.g:4373:3: rule__Point__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__1__Impl"


    // $ANTLR start "rule__Point__Group_1__2"
    // InternalMinijava.g:4381:1: rule__Point__Group_1__2 : rule__Point__Group_1__2__Impl ;
    public final void rule__Point__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4385:1: ( rule__Point__Group_1__2__Impl )
            // InternalMinijava.g:4386:2: rule__Point__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__2"


    // $ANTLR start "rule__Point__Group_1__2__Impl"
    // InternalMinijava.g:4392:1: rule__Point__Group_1__2__Impl : ( ( rule__Point__RightAssignment_1_2 ) ) ;
    public final void rule__Point__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4396:1: ( ( ( rule__Point__RightAssignment_1_2 ) ) )
            // InternalMinijava.g:4397:1: ( ( rule__Point__RightAssignment_1_2 ) )
            {
            // InternalMinijava.g:4397:1: ( ( rule__Point__RightAssignment_1_2 ) )
            // InternalMinijava.g:4398:2: ( rule__Point__RightAssignment_1_2 )
            {
             before(grammarAccess.getPointAccess().getRightAssignment_1_2()); 
            // InternalMinijava.g:4399:2: ( rule__Point__RightAssignment_1_2 )
            // InternalMinijava.g:4399:3: rule__Point__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Point__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__2__Impl"


    // $ANTLR start "rule__SquareBrackets__Group__0"
    // InternalMinijava.g:4408:1: rule__SquareBrackets__Group__0 : rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1 ;
    public final void rule__SquareBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4412:1: ( rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1 )
            // InternalMinijava.g:4413:2: rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SquareBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group__0"


    // $ANTLR start "rule__SquareBrackets__Group__0__Impl"
    // InternalMinijava.g:4420:1: rule__SquareBrackets__Group__0__Impl : ( ( rule__SquareBrackets__PrimaryAssignment_0 ) ) ;
    public final void rule__SquareBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4424:1: ( ( ( rule__SquareBrackets__PrimaryAssignment_0 ) ) )
            // InternalMinijava.g:4425:1: ( ( rule__SquareBrackets__PrimaryAssignment_0 ) )
            {
            // InternalMinijava.g:4425:1: ( ( rule__SquareBrackets__PrimaryAssignment_0 ) )
            // InternalMinijava.g:4426:2: ( rule__SquareBrackets__PrimaryAssignment_0 )
            {
             before(grammarAccess.getSquareBracketsAccess().getPrimaryAssignment_0()); 
            // InternalMinijava.g:4427:2: ( rule__SquareBrackets__PrimaryAssignment_0 )
            // InternalMinijava.g:4427:3: rule__SquareBrackets__PrimaryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__PrimaryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSquareBracketsAccess().getPrimaryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group__0__Impl"


    // $ANTLR start "rule__SquareBrackets__Group__1"
    // InternalMinijava.g:4435:1: rule__SquareBrackets__Group__1 : rule__SquareBrackets__Group__1__Impl ;
    public final void rule__SquareBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4439:1: ( rule__SquareBrackets__Group__1__Impl )
            // InternalMinijava.g:4440:2: rule__SquareBrackets__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group__1"


    // $ANTLR start "rule__SquareBrackets__Group__1__Impl"
    // InternalMinijava.g:4446:1: rule__SquareBrackets__Group__1__Impl : ( ( rule__SquareBrackets__Group_1__0 )? ) ;
    public final void rule__SquareBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4450:1: ( ( ( rule__SquareBrackets__Group_1__0 )? ) )
            // InternalMinijava.g:4451:1: ( ( rule__SquareBrackets__Group_1__0 )? )
            {
            // InternalMinijava.g:4451:1: ( ( rule__SquareBrackets__Group_1__0 )? )
            // InternalMinijava.g:4452:2: ( rule__SquareBrackets__Group_1__0 )?
            {
             before(grammarAccess.getSquareBracketsAccess().getGroup_1()); 
            // InternalMinijava.g:4453:2: ( rule__SquareBrackets__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMinijava.g:4453:3: rule__SquareBrackets__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SquareBrackets__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSquareBracketsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group__1__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__0"
    // InternalMinijava.g:4462:1: rule__SquareBrackets__Group_1__0 : rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1 ;
    public final void rule__SquareBrackets__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4466:1: ( rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1 )
            // InternalMinijava.g:4467:2: rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__SquareBrackets__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__0"


    // $ANTLR start "rule__SquareBrackets__Group_1__0__Impl"
    // InternalMinijava.g:4474:1: rule__SquareBrackets__Group_1__0__Impl : ( () ) ;
    public final void rule__SquareBrackets__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4478:1: ( ( () ) )
            // InternalMinijava.g:4479:1: ( () )
            {
            // InternalMinijava.g:4479:1: ( () )
            // InternalMinijava.g:4480:2: ()
            {
             before(grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0()); 
            // InternalMinijava.g:4481:2: ()
            // InternalMinijava.g:4481:3: 
            {
            }

             after(grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__0__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__1"
    // InternalMinijava.g:4489:1: rule__SquareBrackets__Group_1__1 : rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2 ;
    public final void rule__SquareBrackets__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4493:1: ( rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2 )
            // InternalMinijava.g:4494:2: rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__SquareBrackets__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__1"


    // $ANTLR start "rule__SquareBrackets__Group_1__1__Impl"
    // InternalMinijava.g:4501:1: rule__SquareBrackets__Group_1__1__Impl : ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__SquareBrackets__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4505:1: ( ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMinijava.g:4506:1: ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMinijava.g:4506:1: ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) )
            // InternalMinijava.g:4507:2: ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMinijava.g:4508:2: ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 )
            // InternalMinijava.g:4508:3: rule__SquareBrackets__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSquareBracketsAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__1__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__2"
    // InternalMinijava.g:4516:1: rule__SquareBrackets__Group_1__2 : rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3 ;
    public final void rule__SquareBrackets__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4520:1: ( rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3 )
            // InternalMinijava.g:4521:2: rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__SquareBrackets__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__2"


    // $ANTLR start "rule__SquareBrackets__Group_1__2__Impl"
    // InternalMinijava.g:4528:1: rule__SquareBrackets__Group_1__2__Impl : ( ( rule__SquareBrackets__RightAssignment_1_2 ) ) ;
    public final void rule__SquareBrackets__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4532:1: ( ( ( rule__SquareBrackets__RightAssignment_1_2 ) ) )
            // InternalMinijava.g:4533:1: ( ( rule__SquareBrackets__RightAssignment_1_2 ) )
            {
            // InternalMinijava.g:4533:1: ( ( rule__SquareBrackets__RightAssignment_1_2 ) )
            // InternalMinijava.g:4534:2: ( rule__SquareBrackets__RightAssignment_1_2 )
            {
             before(grammarAccess.getSquareBracketsAccess().getRightAssignment_1_2()); 
            // InternalMinijava.g:4535:2: ( rule__SquareBrackets__RightAssignment_1_2 )
            // InternalMinijava.g:4535:3: rule__SquareBrackets__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSquareBracketsAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__2__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__3"
    // InternalMinijava.g:4543:1: rule__SquareBrackets__Group_1__3 : rule__SquareBrackets__Group_1__3__Impl ;
    public final void rule__SquareBrackets__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4547:1: ( rule__SquareBrackets__Group_1__3__Impl )
            // InternalMinijava.g:4548:2: rule__SquareBrackets__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__3"


    // $ANTLR start "rule__SquareBrackets__Group_1__3__Impl"
    // InternalMinijava.g:4554:1: rule__SquareBrackets__Group_1__3__Impl : ( ']' ) ;
    public final void rule__SquareBrackets__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4558:1: ( ( ']' ) )
            // InternalMinijava.g:4559:1: ( ']' )
            {
            // InternalMinijava.g:4559:1: ( ']' )
            // InternalMinijava.g:4560:2: ']'
            {
             before(grammarAccess.getSquareBracketsAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSquareBracketsAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__3__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalMinijava.g:4570:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4574:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalMinijava.g:4575:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_42);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalMinijava.g:4582:1: rule__Primary__Group_3__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4586:1: ( ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) ) )
            // InternalMinijava.g:4587:1: ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) )
            {
            // InternalMinijava.g:4587:1: ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) )
            // InternalMinijava.g:4588:2: ( rule__Primary__ExpressionTypeAssignment_3_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_3_0()); 
            // InternalMinijava.g:4589:2: ( rule__Primary__ExpressionTypeAssignment_3_0 )
            // InternalMinijava.g:4589:3: rule__Primary__ExpressionTypeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionTypeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalMinijava.g:4597:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4601:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalMinijava.g:4602:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalMinijava.g:4609:1: rule__Primary__Group_3__1__Impl : ( 'int' ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4613:1: ( ( 'int' ) )
            // InternalMinijava.g:4614:1: ( 'int' )
            {
            // InternalMinijava.g:4614:1: ( 'int' )
            // InternalMinijava.g:4615:2: 'int'
            {
             before(grammarAccess.getPrimaryAccess().getIntKeyword_3_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getIntKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalMinijava.g:4624:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4628:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalMinijava.g:4629:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
            {
            pushFollow(FOLLOW_31);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalMinijava.g:4636:1: rule__Primary__Group_3__2__Impl : ( '[' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4640:1: ( ( '[' ) )
            // InternalMinijava.g:4641:1: ( '[' )
            {
            // InternalMinijava.g:4641:1: ( '[' )
            // InternalMinijava.g:4642:2: '['
            {
             before(grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__3"
    // InternalMinijava.g:4651:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4655:1: ( rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 )
            // InternalMinijava.g:4656:2: rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4
            {
            pushFollow(FOLLOW_19);
            rule__Primary__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3"


    // $ANTLR start "rule__Primary__Group_3__3__Impl"
    // InternalMinijava.g:4663:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__ExpressionAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4667:1: ( ( ( rule__Primary__ExpressionAssignment_3_3 ) ) )
            // InternalMinijava.g:4668:1: ( ( rule__Primary__ExpressionAssignment_3_3 ) )
            {
            // InternalMinijava.g:4668:1: ( ( rule__Primary__ExpressionAssignment_3_3 ) )
            // InternalMinijava.g:4669:2: ( rule__Primary__ExpressionAssignment_3_3 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_3()); 
            // InternalMinijava.g:4670:2: ( rule__Primary__ExpressionAssignment_3_3 )
            // InternalMinijava.g:4670:3: rule__Primary__ExpressionAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3__Impl"


    // $ANTLR start "rule__Primary__Group_3__4"
    // InternalMinijava.g:4678:1: rule__Primary__Group_3__4 : rule__Primary__Group_3__4__Impl ;
    public final void rule__Primary__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4682:1: ( rule__Primary__Group_3__4__Impl )
            // InternalMinijava.g:4683:2: rule__Primary__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__4"


    // $ANTLR start "rule__Primary__Group_3__4__Impl"
    // InternalMinijava.g:4689:1: rule__Primary__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Primary__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4693:1: ( ( ']' ) )
            // InternalMinijava.g:4694:1: ( ']' )
            {
            // InternalMinijava.g:4694:1: ( ']' )
            // InternalMinijava.g:4695:2: ']'
            {
             before(grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__4__Impl"


    // $ANTLR start "rule__Primary__Group_4__0"
    // InternalMinijava.g:4705:1: rule__Primary__Group_4__0 : rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 ;
    public final void rule__Primary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4709:1: ( rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 )
            // InternalMinijava.g:4710:2: rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__Primary__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0"


    // $ANTLR start "rule__Primary__Group_4__0__Impl"
    // InternalMinijava.g:4717:1: rule__Primary__Group_4__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) ) ;
    public final void rule__Primary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4721:1: ( ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) ) )
            // InternalMinijava.g:4722:1: ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) )
            {
            // InternalMinijava.g:4722:1: ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) )
            // InternalMinijava.g:4723:2: ( rule__Primary__ExpressionTypeAssignment_4_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_4_0()); 
            // InternalMinijava.g:4724:2: ( rule__Primary__ExpressionTypeAssignment_4_0 )
            // InternalMinijava.g:4724:3: rule__Primary__ExpressionTypeAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionTypeAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_4__1"
    // InternalMinijava.g:4732:1: rule__Primary__Group_4__1 : rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 ;
    public final void rule__Primary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4736:1: ( rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 )
            // InternalMinijava.g:4737:2: rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1"


    // $ANTLR start "rule__Primary__Group_4__1__Impl"
    // InternalMinijava.g:4744:1: rule__Primary__Group_4__1__Impl : ( ( rule__Primary__TypeAssignment_4_1 ) ) ;
    public final void rule__Primary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4748:1: ( ( ( rule__Primary__TypeAssignment_4_1 ) ) )
            // InternalMinijava.g:4749:1: ( ( rule__Primary__TypeAssignment_4_1 ) )
            {
            // InternalMinijava.g:4749:1: ( ( rule__Primary__TypeAssignment_4_1 ) )
            // InternalMinijava.g:4750:2: ( rule__Primary__TypeAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryAccess().getTypeAssignment_4_1()); 
            // InternalMinijava.g:4751:2: ( rule__Primary__TypeAssignment_4_1 )
            // InternalMinijava.g:4751:3: rule__Primary__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_4__2"
    // InternalMinijava.g:4759:1: rule__Primary__Group_4__2 : rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 ;
    public final void rule__Primary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4763:1: ( rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 )
            // InternalMinijava.g:4764:2: rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2"


    // $ANTLR start "rule__Primary__Group_4__2__Impl"
    // InternalMinijava.g:4771:1: rule__Primary__Group_4__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4775:1: ( ( '(' ) )
            // InternalMinijava.g:4776:1: ( '(' )
            {
            // InternalMinijava.g:4776:1: ( '(' )
            // InternalMinijava.g:4777:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2__Impl"


    // $ANTLR start "rule__Primary__Group_4__3"
    // InternalMinijava.g:4786:1: rule__Primary__Group_4__3 : rule__Primary__Group_4__3__Impl ;
    public final void rule__Primary__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4790:1: ( rule__Primary__Group_4__3__Impl )
            // InternalMinijava.g:4791:2: rule__Primary__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__3"


    // $ANTLR start "rule__Primary__Group_4__3__Impl"
    // InternalMinijava.g:4797:1: rule__Primary__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4801:1: ( ( ')' ) )
            // InternalMinijava.g:4802:1: ( ')' )
            {
            // InternalMinijava.g:4802:1: ( ')' )
            // InternalMinijava.g:4803:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__3__Impl"


    // $ANTLR start "rule__Primary__Group_5__0"
    // InternalMinijava.g:4813:1: rule__Primary__Group_5__0 : rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 ;
    public final void rule__Primary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4817:1: ( rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 )
            // InternalMinijava.g:4818:2: rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__Primary__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__0"


    // $ANTLR start "rule__Primary__Group_5__0__Impl"
    // InternalMinijava.g:4825:1: rule__Primary__Group_5__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) ) ;
    public final void rule__Primary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4829:1: ( ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) ) )
            // InternalMinijava.g:4830:1: ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) )
            {
            // InternalMinijava.g:4830:1: ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) )
            // InternalMinijava.g:4831:2: ( rule__Primary__ExpressionTypeAssignment_5_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_5_0()); 
            // InternalMinijava.g:4832:2: ( rule__Primary__ExpressionTypeAssignment_5_0 )
            // InternalMinijava.g:4832:3: rule__Primary__ExpressionTypeAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionTypeAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__0__Impl"


    // $ANTLR start "rule__Primary__Group_5__1"
    // InternalMinijava.g:4840:1: rule__Primary__Group_5__1 : rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 ;
    public final void rule__Primary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4844:1: ( rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 )
            // InternalMinijava.g:4845:2: rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__1"


    // $ANTLR start "rule__Primary__Group_5__1__Impl"
    // InternalMinijava.g:4852:1: rule__Primary__Group_5__1__Impl : ( ( rule__Primary__ExpressionAssignment_5_1 ) ) ;
    public final void rule__Primary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4856:1: ( ( ( rule__Primary__ExpressionAssignment_5_1 ) ) )
            // InternalMinijava.g:4857:1: ( ( rule__Primary__ExpressionAssignment_5_1 ) )
            {
            // InternalMinijava.g:4857:1: ( ( rule__Primary__ExpressionAssignment_5_1 ) )
            // InternalMinijava.g:4858:2: ( rule__Primary__ExpressionAssignment_5_1 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_5_1()); 
            // InternalMinijava.g:4859:2: ( rule__Primary__ExpressionAssignment_5_1 )
            // InternalMinijava.g:4859:3: rule__Primary__ExpressionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__1__Impl"


    // $ANTLR start "rule__Primary__Group_5__2"
    // InternalMinijava.g:4867:1: rule__Primary__Group_5__2 : rule__Primary__Group_5__2__Impl ;
    public final void rule__Primary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4871:1: ( rule__Primary__Group_5__2__Impl )
            // InternalMinijava.g:4872:2: rule__Primary__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__2"


    // $ANTLR start "rule__Primary__Group_5__2__Impl"
    // InternalMinijava.g:4878:1: rule__Primary__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4882:1: ( ( ')' ) )
            // InternalMinijava.g:4883:1: ( ')' )
            {
            // InternalMinijava.g:4883:1: ( ')' )
            // InternalMinijava.g:4884:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__2__Impl"


    // $ANTLR start "rule__MethodCall__Group__0"
    // InternalMinijava.g:4894:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4898:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalMinijava.g:4899:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // InternalMinijava.g:4906:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__MethodAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4910:1: ( ( ( rule__MethodCall__MethodAssignment_0 ) ) )
            // InternalMinijava.g:4911:1: ( ( rule__MethodCall__MethodAssignment_0 ) )
            {
            // InternalMinijava.g:4911:1: ( ( rule__MethodCall__MethodAssignment_0 ) )
            // InternalMinijava.g:4912:2: ( rule__MethodCall__MethodAssignment_0 )
            {
             before(grammarAccess.getMethodCallAccess().getMethodAssignment_0()); 
            // InternalMinijava.g:4913:2: ( rule__MethodCall__MethodAssignment_0 )
            // InternalMinijava.g:4913:3: rule__MethodCall__MethodAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__MethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getMethodAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // InternalMinijava.g:4921:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4925:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // InternalMinijava.g:4926:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // InternalMinijava.g:4933:1: rule__MethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4937:1: ( ( '(' ) )
            // InternalMinijava.g:4938:1: ( '(' )
            {
            // InternalMinijava.g:4938:1: ( '(' )
            // InternalMinijava.g:4939:2: '('
            {
             before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__2"
    // InternalMinijava.g:4948:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4952:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // InternalMinijava.g:4953:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2"


    // $ANTLR start "rule__MethodCall__Group__2__Impl"
    // InternalMinijava.g:4960:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__Group_2__0 )? ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4964:1: ( ( ( rule__MethodCall__Group_2__0 )? ) )
            // InternalMinijava.g:4965:1: ( ( rule__MethodCall__Group_2__0 )? )
            {
            // InternalMinijava.g:4965:1: ( ( rule__MethodCall__Group_2__0 )? )
            // InternalMinijava.g:4966:2: ( rule__MethodCall__Group_2__0 )?
            {
             before(grammarAccess.getMethodCallAccess().getGroup_2()); 
            // InternalMinijava.g:4967:2: ( rule__MethodCall__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==28||(LA29_0>=46 && LA29_0<=50)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMinijava.g:4967:3: rule__MethodCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2__Impl"


    // $ANTLR start "rule__MethodCall__Group__3"
    // InternalMinijava.g:4975:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4979:1: ( rule__MethodCall__Group__3__Impl )
            // InternalMinijava.g:4980:2: rule__MethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__3"


    // $ANTLR start "rule__MethodCall__Group__3__Impl"
    // InternalMinijava.g:4986:1: rule__MethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:4990:1: ( ( ')' ) )
            // InternalMinijava.g:4991:1: ( ')' )
            {
            // InternalMinijava.g:4991:1: ( ')' )
            // InternalMinijava.g:4992:2: ')'
            {
             before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__3__Impl"


    // $ANTLR start "rule__MethodCall__Group_2__0"
    // InternalMinijava.g:5002:1: rule__MethodCall__Group_2__0 : rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 ;
    public final void rule__MethodCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5006:1: ( rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 )
            // InternalMinijava.g:5007:2: rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MethodCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2__0"


    // $ANTLR start "rule__MethodCall__Group_2__0__Impl"
    // InternalMinijava.g:5014:1: rule__MethodCall__Group_2__0__Impl : ( ( rule__MethodCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__MethodCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5018:1: ( ( ( rule__MethodCall__ParametersAssignment_2_0 ) ) )
            // InternalMinijava.g:5019:1: ( ( rule__MethodCall__ParametersAssignment_2_0 ) )
            {
            // InternalMinijava.g:5019:1: ( ( rule__MethodCall__ParametersAssignment_2_0 ) )
            // InternalMinijava.g:5020:2: ( rule__MethodCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getMethodCallAccess().getParametersAssignment_2_0()); 
            // InternalMinijava.g:5021:2: ( rule__MethodCall__ParametersAssignment_2_0 )
            // InternalMinijava.g:5021:3: rule__MethodCall__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getParametersAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_2__1"
    // InternalMinijava.g:5029:1: rule__MethodCall__Group_2__1 : rule__MethodCall__Group_2__1__Impl ;
    public final void rule__MethodCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5033:1: ( rule__MethodCall__Group_2__1__Impl )
            // InternalMinijava.g:5034:2: rule__MethodCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2__1"


    // $ANTLR start "rule__MethodCall__Group_2__1__Impl"
    // InternalMinijava.g:5040:1: rule__MethodCall__Group_2__1__Impl : ( ( rule__MethodCall__Group_2_1__0 )* ) ;
    public final void rule__MethodCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5044:1: ( ( ( rule__MethodCall__Group_2_1__0 )* ) )
            // InternalMinijava.g:5045:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            {
            // InternalMinijava.g:5045:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            // InternalMinijava.g:5046:2: ( rule__MethodCall__Group_2_1__0 )*
            {
             before(grammarAccess.getMethodCallAccess().getGroup_2_1()); 
            // InternalMinijava.g:5047:2: ( rule__MethodCall__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMinijava.g:5047:3: rule__MethodCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__MethodCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMethodCallAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_2_1__0"
    // InternalMinijava.g:5056:1: rule__MethodCall__Group_2_1__0 : rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 ;
    public final void rule__MethodCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5060:1: ( rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 )
            // InternalMinijava.g:5061:2: rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1
            {
            pushFollow(FOLLOW_31);
            rule__MethodCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2_1__0"


    // $ANTLR start "rule__MethodCall__Group_2_1__0__Impl"
    // InternalMinijava.g:5068:1: rule__MethodCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5072:1: ( ( ',' ) )
            // InternalMinijava.g:5073:1: ( ',' )
            {
            // InternalMinijava.g:5073:1: ( ',' )
            // InternalMinijava.g:5074:2: ','
            {
             before(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_2_1__1"
    // InternalMinijava.g:5083:1: rule__MethodCall__Group_2_1__1 : rule__MethodCall__Group_2_1__1__Impl ;
    public final void rule__MethodCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5087:1: ( rule__MethodCall__Group_2_1__1__Impl )
            // InternalMinijava.g:5088:2: rule__MethodCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2_1__1"


    // $ANTLR start "rule__MethodCall__Group_2_1__1__Impl"
    // InternalMinijava.g:5094:1: rule__MethodCall__Group_2_1__1__Impl : ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__MethodCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5098:1: ( ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) ) )
            // InternalMinijava.g:5099:1: ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalMinijava.g:5099:1: ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) )
            // InternalMinijava.g:5100:2: ( rule__MethodCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodCallAccess().getParametersAssignment_2_1_1()); 
            // InternalMinijava.g:5101:2: ( rule__MethodCall__ParametersAssignment_2_1_1 )
            // InternalMinijava.g:5101:3: rule__MethodCall__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__Goal__PackageAssignment_0"
    // InternalMinijava.g:5110:1: rule__Goal__PackageAssignment_0 : ( rulePackageDecl ) ;
    public final void rule__Goal__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5114:1: ( ( rulePackageDecl ) )
            // InternalMinijava.g:5115:2: ( rulePackageDecl )
            {
            // InternalMinijava.g:5115:2: ( rulePackageDecl )
            // InternalMinijava.g:5116:3: rulePackageDecl
            {
             before(grammarAccess.getGoalAccess().getPackagePackageDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackageDecl();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getPackagePackageDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__PackageAssignment_0"


    // $ANTLR start "rule__Goal__ImportdeclAssignment_1"
    // InternalMinijava.g:5125:1: rule__Goal__ImportdeclAssignment_1 : ( ruleImportDecl ) ;
    public final void rule__Goal__ImportdeclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5129:1: ( ( ruleImportDecl ) )
            // InternalMinijava.g:5130:2: ( ruleImportDecl )
            {
            // InternalMinijava.g:5130:2: ( ruleImportDecl )
            // InternalMinijava.g:5131:3: ruleImportDecl
            {
             before(grammarAccess.getGoalAccess().getImportdeclImportDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportDecl();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getImportdeclImportDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__ImportdeclAssignment_1"


    // $ANTLR start "rule__Goal__ClassDeclarationsAssignment_2"
    // InternalMinijava.g:5140:1: rule__Goal__ClassDeclarationsAssignment_2 : ( ruleMainClass ) ;
    public final void rule__Goal__ClassDeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5144:1: ( ( ruleMainClass ) )
            // InternalMinijava.g:5145:2: ( ruleMainClass )
            {
            // InternalMinijava.g:5145:2: ( ruleMainClass )
            // InternalMinijava.g:5146:3: ruleMainClass
            {
             before(grammarAccess.getGoalAccess().getClassDeclarationsMainClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMainClass();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getClassDeclarationsMainClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__ClassDeclarationsAssignment_2"


    // $ANTLR start "rule__Goal__ClassDeclarationsAssignment_3"
    // InternalMinijava.g:5155:1: rule__Goal__ClassDeclarationsAssignment_3 : ( ruleClassDeclaration ) ;
    public final void rule__Goal__ClassDeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5159:1: ( ( ruleClassDeclaration ) )
            // InternalMinijava.g:5160:2: ( ruleClassDeclaration )
            {
            // InternalMinijava.g:5160:2: ( ruleClassDeclaration )
            // InternalMinijava.g:5161:3: ruleClassDeclaration
            {
             before(grammarAccess.getGoalAccess().getClassDeclarationsClassDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getClassDeclarationsClassDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__ClassDeclarationsAssignment_3"


    // $ANTLR start "rule__QualifiedNameList__QualifiedNameAssignment_0"
    // InternalMinijava.g:5170:1: rule__QualifiedNameList__QualifiedNameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameList__QualifiedNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5174:1: ( ( ruleQualifiedName ) )
            // InternalMinijava.g:5175:2: ( ruleQualifiedName )
            {
            // InternalMinijava.g:5175:2: ( ruleQualifiedName )
            // InternalMinijava.g:5176:3: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameListAccess().getQualifiedNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameListAccess().getQualifiedNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameList__QualifiedNameAssignment_0"


    // $ANTLR start "rule__QualifiedNameList__QualifiedNameLiAssignment_1"
    // InternalMinijava.g:5185:1: rule__QualifiedNameList__QualifiedNameLiAssignment_1 : ( ruleQualifiedNameLi ) ;
    public final void rule__QualifiedNameList__QualifiedNameLiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5189:1: ( ( ruleQualifiedNameLi ) )
            // InternalMinijava.g:5190:2: ( ruleQualifiedNameLi )
            {
            // InternalMinijava.g:5190:2: ( ruleQualifiedNameLi )
            // InternalMinijava.g:5191:3: ruleQualifiedNameLi
            {
             before(grammarAccess.getQualifiedNameListAccess().getQualifiedNameLiQualifiedNameLiParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameLi();

            state._fsp--;

             after(grammarAccess.getQualifiedNameListAccess().getQualifiedNameLiQualifiedNameLiParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameList__QualifiedNameLiAssignment_1"


    // $ANTLR start "rule__QualifiedNameLi__QualifiedNameAssignment_1"
    // InternalMinijava.g:5200:1: rule__QualifiedNameLi__QualifiedNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameLi__QualifiedNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5204:1: ( ( ruleQualifiedName ) )
            // InternalMinijava.g:5205:2: ( ruleQualifiedName )
            {
            // InternalMinijava.g:5205:2: ( ruleQualifiedName )
            // InternalMinijava.g:5206:3: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__QualifiedNameAssignment_1"


    // $ANTLR start "rule__QualifiedNameLi__QualifiedNameLiAssignment_2"
    // InternalMinijava.g:5215:1: rule__QualifiedNameLi__QualifiedNameLiAssignment_2 : ( ruleQualifiedNameLi ) ;
    public final void rule__QualifiedNameLi__QualifiedNameLiAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5219:1: ( ( ruleQualifiedNameLi ) )
            // InternalMinijava.g:5220:2: ( ruleQualifiedNameLi )
            {
            // InternalMinijava.g:5220:2: ( ruleQualifiedNameLi )
            // InternalMinijava.g:5221:3: ruleQualifiedNameLi
            {
             before(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameLiQualifiedNameLiParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameLi();

            state._fsp--;

             after(grammarAccess.getQualifiedNameLiAccess().getQualifiedNameLiQualifiedNameLiParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameLi__QualifiedNameLiAssignment_2"


    // $ANTLR start "rule__MainClass__NameAssignment_1"
    // InternalMinijava.g:5230:1: rule__MainClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MainClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5234:1: ( ( RULE_ID ) )
            // InternalMinijava.g:5235:2: ( RULE_ID )
            {
            // InternalMinijava.g:5235:2: ( RULE_ID )
            // InternalMinijava.g:5236:3: RULE_ID
            {
             before(grammarAccess.getMainClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__NameAssignment_1"


    // $ANTLR start "rule__MainClass__VarDeclarationsAssignment_14_0"
    // InternalMinijava.g:5245:1: rule__MainClass__VarDeclarationsAssignment_14_0 : ( ruleVarDeclaration ) ;
    public final void rule__MainClass__VarDeclarationsAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5249:1: ( ( ruleVarDeclaration ) )
            // InternalMinijava.g:5250:2: ( ruleVarDeclaration )
            {
            // InternalMinijava.g:5250:2: ( ruleVarDeclaration )
            // InternalMinijava.g:5251:3: ruleVarDeclaration
            {
             before(grammarAccess.getMainClassAccess().getVarDeclarationsVarDeclarationParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getMainClassAccess().getVarDeclarationsVarDeclarationParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__VarDeclarationsAssignment_14_0"


    // $ANTLR start "rule__MainClass__MethodDeclarationsAssignment_14_1"
    // InternalMinijava.g:5260:1: rule__MainClass__MethodDeclarationsAssignment_14_1 : ( ruleMethodDeclaration ) ;
    public final void rule__MainClass__MethodDeclarationsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5264:1: ( ( ruleMethodDeclaration ) )
            // InternalMinijava.g:5265:2: ( ruleMethodDeclaration )
            {
            // InternalMinijava.g:5265:2: ( ruleMethodDeclaration )
            // InternalMinijava.g:5266:3: ruleMethodDeclaration
            {
             before(grammarAccess.getMainClassAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodDeclaration();

            state._fsp--;

             after(grammarAccess.getMainClassAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__MethodDeclarationsAssignment_14_1"


    // $ANTLR start "rule__MainClass__StatementAssignment_14_2"
    // InternalMinijava.g:5275:1: rule__MainClass__StatementAssignment_14_2 : ( ruleStatement ) ;
    public final void rule__MainClass__StatementAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5279:1: ( ( ruleStatement ) )
            // InternalMinijava.g:5280:2: ( ruleStatement )
            {
            // InternalMinijava.g:5280:2: ( ruleStatement )
            // InternalMinijava.g:5281:3: ruleStatement
            {
             before(grammarAccess.getMainClassAccess().getStatementStatementParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMainClassAccess().getStatementStatementParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__StatementAssignment_14_2"


    // $ANTLR start "rule__ClassDeclaration__NameAssignment_1"
    // InternalMinijava.g:5290:1: rule__ClassDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5294:1: ( ( RULE_ID ) )
            // InternalMinijava.g:5295:2: ( RULE_ID )
            {
            // InternalMinijava.g:5295:2: ( RULE_ID )
            // InternalMinijava.g:5296:3: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ClassDeclaration__QualifiedNameAssignment_2_1"
    // InternalMinijava.g:5305:1: rule__ClassDeclaration__QualifiedNameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDeclaration__QualifiedNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5309:1: ( ( ( RULE_ID ) ) )
            // InternalMinijava.g:5310:2: ( ( RULE_ID ) )
            {
            // InternalMinijava.g:5310:2: ( ( RULE_ID ) )
            // InternalMinijava.g:5311:3: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclarationAccess().getQualifiedNameClassDeclarationCrossReference_2_1_0()); 
            // InternalMinijava.g:5312:3: ( RULE_ID )
            // InternalMinijava.g:5313:4: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getQualifiedNameClassDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getQualifiedNameClassDeclarationIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getQualifiedNameClassDeclarationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__QualifiedNameAssignment_2_1"


    // $ANTLR start "rule__ClassDeclaration__QualifiedNameListAssignment_3_1"
    // InternalMinijava.g:5324:1: rule__ClassDeclaration__QualifiedNameListAssignment_3_1 : ( ruleQualifiedNameList ) ;
    public final void rule__ClassDeclaration__QualifiedNameListAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5328:1: ( ( ruleQualifiedNameList ) )
            // InternalMinijava.g:5329:2: ( ruleQualifiedNameList )
            {
            // InternalMinijava.g:5329:2: ( ruleQualifiedNameList )
            // InternalMinijava.g:5330:3: ruleQualifiedNameList
            {
             before(grammarAccess.getClassDeclarationAccess().getQualifiedNameListQualifiedNameListParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameList();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getQualifiedNameListQualifiedNameListParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__QualifiedNameListAssignment_3_1"


    // $ANTLR start "rule__ClassDeclaration__VarDeclarationsAssignment_5_0"
    // InternalMinijava.g:5339:1: rule__ClassDeclaration__VarDeclarationsAssignment_5_0 : ( ruleVarDeclaration ) ;
    public final void rule__ClassDeclaration__VarDeclarationsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5343:1: ( ( ruleVarDeclaration ) )
            // InternalMinijava.g:5344:2: ( ruleVarDeclaration )
            {
            // InternalMinijava.g:5344:2: ( ruleVarDeclaration )
            // InternalMinijava.g:5345:3: ruleVarDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getVarDeclarationsVarDeclarationParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getVarDeclarationsVarDeclarationParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__VarDeclarationsAssignment_5_0"


    // $ANTLR start "rule__ClassDeclaration__MethodDeclarationsAssignment_5_1"
    // InternalMinijava.g:5354:1: rule__ClassDeclaration__MethodDeclarationsAssignment_5_1 : ( ruleMethodDeclaration ) ;
    public final void rule__ClassDeclaration__MethodDeclarationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5358:1: ( ( ruleMethodDeclaration ) )
            // InternalMinijava.g:5359:2: ( ruleMethodDeclaration )
            {
            // InternalMinijava.g:5359:2: ( ruleMethodDeclaration )
            // InternalMinijava.g:5360:3: ruleMethodDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__MethodDeclarationsAssignment_5_1"


    // $ANTLR start "rule__Type__TypeNameAssignment_0_1"
    // InternalMinijava.g:5369:1: rule__Type__TypeNameAssignment_0_1 : ( ( '[' ) ) ;
    public final void rule__Type__TypeNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5373:1: ( ( ( '[' ) ) )
            // InternalMinijava.g:5374:2: ( ( '[' ) )
            {
            // InternalMinijava.g:5374:2: ( ( '[' ) )
            // InternalMinijava.g:5375:3: ( '[' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 
            // InternalMinijava.g:5376:3: ( '[' )
            // InternalMinijava.g:5377:4: '['
            {
             before(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_0_1"


    // $ANTLR start "rule__Type__TypeNameAssignment_1"
    // InternalMinijava.g:5388:1: rule__Type__TypeNameAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Type__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5392:1: ( ( ( 'int' ) ) )
            // InternalMinijava.g:5393:2: ( ( 'int' ) )
            {
            // InternalMinijava.g:5393:2: ( ( 'int' ) )
            // InternalMinijava.g:5394:3: ( 'int' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 
            // InternalMinijava.g:5395:3: ( 'int' )
            // InternalMinijava.g:5396:4: 'int'
            {
             before(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_1"


    // $ANTLR start "rule__Type__TypeNameAssignment_2"
    // InternalMinijava.g:5407:1: rule__Type__TypeNameAssignment_2 : ( ( 'boolean' ) ) ;
    public final void rule__Type__TypeNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5411:1: ( ( ( 'boolean' ) ) )
            // InternalMinijava.g:5412:2: ( ( 'boolean' ) )
            {
            // InternalMinijava.g:5412:2: ( ( 'boolean' ) )
            // InternalMinijava.g:5413:3: ( 'boolean' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 
            // InternalMinijava.g:5414:3: ( 'boolean' )
            // InternalMinijava.g:5415:4: 'boolean'
            {
             before(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_2"


    // $ANTLR start "rule__Type__TypeNameAssignment_3"
    // InternalMinijava.g:5426:1: rule__Type__TypeNameAssignment_3 : ( ( 'double' ) ) ;
    public final void rule__Type__TypeNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5430:1: ( ( ( 'double' ) ) )
            // InternalMinijava.g:5431:2: ( ( 'double' ) )
            {
            // InternalMinijava.g:5431:2: ( ( 'double' ) )
            // InternalMinijava.g:5432:3: ( 'double' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameDoubleKeyword_3_0()); 
            // InternalMinijava.g:5433:3: ( 'double' )
            // InternalMinijava.g:5434:4: 'double'
            {
             before(grammarAccess.getTypeAccess().getTypeNameDoubleKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameDoubleKeyword_3_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameDoubleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_3"


    // $ANTLR start "rule__Type__TypeNameAssignment_4"
    // InternalMinijava.g:5445:1: rule__Type__TypeNameAssignment_4 : ( ( 'char' ) ) ;
    public final void rule__Type__TypeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5449:1: ( ( ( 'char' ) ) )
            // InternalMinijava.g:5450:2: ( ( 'char' ) )
            {
            // InternalMinijava.g:5450:2: ( ( 'char' ) )
            // InternalMinijava.g:5451:3: ( 'char' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameCharKeyword_4_0()); 
            // InternalMinijava.g:5452:3: ( 'char' )
            // InternalMinijava.g:5453:4: 'char'
            {
             before(grammarAccess.getTypeAccess().getTypeNameCharKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameCharKeyword_4_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameCharKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_4"


    // $ANTLR start "rule__Type__QualifiedNameAssignment_5"
    // InternalMinijava.g:5464:1: rule__Type__QualifiedNameAssignment_5 : ( ruleQualifiedName ) ;
    public final void rule__Type__QualifiedNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5468:1: ( ( ruleQualifiedName ) )
            // InternalMinijava.g:5469:2: ( ruleQualifiedName )
            {
            // InternalMinijava.g:5469:2: ( ruleQualifiedName )
            // InternalMinijava.g:5470:3: ruleQualifiedName
            {
             before(grammarAccess.getTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__QualifiedNameAssignment_5"


    // $ANTLR start "rule__Type__VarListAssignment_6_1"
    // InternalMinijava.g:5479:1: rule__Type__VarListAssignment_6_1 : ( ruleVarList ) ;
    public final void rule__Type__VarListAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5483:1: ( ( ruleVarList ) )
            // InternalMinijava.g:5484:2: ( ruleVarList )
            {
            // InternalMinijava.g:5484:2: ( ruleVarList )
            // InternalMinijava.g:5485:3: ruleVarList
            {
             before(grammarAccess.getTypeAccess().getVarListVarListParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarList();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getVarListVarListParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__VarListAssignment_6_1"


    // $ANTLR start "rule__VarDeclaration__VariableAssignment_0"
    // InternalMinijava.g:5494:1: rule__VarDeclaration__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__VarDeclaration__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5498:1: ( ( ruleVariable ) )
            // InternalMinijava.g:5499:2: ( ruleVariable )
            {
            // InternalMinijava.g:5499:2: ( ruleVariable )
            // InternalMinijava.g:5500:3: ruleVariable
            {
             before(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VariableAssignment_0"


    // $ANTLR start "rule__Variable__VariableTypeAssignment_0"
    // InternalMinijava.g:5509:1: rule__Variable__VariableTypeAssignment_0 : ( ruleType ) ;
    public final void rule__Variable__VariableTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5513:1: ( ( ruleType ) )
            // InternalMinijava.g:5514:2: ( ruleType )
            {
            // InternalMinijava.g:5514:2: ( ruleType )
            // InternalMinijava.g:5515:3: ruleType
            {
             before(grammarAccess.getVariableAccess().getVariableTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__VariableTypeAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalMinijava.g:5524:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5528:1: ( ( RULE_ID ) )
            // InternalMinijava.g:5529:2: ( RULE_ID )
            {
            // InternalMinijava.g:5529:2: ( RULE_ID )
            // InternalMinijava.g:5530:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__VarList__VarLiAssignment_1"
    // InternalMinijava.g:5539:1: rule__VarList__VarLiAssignment_1 : ( ruleVarLi ) ;
    public final void rule__VarList__VarLiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5543:1: ( ( ruleVarLi ) )
            // InternalMinijava.g:5544:2: ( ruleVarLi )
            {
            // InternalMinijava.g:5544:2: ( ruleVarLi )
            // InternalMinijava.g:5545:3: ruleVarLi
            {
             before(grammarAccess.getVarListAccess().getVarLiVarLiParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarLi();

            state._fsp--;

             after(grammarAccess.getVarListAccess().getVarLiVarLiParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__VarLiAssignment_1"


    // $ANTLR start "rule__VarLi__VarLiAssignment_2"
    // InternalMinijava.g:5554:1: rule__VarLi__VarLiAssignment_2 : ( ruleVarLi ) ;
    public final void rule__VarLi__VarLiAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5558:1: ( ( ruleVarLi ) )
            // InternalMinijava.g:5559:2: ( ruleVarLi )
            {
            // InternalMinijava.g:5559:2: ( ruleVarLi )
            // InternalMinijava.g:5560:3: ruleVarLi
            {
             before(grammarAccess.getVarLiAccess().getVarLiVarLiParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVarLi();

            state._fsp--;

             after(grammarAccess.getVarLiAccess().getVarLiVarLiParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarLi__VarLiAssignment_2"


    // $ANTLR start "rule__MethodDeclaration__MethodTypeAssignment_1"
    // InternalMinijava.g:5569:1: rule__MethodDeclaration__MethodTypeAssignment_1 : ( ruleType ) ;
    public final void rule__MethodDeclaration__MethodTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5573:1: ( ( ruleType ) )
            // InternalMinijava.g:5574:2: ( ruleType )
            {
            // InternalMinijava.g:5574:2: ( ruleType )
            // InternalMinijava.g:5575:3: ruleType
            {
             before(grammarAccess.getMethodDeclarationAccess().getMethodTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getMethodTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__MethodTypeAssignment_1"


    // $ANTLR start "rule__MethodDeclaration__NameAssignment_2"
    // InternalMinijava.g:5584:1: rule__MethodDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5588:1: ( ( RULE_ID ) )
            // InternalMinijava.g:5589:2: ( RULE_ID )
            {
            // InternalMinijava.g:5589:2: ( RULE_ID )
            // InternalMinijava.g:5590:3: RULE_ID
            {
             before(grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__NameAssignment_2"


    // $ANTLR start "rule__MethodDeclaration__VarListAssignment_4"
    // InternalMinijava.g:5599:1: rule__MethodDeclaration__VarListAssignment_4 : ( ruleVarList ) ;
    public final void rule__MethodDeclaration__VarListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5603:1: ( ( ruleVarList ) )
            // InternalMinijava.g:5604:2: ( ruleVarList )
            {
            // InternalMinijava.g:5604:2: ( ruleVarList )
            // InternalMinijava.g:5605:3: ruleVarList
            {
             before(grammarAccess.getMethodDeclarationAccess().getVarListVarListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVarList();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getVarListVarListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__VarListAssignment_4"


    // $ANTLR start "rule__MethodDeclaration__LocalVarDeclarationsAssignment_7"
    // InternalMinijava.g:5614:1: rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 : ( ruleVarDeclaration ) ;
    public final void rule__MethodDeclaration__LocalVarDeclarationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5618:1: ( ( ruleVarDeclaration ) )
            // InternalMinijava.g:5619:2: ( ruleVarDeclaration )
            {
            // InternalMinijava.g:5619:2: ( ruleVarDeclaration )
            // InternalMinijava.g:5620:3: ruleVarDeclaration
            {
             before(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsVarDeclarationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsVarDeclarationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__LocalVarDeclarationsAssignment_7"


    // $ANTLR start "rule__MethodDeclaration__StatementsAssignment_8"
    // InternalMinijava.g:5629:1: rule__MethodDeclaration__StatementsAssignment_8 : ( ruleStatement ) ;
    public final void rule__MethodDeclaration__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5633:1: ( ( ruleStatement ) )
            // InternalMinijava.g:5634:2: ( ruleStatement )
            {
            // InternalMinijava.g:5634:2: ( ruleStatement )
            // InternalMinijava.g:5635:3: ruleStatement
            {
             before(grammarAccess.getMethodDeclarationAccess().getStatementsStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getStatementsStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__StatementsAssignment_8"


    // $ANTLR start "rule__MethodDeclaration__ReturnExpressionAssignment_9_1"
    // InternalMinijava.g:5644:1: rule__MethodDeclaration__ReturnExpressionAssignment_9_1 : ( ruleExpression ) ;
    public final void rule__MethodDeclaration__ReturnExpressionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5648:1: ( ( ruleExpression ) )
            // InternalMinijava.g:5649:2: ( ruleExpression )
            {
            // InternalMinijava.g:5649:2: ( ruleExpression )
            // InternalMinijava.g:5650:3: ruleExpression
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__ReturnExpressionAssignment_9_1"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_0_0"
    // InternalMinijava.g:5659:1: rule__Statement__StatementTypeAssignment_0_0 : ( ( '{' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5663:1: ( ( ( '{' ) ) )
            // InternalMinijava.g:5664:2: ( ( '{' ) )
            {
            // InternalMinijava.g:5664:2: ( ( '{' ) )
            // InternalMinijava.g:5665:3: ( '{' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 
            // InternalMinijava.g:5666:3: ( '{' )
            // InternalMinijava.g:5667:4: '{'
            {
             before(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_0_0"


    // $ANTLR start "rule__Statement__StatementsAssignment_0_1"
    // InternalMinijava.g:5678:1: rule__Statement__StatementsAssignment_0_1 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5682:1: ( ( ruleStatement ) )
            // InternalMinijava.g:5683:2: ( ruleStatement )
            {
            // InternalMinijava.g:5683:2: ( ruleStatement )
            // InternalMinijava.g:5684:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_0_1"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_1_0"
    // InternalMinijava.g:5693:1: rule__Statement__StatementTypeAssignment_1_0 : ( ( 'if' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5697:1: ( ( ( 'if' ) ) )
            // InternalMinijava.g:5698:2: ( ( 'if' ) )
            {
            // InternalMinijava.g:5698:2: ( ( 'if' ) )
            // InternalMinijava.g:5699:3: ( 'if' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 
            // InternalMinijava.g:5700:3: ( 'if' )
            // InternalMinijava.g:5701:4: 'if'
            {
             before(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_1_0"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_1_2"
    // InternalMinijava.g:5712:1: rule__Statement__FirstExpressionAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5716:1: ( ( ruleExpression ) )
            // InternalMinijava.g:5717:2: ( ruleExpression )
            {
            // InternalMinijava.g:5717:2: ( ruleExpression )
            // InternalMinijava.g:5718:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_1_2"


    // $ANTLR start "rule__Statement__StatementsAssignment_1_4"
    // InternalMinijava.g:5727:1: rule__Statement__StatementsAssignment_1_4 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5731:1: ( ( ruleStatement ) )
            // InternalMinijava.g:5732:2: ( ruleStatement )
            {
            // InternalMinijava.g:5732:2: ( ruleStatement )
            // InternalMinijava.g:5733:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_1_4"


    // $ANTLR start "rule__Statement__StatementsAssignment_1_6"
    // InternalMinijava.g:5742:1: rule__Statement__StatementsAssignment_1_6 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5746:1: ( ( ruleStatement ) )
            // InternalMinijava.g:5747:2: ( ruleStatement )
            {
            // InternalMinijava.g:5747:2: ( ruleStatement )
            // InternalMinijava.g:5748:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_1_6"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_2_0"
    // InternalMinijava.g:5757:1: rule__Statement__StatementTypeAssignment_2_0 : ( ( 'while' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5761:1: ( ( ( 'while' ) ) )
            // InternalMinijava.g:5762:2: ( ( 'while' ) )
            {
            // InternalMinijava.g:5762:2: ( ( 'while' ) )
            // InternalMinijava.g:5763:3: ( 'while' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 
            // InternalMinijava.g:5764:3: ( 'while' )
            // InternalMinijava.g:5765:4: 'while'
            {
             before(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_2_0"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_2_2"
    // InternalMinijava.g:5776:1: rule__Statement__FirstExpressionAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5780:1: ( ( ruleExpression ) )
            // InternalMinijava.g:5781:2: ( ruleExpression )
            {
            // InternalMinijava.g:5781:2: ( ruleExpression )
            // InternalMinijava.g:5782:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_2_2"


    // $ANTLR start "rule__Statement__StatementsAssignment_2_4"
    // InternalMinijava.g:5791:1: rule__Statement__StatementsAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5795:1: ( ( ruleStatement ) )
            // InternalMinijava.g:5796:2: ( ruleStatement )
            {
            // InternalMinijava.g:5796:2: ( ruleStatement )
            // InternalMinijava.g:5797:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_2_4"


    // $ANTLR start "rule__Statement__VariableAssignment_3_0"
    // InternalMinijava.g:5806:1: rule__Statement__VariableAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Statement__VariableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5810:1: ( ( ( RULE_ID ) ) )
            // InternalMinijava.g:5811:2: ( ( RULE_ID ) )
            {
            // InternalMinijava.g:5811:2: ( ( RULE_ID ) )
            // InternalMinijava.g:5812:3: ( RULE_ID )
            {
             before(grammarAccess.getStatementAccess().getVariableVariableCrossReference_3_0_0()); 
            // InternalMinijava.g:5813:3: ( RULE_ID )
            // InternalMinijava.g:5814:4: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getStatementAccess().getVariableVariableCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VariableAssignment_3_0"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_3_1"
    // InternalMinijava.g:5825:1: rule__Statement__StatementTypeAssignment_3_1 : ( ( '=' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5829:1: ( ( ( '=' ) ) )
            // InternalMinijava.g:5830:2: ( ( '=' ) )
            {
            // InternalMinijava.g:5830:2: ( ( '=' ) )
            // InternalMinijava.g:5831:3: ( '=' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_3_1_0()); 
            // InternalMinijava.g:5832:3: ( '=' )
            // InternalMinijava.g:5833:4: '='
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_3_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_3_1_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_3_1"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_3_2"
    // InternalMinijava.g:5844:1: rule__Statement__FirstExpressionAssignment_3_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5848:1: ( ( ruleExpression ) )
            // InternalMinijava.g:5849:2: ( ruleExpression )
            {
            // InternalMinijava.g:5849:2: ( ruleExpression )
            // InternalMinijava.g:5850:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_3_2"


    // $ANTLR start "rule__Statement__VariableAssignment_4_0"
    // InternalMinijava.g:5859:1: rule__Statement__VariableAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Statement__VariableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5863:1: ( ( ( RULE_ID ) ) )
            // InternalMinijava.g:5864:2: ( ( RULE_ID ) )
            {
            // InternalMinijava.g:5864:2: ( ( RULE_ID ) )
            // InternalMinijava.g:5865:3: ( RULE_ID )
            {
             before(grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0()); 
            // InternalMinijava.g:5866:3: ( RULE_ID )
            // InternalMinijava.g:5867:4: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VariableAssignment_4_0"


    // $ANTLR start "rule__Statement__IsArrayElementAssignmentAssignment_4_1"
    // InternalMinijava.g:5878:1: rule__Statement__IsArrayElementAssignmentAssignment_4_1 : ( ( '[' ) ) ;
    public final void rule__Statement__IsArrayElementAssignmentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5882:1: ( ( ( '[' ) ) )
            // InternalMinijava.g:5883:2: ( ( '[' ) )
            {
            // InternalMinijava.g:5883:2: ( ( '[' ) )
            // InternalMinijava.g:5884:3: ( '[' )
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_4_1_0()); 
            // InternalMinijava.g:5885:3: ( '[' )
            // InternalMinijava.g:5886:4: '['
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_4_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_4_1_0()); 

            }

             after(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__IsArrayElementAssignmentAssignment_4_1"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_4_2"
    // InternalMinijava.g:5897:1: rule__Statement__FirstExpressionAssignment_4_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5901:1: ( ( ruleExpression ) )
            // InternalMinijava.g:5902:2: ( ruleExpression )
            {
            // InternalMinijava.g:5902:2: ( ruleExpression )
            // InternalMinijava.g:5903:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_4_2"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_4_4"
    // InternalMinijava.g:5912:1: rule__Statement__StatementTypeAssignment_4_4 : ( ( '=' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5916:1: ( ( ( '=' ) ) )
            // InternalMinijava.g:5917:2: ( ( '=' ) )
            {
            // InternalMinijava.g:5917:2: ( ( '=' ) )
            // InternalMinijava.g:5918:3: ( '=' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_4_0()); 
            // InternalMinijava.g:5919:3: ( '=' )
            // InternalMinijava.g:5920:4: '='
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_4_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_4_4"


    // $ANTLR start "rule__Statement__SecondExpressionAssignment_4_5"
    // InternalMinijava.g:5931:1: rule__Statement__SecondExpressionAssignment_4_5 : ( ruleExpression ) ;
    public final void rule__Statement__SecondExpressionAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5935:1: ( ( ruleExpression ) )
            // InternalMinijava.g:5936:2: ( ruleExpression )
            {
            // InternalMinijava.g:5936:2: ( ruleExpression )
            // InternalMinijava.g:5937:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getSecondExpressionExpressionParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getSecondExpressionExpressionParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__SecondExpressionAssignment_4_5"


    // $ANTLR start "rule__Expression__AdditionAssignment_0"
    // InternalMinijava.g:5946:1: rule__Expression__AdditionAssignment_0 : ( ruleAddition ) ;
    public final void rule__Expression__AdditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5950:1: ( ( ruleAddition ) )
            // InternalMinijava.g:5951:2: ( ruleAddition )
            {
            // InternalMinijava.g:5951:2: ( ruleAddition )
            // InternalMinijava.g:5952:3: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionAdditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionAdditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__AdditionAssignment_0"


    // $ANTLR start "rule__Expression__ExpressionTypeAssignment_1_1"
    // InternalMinijava.g:5961:1: rule__Expression__ExpressionTypeAssignment_1_1 : ( ( '<' ) ) ;
    public final void rule__Expression__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5965:1: ( ( ( '<' ) ) )
            // InternalMinijava.g:5966:2: ( ( '<' ) )
            {
            // InternalMinijava.g:5966:2: ( ( '<' ) )
            // InternalMinijava.g:5967:3: ( '<' )
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 
            // InternalMinijava.g:5968:3: ( '<' )
            // InternalMinijava.g:5969:4: '<'
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalMinijava.g:5980:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5984:1: ( ( ruleExpression ) )
            // InternalMinijava.g:5985:2: ( ruleExpression )
            {
            // InternalMinijava.g:5985:2: ( ruleExpression )
            // InternalMinijava.g:5986:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__Addition__MultiplicationAssignment_0"
    // InternalMinijava.g:5995:1: rule__Addition__MultiplicationAssignment_0 : ( ruleMultiplication ) ;
    public final void rule__Addition__MultiplicationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:5999:1: ( ( ruleMultiplication ) )
            // InternalMinijava.g:6000:2: ( ruleMultiplication )
            {
            // InternalMinijava.g:6000:2: ( ruleMultiplication )
            // InternalMinijava.g:6001:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationMultiplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationMultiplicationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__MultiplicationAssignment_0"


    // $ANTLR start "rule__Addition__ExpressionTypeAssignment_1_1"
    // InternalMinijava.g:6010:1: rule__Addition__ExpressionTypeAssignment_1_1 : ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6014:1: ( ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) ) )
            // InternalMinijava.g:6015:2: ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) )
            {
            // InternalMinijava.g:6015:2: ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) )
            // InternalMinijava.g:6016:3: ( rule__Addition__ExpressionTypeAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getExpressionTypeAlternatives_1_1_0()); 
            // InternalMinijava.g:6017:3: ( rule__Addition__ExpressionTypeAlternatives_1_1_0 )
            // InternalMinijava.g:6017:4: rule__Addition__ExpressionTypeAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__ExpressionTypeAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getExpressionTypeAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalMinijava.g:6025:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6029:1: ( ( ruleMultiplication ) )
            // InternalMinijava.g:6030:2: ( ruleMultiplication )
            {
            // InternalMinijava.g:6030:2: ( ruleMultiplication )
            // InternalMinijava.g:6031:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__NegationOrPointExpressionAssignment_0"
    // InternalMinijava.g:6040:1: rule__Multiplication__NegationOrPointExpressionAssignment_0 : ( ruleNegationOrPointExpression ) ;
    public final void rule__Multiplication__NegationOrPointExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6044:1: ( ( ruleNegationOrPointExpression ) )
            // InternalMinijava.g:6045:2: ( ruleNegationOrPointExpression )
            {
            // InternalMinijava.g:6045:2: ( ruleNegationOrPointExpression )
            // InternalMinijava.g:6046:3: ruleNegationOrPointExpression
            {
             before(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionNegationOrPointExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNegationOrPointExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionNegationOrPointExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__NegationOrPointExpressionAssignment_0"


    // $ANTLR start "rule__Multiplication__ExpressionTypeAssignment_1_1"
    // InternalMinijava.g:6055:1: rule__Multiplication__ExpressionTypeAssignment_1_1 : ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6059:1: ( ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) ) )
            // InternalMinijava.g:6060:2: ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) )
            {
            // InternalMinijava.g:6060:2: ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) )
            // InternalMinijava.g:6061:3: ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getExpressionTypeAlternatives_1_1_0()); 
            // InternalMinijava.g:6062:3: ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 )
            // InternalMinijava.g:6062:4: rule__Multiplication__ExpressionTypeAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__ExpressionTypeAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getExpressionTypeAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalMinijava.g:6070:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNegationOrPointExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6074:1: ( ( ruleNegationOrPointExpression ) )
            // InternalMinijava.g:6075:2: ( ruleNegationOrPointExpression )
            {
            // InternalMinijava.g:6075:2: ( ruleNegationOrPointExpression )
            // InternalMinijava.g:6076:3: ruleNegationOrPointExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightNegationOrPointExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNegationOrPointExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightNegationOrPointExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__NegationOrPointExpression__PointAssignment_1"
    // InternalMinijava.g:6085:1: rule__NegationOrPointExpression__PointAssignment_1 : ( rulePoint ) ;
    public final void rule__NegationOrPointExpression__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6089:1: ( ( rulePoint ) )
            // InternalMinijava.g:6090:2: ( rulePoint )
            {
            // InternalMinijava.g:6090:2: ( rulePoint )
            // InternalMinijava.g:6091:3: rulePoint
            {
             before(grammarAccess.getNegationOrPointExpressionAccess().getPointPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getNegationOrPointExpressionAccess().getPointPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegationOrPointExpression__PointAssignment_1"


    // $ANTLR start "rule__Negation__ExpressionTypeAssignment_0"
    // InternalMinijava.g:6100:1: rule__Negation__ExpressionTypeAssignment_0 : ( ( '!' ) ) ;
    public final void rule__Negation__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6104:1: ( ( ( '!' ) ) )
            // InternalMinijava.g:6105:2: ( ( '!' ) )
            {
            // InternalMinijava.g:6105:2: ( ( '!' ) )
            // InternalMinijava.g:6106:3: ( '!' )
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 
            // InternalMinijava.g:6107:3: ( '!' )
            // InternalMinijava.g:6108:4: '!'
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 

            }

             after(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ExpressionTypeAssignment_0"


    // $ANTLR start "rule__Negation__RightAssignment_1"
    // InternalMinijava.g:6119:1: rule__Negation__RightAssignment_1 : ( rulePoint ) ;
    public final void rule__Negation__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6123:1: ( ( rulePoint ) )
            // InternalMinijava.g:6124:2: ( rulePoint )
            {
            // InternalMinijava.g:6124:2: ( rulePoint )
            // InternalMinijava.g:6125:3: rulePoint
            {
             before(grammarAccess.getNegationAccess().getRightPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getRightPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__RightAssignment_1"


    // $ANTLR start "rule__Point__SquareBracketsAssignment_0"
    // InternalMinijava.g:6134:1: rule__Point__SquareBracketsAssignment_0 : ( ruleSquareBrackets ) ;
    public final void rule__Point__SquareBracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6138:1: ( ( ruleSquareBrackets ) )
            // InternalMinijava.g:6139:2: ( ruleSquareBrackets )
            {
            // InternalMinijava.g:6139:2: ( ruleSquareBrackets )
            // InternalMinijava.g:6140:3: ruleSquareBrackets
            {
             before(grammarAccess.getPointAccess().getSquareBracketsSquareBracketsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSquareBrackets();

            state._fsp--;

             after(grammarAccess.getPointAccess().getSquareBracketsSquareBracketsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__SquareBracketsAssignment_0"


    // $ANTLR start "rule__Point__ExpressionTypeAssignment_1_1"
    // InternalMinijava.g:6149:1: rule__Point__ExpressionTypeAssignment_1_1 : ( ( '.' ) ) ;
    public final void rule__Point__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6153:1: ( ( ( '.' ) ) )
            // InternalMinijava.g:6154:2: ( ( '.' ) )
            {
            // InternalMinijava.g:6154:2: ( ( '.' ) )
            // InternalMinijava.g:6155:3: ( '.' )
            {
             before(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 
            // InternalMinijava.g:6156:3: ( '.' )
            // InternalMinijava.g:6157:4: '.'
            {
             before(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 

            }

             after(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Point__RightAssignment_1_2"
    // InternalMinijava.g:6168:1: rule__Point__RightAssignment_1_2 : ( ruleMethodCallExpr ) ;
    public final void rule__Point__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6172:1: ( ( ruleMethodCallExpr ) )
            // InternalMinijava.g:6173:2: ( ruleMethodCallExpr )
            {
            // InternalMinijava.g:6173:2: ( ruleMethodCallExpr )
            // InternalMinijava.g:6174:3: ruleMethodCallExpr
            {
             before(grammarAccess.getPointAccess().getRightMethodCallExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodCallExpr();

            state._fsp--;

             after(grammarAccess.getPointAccess().getRightMethodCallExprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__RightAssignment_1_2"


    // $ANTLR start "rule__SquareBrackets__PrimaryAssignment_0"
    // InternalMinijava.g:6183:1: rule__SquareBrackets__PrimaryAssignment_0 : ( rulePrimary ) ;
    public final void rule__SquareBrackets__PrimaryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6187:1: ( ( rulePrimary ) )
            // InternalMinijava.g:6188:2: ( rulePrimary )
            {
            // InternalMinijava.g:6188:2: ( rulePrimary )
            // InternalMinijava.g:6189:3: rulePrimary
            {
             before(grammarAccess.getSquareBracketsAccess().getPrimaryPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getSquareBracketsAccess().getPrimaryPrimaryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__PrimaryAssignment_0"


    // $ANTLR start "rule__SquareBrackets__ExpressionTypeAssignment_1_1"
    // InternalMinijava.g:6198:1: rule__SquareBrackets__ExpressionTypeAssignment_1_1 : ( ( '[' ) ) ;
    public final void rule__SquareBrackets__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6202:1: ( ( ( '[' ) ) )
            // InternalMinijava.g:6203:2: ( ( '[' ) )
            {
            // InternalMinijava.g:6203:2: ( ( '[' ) )
            // InternalMinijava.g:6204:3: ( '[' )
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 
            // InternalMinijava.g:6205:3: ( '[' )
            // InternalMinijava.g:6206:4: '['
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 

            }

             after(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__SquareBrackets__RightAssignment_1_2"
    // InternalMinijava.g:6217:1: rule__SquareBrackets__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__SquareBrackets__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6221:1: ( ( rulePrimary ) )
            // InternalMinijava.g:6222:2: ( rulePrimary )
            {
            // InternalMinijava.g:6222:2: ( rulePrimary )
            // InternalMinijava.g:6223:3: rulePrimary
            {
             before(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_0"
    // InternalMinijava.g:6232:1: rule__Primary__ExpressionTypeAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6236:1: ( ( ( 'true' ) ) )
            // InternalMinijava.g:6237:2: ( ( 'true' ) )
            {
            // InternalMinijava.g:6237:2: ( ( 'true' ) )
            // InternalMinijava.g:6238:3: ( 'true' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 
            // InternalMinijava.g:6239:3: ( 'true' )
            // InternalMinijava.g:6240:4: 'true'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_0"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_1"
    // InternalMinijava.g:6251:1: rule__Primary__ExpressionTypeAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6255:1: ( ( ( 'false' ) ) )
            // InternalMinijava.g:6256:2: ( ( 'false' ) )
            {
            // InternalMinijava.g:6256:2: ( ( 'false' ) )
            // InternalMinijava.g:6257:3: ( 'false' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 
            // InternalMinijava.g:6258:3: ( 'false' )
            // InternalMinijava.g:6259:4: 'false'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_1"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_2"
    // InternalMinijava.g:6270:1: rule__Primary__ExpressionTypeAssignment_2 : ( ( 'this' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6274:1: ( ( ( 'this' ) ) )
            // InternalMinijava.g:6275:2: ( ( 'this' ) )
            {
            // InternalMinijava.g:6275:2: ( ( 'this' ) )
            // InternalMinijava.g:6276:3: ( 'this' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 
            // InternalMinijava.g:6277:3: ( 'this' )
            // InternalMinijava.g:6278:4: 'this'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_2"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_3_0"
    // InternalMinijava.g:6289:1: rule__Primary__ExpressionTypeAssignment_3_0 : ( ( 'new' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6293:1: ( ( ( 'new' ) ) )
            // InternalMinijava.g:6294:2: ( ( 'new' ) )
            {
            // InternalMinijava.g:6294:2: ( ( 'new' ) )
            // InternalMinijava.g:6295:3: ( 'new' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 
            // InternalMinijava.g:6296:3: ( 'new' )
            // InternalMinijava.g:6297:4: 'new'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_3_0"


    // $ANTLR start "rule__Primary__ExpressionAssignment_3_3"
    // InternalMinijava.g:6308:1: rule__Primary__ExpressionAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6312:1: ( ( ruleExpression ) )
            // InternalMinijava.g:6313:2: ( ruleExpression )
            {
            // InternalMinijava.g:6313:2: ( ruleExpression )
            // InternalMinijava.g:6314:3: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_3_3"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_4_0"
    // InternalMinijava.g:6323:1: rule__Primary__ExpressionTypeAssignment_4_0 : ( ( 'new' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6327:1: ( ( ( 'new' ) ) )
            // InternalMinijava.g:6328:2: ( ( 'new' ) )
            {
            // InternalMinijava.g:6328:2: ( ( 'new' ) )
            // InternalMinijava.g:6329:3: ( 'new' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 
            // InternalMinijava.g:6330:3: ( 'new' )
            // InternalMinijava.g:6331:4: 'new'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_4_0"


    // $ANTLR start "rule__Primary__TypeAssignment_4_1"
    // InternalMinijava.g:6342:1: rule__Primary__TypeAssignment_4_1 : ( ruleType ) ;
    public final void rule__Primary__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6346:1: ( ( ruleType ) )
            // InternalMinijava.g:6347:2: ( ruleType )
            {
            // InternalMinijava.g:6347:2: ( ruleType )
            // InternalMinijava.g:6348:3: ruleType
            {
             before(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__TypeAssignment_4_1"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_5_0"
    // InternalMinijava.g:6357:1: rule__Primary__ExpressionTypeAssignment_5_0 : ( ( '(' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6361:1: ( ( ( '(' ) ) )
            // InternalMinijava.g:6362:2: ( ( '(' ) )
            {
            // InternalMinijava.g:6362:2: ( ( '(' ) )
            // InternalMinijava.g:6363:3: ( '(' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 
            // InternalMinijava.g:6364:3: ( '(' )
            // InternalMinijava.g:6365:4: '('
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_5_0"


    // $ANTLR start "rule__Primary__ExpressionAssignment_5_1"
    // InternalMinijava.g:6376:1: rule__Primary__ExpressionAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6380:1: ( ( ruleExpression ) )
            // InternalMinijava.g:6381:2: ( ruleExpression )
            {
            // InternalMinijava.g:6381:2: ( ruleExpression )
            // InternalMinijava.g:6382:3: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_5_1"


    // $ANTLR start "rule__Primary__VariableAssignment_6"
    // InternalMinijava.g:6391:1: rule__Primary__VariableAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__VariableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6395:1: ( ( ( RULE_ID ) ) )
            // InternalMinijava.g:6396:2: ( ( RULE_ID ) )
            {
            // InternalMinijava.g:6396:2: ( ( RULE_ID ) )
            // InternalMinijava.g:6397:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_6_0()); 
            // InternalMinijava.g:6398:3: ( RULE_ID )
            // InternalMinijava.g:6399:4: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getVariableVariableIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getVariableVariableIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__VariableAssignment_6"


    // $ANTLR start "rule__Primary__NumberAssignment_7"
    // InternalMinijava.g:6410:1: rule__Primary__NumberAssignment_7 : ( ruleNumberValue ) ;
    public final void rule__Primary__NumberAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6414:1: ( ( ruleNumberValue ) )
            // InternalMinijava.g:6415:2: ( ruleNumberValue )
            {
            // InternalMinijava.g:6415:2: ( ruleNumberValue )
            // InternalMinijava.g:6416:3: ruleNumberValue
            {
             before(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__NumberAssignment_7"


    // $ANTLR start "rule__MethodCallExpr__ExpressionTypeAssignment_0"
    // InternalMinijava.g:6425:1: rule__MethodCallExpr__ExpressionTypeAssignment_0 : ( ( 'length' ) ) ;
    public final void rule__MethodCallExpr__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6429:1: ( ( ( 'length' ) ) )
            // InternalMinijava.g:6430:2: ( ( 'length' ) )
            {
            // InternalMinijava.g:6430:2: ( ( 'length' ) )
            // InternalMinijava.g:6431:3: ( 'length' )
            {
             before(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 
            // InternalMinijava.g:6432:3: ( 'length' )
            // InternalMinijava.g:6433:4: 'length'
            {
             before(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 

            }

             after(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCallExpr__ExpressionTypeAssignment_0"


    // $ANTLR start "rule__MethodCallExpr__MethodCallAssignment_1"
    // InternalMinijava.g:6444:1: rule__MethodCallExpr__MethodCallAssignment_1 : ( ruleMethodCall ) ;
    public final void rule__MethodCallExpr__MethodCallAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6448:1: ( ( ruleMethodCall ) )
            // InternalMinijava.g:6449:2: ( ruleMethodCall )
            {
            // InternalMinijava.g:6449:2: ( ruleMethodCall )
            // InternalMinijava.g:6450:3: ruleMethodCall
            {
             before(grammarAccess.getMethodCallExprAccess().getMethodCallMethodCallParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getMethodCallExprAccess().getMethodCallMethodCallParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCallExpr__MethodCallAssignment_1"


    // $ANTLR start "rule__MethodCall__MethodAssignment_0"
    // InternalMinijava.g:6459:1: rule__MethodCall__MethodAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6463:1: ( ( ( RULE_ID ) ) )
            // InternalMinijava.g:6464:2: ( ( RULE_ID ) )
            {
            // InternalMinijava.g:6464:2: ( ( RULE_ID ) )
            // InternalMinijava.g:6465:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0()); 
            // InternalMinijava.g:6466:3: ( RULE_ID )
            // InternalMinijava.g:6467:4: RULE_ID
            {
             before(grammarAccess.getMethodCallAccess().getMethodMethodIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getMethodMethodIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__MethodAssignment_0"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_2_0"
    // InternalMinijava.g:6478:1: rule__MethodCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6482:1: ( ( ruleExpression ) )
            // InternalMinijava.g:6483:2: ( ruleExpression )
            {
            // InternalMinijava.g:6483:2: ( ruleExpression )
            // InternalMinijava.g:6484:3: ruleExpression
            {
             before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__ParametersAssignment_2_0"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_2_1_1"
    // InternalMinijava.g:6493:1: rule__MethodCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6497:1: ( ( ruleExpression ) )
            // InternalMinijava.g:6498:2: ( ruleExpression )
            {
            // InternalMinijava.g:6498:2: ( ruleExpression )
            // InternalMinijava.g:6499:3: ruleExpression
            {
             before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // InternalMinijava.g:6508:1: rule__NumberValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinijava.g:6512:1: ( ( RULE_INT ) )
            // InternalMinijava.g:6513:2: ( RULE_INT )
            {
            // InternalMinijava.g:6513:2: ( RULE_INT )
            // InternalMinijava.g:6514:3: RULE_INT
            {
             before(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\3\uffff\1\34\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\62\3\uffff\1\51\3\uffff\1\36\1\uffff\1\62\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\uffff\1\5\1\uffff\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\7\26\uffff\1\5\22\uffff\1\1\1\2\1\3\1\4",
            "",
            "",
            "",
            "\1\11\27\uffff\1\11\7\uffff\1\10\2\uffff\3\11",
            "",
            "",
            "",
            "\1\11\1\uffff\1\12",
            "",
            "\2\13\26\uffff\1\13\2\uffff\1\11\16\uffff\5\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "955:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__VariableAssignment_6 ) ) | ( ( rule__Primary__NumberAssignment_7 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000F9211003810L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000F9011003812L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C01000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000039210003810L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000039010003812L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000039010000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000039110000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000FB211003810L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000039010000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0007C00010000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000F9011003810L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007C00110000030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000400002L});

}