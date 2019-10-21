package com.company.classes;// $ANTLR 3.5.2 .\\antlr\\pascal.g 2019-10-21 21:01:56

import java.io.*;

import org.antlr.runtime.Parser;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.NoViableAltException;


import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class pascalParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDSUBOR", "AND", "ARGDECL", 
		"ARGDECLS", "ARGLIST", "ARRAY", "ASSIGN", "ASSIGNEQUAL", "AT", "BEGIN", 
		"BLOCK", "BOOLEAN", "CASE", "CHAR", "CHR", "COLON", "COMMA", "COMMENT_1", 
		"COMMENT_2", "CONST", "CONSTLIST", "DIV", "DO", "DOT", "DOTDOT", "DOWNTO", 
		"ELIST", "ELSE", "END", "EQUAL", "EXPONENT", "FIELD", "FIELDLIST", "FILE", 
		"FOR", "FUNC", "FUNCTION", "FUNC_CALL", "GE", "GOTO", "GT", "IDENT", "IDLIST", 
		"IF", "IMPLEMENTATION", "IN", "INTEGER", "INTERFACE", "LABEL", "LBRACK", 
		"LBRACK2", "LCURLY", "LE", "LF", "LPAREN", "LT", "METHOD", "MINUS", "MOD", 
		"MYASTVAR", "NIL", "NODE_NOT_EMIT", "NOT", "NOT_EQUAL", "NUM_INT", "NUM_REAL", 
		"OF", "OR", "PACKED", "PLUS", "POINTER", "PROCEDURE", "PROC_CALL", "PROGRAM", 
		"RBRACK", "RBRACK2", "RCURLY", "REAL", "RECORD", "REPEAT", "RPAREN", "SCALARTYPE", 
		"SEMI", "SET", "SIGN", "SLASH", "STAR", "STRING", "STRING_LITERAL", "THEN", 
		"TO", "TYPE", "TYPEDECL", "TYPELIST", "UNIT", "UNTIL", "USES", "VAR", 
		"VARDECL", "VARIANT_CASE", "VARIANT_TAG", "VARIANT_TAG_NO_ID", "WHILE", 
		"WITH", "WS"
	};
	public static final int EOF=-1;
	public static final int ADDSUBOR=4;
	public static final int AND=5;
	public static final int ARGDECL=6;
	public static final int ARGDECLS=7;
	public static final int ARGLIST=8;
	public static final int ARRAY=9;
	public static final int ASSIGN=10;
	public static final int ASSIGNEQUAL=11;
	public static final int AT=12;
	public static final int BEGIN=13;
	public static final int BLOCK=14;
	public static final int BOOLEAN=15;
	public static final int CASE=16;
	public static final int CHAR=17;
	public static final int CHR=18;
	public static final int COLON=19;
	public static final int COMMA=20;
	public static final int COMMENT_1=21;
	public static final int COMMENT_2=22;
	public static final int CONST=23;
	public static final int CONSTLIST=24;
	public static final int DIV=25;
	public static final int DO=26;
	public static final int DOT=27;
	public static final int DOTDOT=28;
	public static final int DOWNTO=29;
	public static final int ELIST=30;
	public static final int ELSE=31;
	public static final int END=32;
	public static final int EQUAL=33;
	public static final int EXPONENT=34;
	public static final int FIELD=35;
	public static final int FIELDLIST=36;
	public static final int FILE=37;
	public static final int FOR=38;
	public static final int FUNC=39;
	public static final int FUNCTION=40;
	public static final int FUNC_CALL=41;
	public static final int GE=42;
	public static final int GOTO=43;
	public static final int GT=44;
	public static final int IDENT=45;
	public static final int IDLIST=46;
	public static final int IF=47;
	public static final int IMPLEMENTATION=48;
	public static final int IN=49;
	public static final int INTEGER=50;
	public static final int INTERFACE=51;
	public static final int LABEL=52;
	public static final int LBRACK=53;
	public static final int LBRACK2=54;
	public static final int LCURLY=55;
	public static final int LE=56;
	public static final int LF=57;
	public static final int LPAREN=58;
	public static final int LT=59;
	public static final int METHOD=60;
	public static final int MINUS=61;
	public static final int MOD=62;
	public static final int MYASTVAR=63;
	public static final int NIL=64;
	public static final int NODE_NOT_EMIT=65;
	public static final int NOT=66;
	public static final int NOT_EQUAL=67;
	public static final int NUM_INT=68;
	public static final int NUM_REAL=69;
	public static final int OF=70;
	public static final int OR=71;
	public static final int PACKED=72;
	public static final int PLUS=73;
	public static final int POINTER=74;
	public static final int PROCEDURE=75;
	public static final int PROC_CALL=76;
	public static final int PROGRAM=77;
	public static final int RBRACK=78;
	public static final int RBRACK2=79;
	public static final int RCURLY=80;
	public static final int REAL=81;
	public static final int RECORD=82;
	public static final int REPEAT=83;
	public static final int RPAREN=84;
	public static final int SCALARTYPE=85;
	public static final int SEMI=86;
	public static final int SET=87;
	public static final int SIGN=88;
	public static final int SLASH=89;
	public static final int STAR=90;
	public static final int STRING=91;
	public static final int STRING_LITERAL=92;
	public static final int THEN=93;
	public static final int TO=94;
	public static final int TYPE=95;
	public static final int TYPEDECL=96;
	public static final int TYPELIST=97;
	public static final int UNIT=98;
	public static final int UNTIL=99;
	public static final int USES=100;
	public static final int VAR=101;
	public static final int VARDECL=102;
	public static final int VARIANT_CASE=103;
	public static final int VARIANT_TAG=104;
	public static final int VARIANT_TAG_NO_ID=105;
	public static final int WHILE=106;
	public static final int WITH=107;
	public static final int WS=108;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public pascalParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public pascalParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return pascalParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\antlr\\pascal.g"; }


	    /** Overall symbol table for translator */
	    public static SymbolTable symbolTable = new SymbolTable();

	    // This method decides what action to take based on the type of
	    //   file we are looking at
	    public  static void doFile(File f) throws Exception {
	      // If this is a directory, walk each file/dir in that directory
	      translateFilePath = f.getParent();
	      if (f.isDirectory()) {
	        String files[] = f.list();
	        for(int i=0; i < files.length; i++)
	        {
	          doFile(new File(f, files[i]));
	        }
	      }
	      // otherwise, if this is a Pascal file, parse it!
	      else if ((f.getName().length()>4) &&
	             f.getName().substring(f.getName().length()-4).toLowerCase().equals(".pas")) {
	        System.err.println("   "+f.getAbsolutePath());

	        if (translateFileName == null) {
	          translateFileName = f.getName(); //set this file as the one to translate
	          currentFileName = f.getName();
	        }

	        parseFile(f.getName(),new ANTLRNoCaseFileStream(f.getAbsolutePath()));
	      }
	      else {
	        System.err.println("Can not parse:   "+f.getAbsolutePath());
	      }
	    }
	   //---begin adaptor code here...
	   // Custom adaptor to create CommonTree node type
	   private static final TreeAdaptor pascaladaptor = new CommonTreeAdaptor() {
	         @Override public Object create(Token payload) {
	            return new CommonTree(payload);
	         }
	         @Override public Object dupNode(Object old) {
	            return (old==null)? null : ((CommonTree)old).dupNode();
	         }
	         @Override public Object errorNode(TokenStream input,
	                                           Token start, Token stop,
	                                           RecognitionException e) {
	            return new PascalASTErrorNode(input, start, stop, e);
	         }
	      };
	//----end adaptor code.
	    // Here's where we do the real work...
	    public  static void parseFile(String f,ANTLRNoCaseFileStream s) throws Exception {
	      try {
	        currentFileName = f; // set this File as the currentFileName

	        // Create a scanner that reads from the input stream passed to us
	         com.company.classes.pascalLexer lexer = new com.company.classes.pascalLexer(s);

	        //System.out.println(parser.getAST().toStringList());
	             TokenStream tokenStream = new CommonTokenStream(lexer);
	            // Create a parser that reads from the scanner
	             com.company.classes.pascalParser parser = new com.company.classes.pascalParser(tokenStream);

	            // set AST type to CommonTree (has symbol)
	          //  parser.setASTNodeClass("CommonTree");
	             parser.setTreeAdaptor(pascaladaptor);

	            // start parsing at the program rule
	            program_return res=parser.program(); 

	           // CommonAST t = (CommonAST)res.getTree();

	            // do something with the tree
	            parser.doTreeAction(f, (CommonTree)res.getTree(), parser.getTokenNames());
	            //System.out.println(parser.getAST().toStringList());
	                


	    // build symbol table
	            
	            // Get the tree out of the parser
	           /* CommonTree resultTree1 = (CommonTree) res.getTree();   


	        // Make an instance of the tree parser
	        // PascalTreeParserSuper treeParser1 = new PascalTreeParserSuper();
	        SymtabPhase treeParser1 = new SymtabPhase();

	        treeParser1.setASTNodeClass("CommonTree");

	        // Begin tree parser at only rule
	        treeParser1.program(resultTree1);*/



	//        parser.doTreeAction(f, treeParser1.getAST(), treeParser1.getTokenNames());



	       
	      }
	      catch (Exception e) {
	        System.err.println("parser exception: "+e);
	        e.printStackTrace();   // so we can get stack trace
	      }
	    }
	    public void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
	    public void doTreeAction(String f, CommonTree t, String[] tokenNames) {
	      if ( t==null ) return;
	      if ( showTree ) {
	        printTree(t,0);
	       /*  ((CommonAST)t).setVerboseStringConversion(true, tokenNames);
	         ASTFactory factory = new ASTFactory();
	         AST r = factory.create(0,"AST ROOT");
	         r.setFirstChild(t);
	         ASTFrame frame = new ASTFrame("Pascal AST", r);
	         frame.setVisible(true);*/
	         //System.out.println(t.toStringList());
	      }

	    }
	  static boolean showTree = true;
	  public static String translateFilePath;
	  public static String translateFileName;
	  public static String currentFileName; // not static, recursive USES ... other FileName in currentFileName
	  public static String oldtranslateFileName;


	// main
	  public static void main(String[] args) {
	    // Use a try/catch block for parser exceptions
	    try {
	      // if we have at least one command-line argument
	      if (args.length > 0 ) {

	        // for each directory/file specified on the command line
	        for(int i=0; i< args.length;i++)
	{
		  if ( args[i].equals("-showtree") ) {
	             showTree = true;
	          }
	          else {
	            System.err.println("Parsing...");
	            doFile(new File(args[i])); // parse it
	          }
	        }
	      }
	      else
	        System.err.println("Usage: java PascalParser <file/directory name>");

	    }
	    catch(Exception e) {
	      System.err.println("exception: "+e);
	      e.printStackTrace(System.err);   // so we can get stack trace
	    }
	  }



	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// .\\antlr\\pascal.g:273:1: program : programHeading ( INTERFACE !)? block DOT !;
	public final pascalParser.program_return program() throws RecognitionException {
		pascalParser.program_return retval = new pascalParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTERFACE2=null;
		Token DOT4=null;
		ParserRuleReturnScope programHeading1 =null;
		ParserRuleReturnScope block3 =null;

		CommonTree INTERFACE2_tree=null;
		CommonTree DOT4_tree=null;

		try {
			// .\\antlr\\pascal.g:274:5: ( programHeading ( INTERFACE !)? block DOT !)
			// .\\antlr\\pascal.g:274:7: programHeading ( INTERFACE !)? block DOT !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_programHeading_in_program524);
			programHeading1=programHeading();
			state._fsp--;

			adaptor.addChild(root_0, programHeading1.getTree());

			// .\\antlr\\pascal.g:274:22: ( INTERFACE !)?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INTERFACE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// .\\antlr\\pascal.g:274:23: INTERFACE !
					{
					INTERFACE2=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_program527); 
					}
					break;

			}

			pushFollow(FOLLOW_block_in_program538);
			block3=block();
			state._fsp--;

			adaptor.addChild(root_0, block3.getTree());

			DOT4=(Token)match(input,DOT,FOLLOW_DOT_in_program546); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class programHeading_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "programHeading"
	// .\\antlr\\pascal.g:279:1: programHeading : ( PROGRAM ^ identifier ( LPAREN ! identifierList RPAREN !)? SEMI !| UNIT ^ identifier SEMI !);
	public final pascalParser.programHeading_return programHeading() throws RecognitionException {
		pascalParser.programHeading_return retval = new pascalParser.programHeading_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PROGRAM5=null;
		Token LPAREN7=null;
		Token RPAREN9=null;
		Token SEMI10=null;
		Token UNIT11=null;
		Token SEMI13=null;
		ParserRuleReturnScope identifier6 =null;
		ParserRuleReturnScope identifierList8 =null;
		ParserRuleReturnScope identifier12 =null;

		CommonTree PROGRAM5_tree=null;
		CommonTree LPAREN7_tree=null;
		CommonTree RPAREN9_tree=null;
		CommonTree SEMI10_tree=null;
		CommonTree UNIT11_tree=null;
		CommonTree SEMI13_tree=null;

		try {
			// .\\antlr\\pascal.g:280:5: ( PROGRAM ^ identifier ( LPAREN ! identifierList RPAREN !)? SEMI !| UNIT ^ identifier SEMI !)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==PROGRAM) ) {
				alt3=1;
			}
			else if ( (LA3_0==UNIT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// .\\antlr\\pascal.g:280:7: PROGRAM ^ identifier ( LPAREN ! identifierList RPAREN !)? SEMI !
					{
					root_0 = (CommonTree)adaptor.nil();


					PROGRAM5=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_programHeading564); 
					PROGRAM5_tree = (CommonTree)adaptor.create(PROGRAM5);
					root_0 = (CommonTree)adaptor.becomeRoot(PROGRAM5_tree, root_0);

					pushFollow(FOLLOW_identifier_in_programHeading567);
					identifier6=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier6.getTree());

					// .\\antlr\\pascal.g:280:27: ( LPAREN ! identifierList RPAREN !)?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==LPAREN) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// .\\antlr\\pascal.g:280:28: LPAREN ! identifierList RPAREN !
							{
							LPAREN7=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_programHeading570); 
							pushFollow(FOLLOW_identifierList_in_programHeading573);
							identifierList8=identifierList();
							state._fsp--;

							adaptor.addChild(root_0, identifierList8.getTree());

							RPAREN9=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_programHeading575); 
							}
							break;

					}

					SEMI10=(Token)match(input,SEMI,FOLLOW_SEMI_in_programHeading580); 
					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:281:7: UNIT ^ identifier SEMI !
					{
					root_0 = (CommonTree)adaptor.nil();


					UNIT11=(Token)match(input,UNIT,FOLLOW_UNIT_in_programHeading589); 
					UNIT11_tree = (CommonTree)adaptor.create(UNIT11);
					root_0 = (CommonTree)adaptor.becomeRoot(UNIT11_tree, root_0);

					pushFollow(FOLLOW_identifier_in_programHeading592);
					identifier12=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier12.getTree());

					SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_programHeading594); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "programHeading"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// .\\antlr\\pascal.g:284:1: identifier : IDENT ;
	public final pascalParser.identifier_return identifier() throws RecognitionException {
		pascalParser.identifier_return retval = new pascalParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT14=null;

		CommonTree IDENT14_tree=null;

		try {
			// .\\antlr\\pascal.g:285:5: ( IDENT )
			// .\\antlr\\pascal.g:285:7: IDENT
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT14=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier609); 
			IDENT14_tree = (CommonTree)adaptor.create(IDENT14);
			adaptor.addChild(root_0, IDENT14_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// .\\antlr\\pascal.g:288:1: block : ( labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | usesUnitsPart | IMPLEMENTATION )* compoundStatement ;
	public final pascalParser.block_return block() throws RecognitionException {
		pascalParser.block_return retval = new pascalParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IMPLEMENTATION21=null;
		ParserRuleReturnScope labelDeclarationPart15 =null;
		ParserRuleReturnScope constantDefinitionPart16 =null;
		ParserRuleReturnScope typeDefinitionPart17 =null;
		ParserRuleReturnScope variableDeclarationPart18 =null;
		ParserRuleReturnScope procedureAndFunctionDeclarationPart19 =null;
		ParserRuleReturnScope usesUnitsPart20 =null;
		ParserRuleReturnScope compoundStatement22 =null;

		CommonTree IMPLEMENTATION21_tree=null;

		try {
			// .\\antlr\\pascal.g:289:5: ( ( labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | usesUnitsPart | IMPLEMENTATION )* compoundStatement )
			// .\\antlr\\pascal.g:289:7: ( labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | usesUnitsPart | IMPLEMENTATION )* compoundStatement
			{
			root_0 = (CommonTree)adaptor.nil();


			// .\\antlr\\pascal.g:289:7: ( labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | usesUnitsPart | IMPLEMENTATION )*
			loop4:
			while (true) {
				int alt4=8;
				switch ( input.LA(1) ) {
				case LABEL:
					{
					alt4=1;
					}
					break;
				case CONST:
					{
					alt4=2;
					}
					break;
				case TYPE:
					{
					alt4=3;
					}
					break;
				case VAR:
					{
					alt4=4;
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					alt4=5;
					}
					break;
				case USES:
					{
					alt4=6;
					}
					break;
				case IMPLEMENTATION:
					{
					alt4=7;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// .\\antlr\\pascal.g:289:9: labelDeclarationPart
					{
					pushFollow(FOLLOW_labelDeclarationPart_in_block628);
					labelDeclarationPart15=labelDeclarationPart();
					state._fsp--;

					adaptor.addChild(root_0, labelDeclarationPart15.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:290:9: constantDefinitionPart
					{
					pushFollow(FOLLOW_constantDefinitionPart_in_block638);
					constantDefinitionPart16=constantDefinitionPart();
					state._fsp--;

					adaptor.addChild(root_0, constantDefinitionPart16.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:291:9: typeDefinitionPart
					{
					pushFollow(FOLLOW_typeDefinitionPart_in_block648);
					typeDefinitionPart17=typeDefinitionPart();
					state._fsp--;

					adaptor.addChild(root_0, typeDefinitionPart17.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:292:9: variableDeclarationPart
					{
					pushFollow(FOLLOW_variableDeclarationPart_in_block658);
					variableDeclarationPart18=variableDeclarationPart();
					state._fsp--;

					adaptor.addChild(root_0, variableDeclarationPart18.getTree());

					}
					break;
				case 5 :
					// .\\antlr\\pascal.g:293:9: procedureAndFunctionDeclarationPart
					{
					pushFollow(FOLLOW_procedureAndFunctionDeclarationPart_in_block668);
					procedureAndFunctionDeclarationPart19=procedureAndFunctionDeclarationPart();
					state._fsp--;

					adaptor.addChild(root_0, procedureAndFunctionDeclarationPart19.getTree());

					}
					break;
				case 6 :
					// .\\antlr\\pascal.g:294:9: usesUnitsPart
					{
					pushFollow(FOLLOW_usesUnitsPart_in_block678);
					usesUnitsPart20=usesUnitsPart();
					state._fsp--;

					adaptor.addChild(root_0, usesUnitsPart20.getTree());

					}
					break;
				case 7 :
					// .\\antlr\\pascal.g:295:9: IMPLEMENTATION
					{
					IMPLEMENTATION21=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_block688); 
					IMPLEMENTATION21_tree = (CommonTree)adaptor.create(IMPLEMENTATION21);
					adaptor.addChild(root_0, IMPLEMENTATION21_tree);

					}
					break;

				default :
					break loop4;
				}
			}

			pushFollow(FOLLOW_compoundStatement_in_block705);
			compoundStatement22=compoundStatement();
			state._fsp--;

			adaptor.addChild(root_0, compoundStatement22.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class usesUnitsPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "usesUnitsPart"
	// .\\antlr\\pascal.g:300:1: usesUnitsPart : USES ^ identifierList SEMI !;
	public final pascalParser.usesUnitsPart_return usesUnitsPart() throws RecognitionException {
		pascalParser.usesUnitsPart_return retval = new pascalParser.usesUnitsPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token USES23=null;
		Token SEMI25=null;
		ParserRuleReturnScope identifierList24 =null;

		CommonTree USES23_tree=null;
		CommonTree SEMI25_tree=null;

		try {
			// .\\antlr\\pascal.g:301:5: ( USES ^ identifierList SEMI !)
			// .\\antlr\\pascal.g:301:7: USES ^ identifierList SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			USES23=(Token)match(input,USES,FOLLOW_USES_in_usesUnitsPart722); 
			USES23_tree = (CommonTree)adaptor.create(USES23);
			root_0 = (CommonTree)adaptor.becomeRoot(USES23_tree, root_0);

			pushFollow(FOLLOW_identifierList_in_usesUnitsPart725);
			identifierList24=identifierList();
			state._fsp--;

			adaptor.addChild(root_0, identifierList24.getTree());

			SEMI25=(Token)match(input,SEMI,FOLLOW_SEMI_in_usesUnitsPart727); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "usesUnitsPart"


	public static class labelDeclarationPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "labelDeclarationPart"
	// .\\antlr\\pascal.g:304:1: labelDeclarationPart : LABEL ^ label ( COMMA ! label )* SEMI !;
	public final pascalParser.labelDeclarationPart_return labelDeclarationPart() throws RecognitionException {
		pascalParser.labelDeclarationPart_return retval = new pascalParser.labelDeclarationPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LABEL26=null;
		Token COMMA28=null;
		Token SEMI30=null;
		ParserRuleReturnScope label27 =null;
		ParserRuleReturnScope label29 =null;

		CommonTree LABEL26_tree=null;
		CommonTree COMMA28_tree=null;
		CommonTree SEMI30_tree=null;

		try {
			// .\\antlr\\pascal.g:305:5: ( LABEL ^ label ( COMMA ! label )* SEMI !)
			// .\\antlr\\pascal.g:305:7: LABEL ^ label ( COMMA ! label )* SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			LABEL26=(Token)match(input,LABEL,FOLLOW_LABEL_in_labelDeclarationPart745); 
			LABEL26_tree = (CommonTree)adaptor.create(LABEL26);
			root_0 = (CommonTree)adaptor.becomeRoot(LABEL26_tree, root_0);

			pushFollow(FOLLOW_label_in_labelDeclarationPart748);
			label27=label();
			state._fsp--;

			adaptor.addChild(root_0, label27.getTree());

			// .\\antlr\\pascal.g:305:20: ( COMMA ! label )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// .\\antlr\\pascal.g:305:22: COMMA ! label
					{
					COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_labelDeclarationPart752); 
					pushFollow(FOLLOW_label_in_labelDeclarationPart755);
					label29=label();
					state._fsp--;

					adaptor.addChild(root_0, label29.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			SEMI30=(Token)match(input,SEMI,FOLLOW_SEMI_in_labelDeclarationPart760); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "labelDeclarationPart"


	public static class label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// .\\antlr\\pascal.g:308:1: label : unsignedInteger ;
	public final pascalParser.label_return label() throws RecognitionException {
		pascalParser.label_return retval = new pascalParser.label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope unsignedInteger31 =null;


		try {
			// .\\antlr\\pascal.g:309:5: ( unsignedInteger )
			// .\\antlr\\pascal.g:309:7: unsignedInteger
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unsignedInteger_in_label778);
			unsignedInteger31=unsignedInteger();
			state._fsp--;

			adaptor.addChild(root_0, unsignedInteger31.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label"


	public static class constantDefinitionPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constantDefinitionPart"
	// .\\antlr\\pascal.g:312:1: constantDefinitionPart : CONST ^ constantDefinition ( SEMI ! constantDefinition )* SEMI !;
	public final pascalParser.constantDefinitionPart_return constantDefinitionPart() throws RecognitionException {
		pascalParser.constantDefinitionPart_return retval = new pascalParser.constantDefinitionPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CONST32=null;
		Token SEMI34=null;
		Token SEMI36=null;
		ParserRuleReturnScope constantDefinition33 =null;
		ParserRuleReturnScope constantDefinition35 =null;

		CommonTree CONST32_tree=null;
		CommonTree SEMI34_tree=null;
		CommonTree SEMI36_tree=null;

		try {
			// .\\antlr\\pascal.g:313:5: ( CONST ^ constantDefinition ( SEMI ! constantDefinition )* SEMI !)
			// .\\antlr\\pascal.g:313:7: CONST ^ constantDefinition ( SEMI ! constantDefinition )* SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			CONST32=(Token)match(input,CONST,FOLLOW_CONST_in_constantDefinitionPart795); 
			CONST32_tree = (CommonTree)adaptor.create(CONST32);
			root_0 = (CommonTree)adaptor.becomeRoot(CONST32_tree, root_0);

			pushFollow(FOLLOW_constantDefinition_in_constantDefinitionPart798);
			constantDefinition33=constantDefinition();
			state._fsp--;

			adaptor.addChild(root_0, constantDefinition33.getTree());

			// .\\antlr\\pascal.g:313:33: ( SEMI ! constantDefinition )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==SEMI) ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1==IDENT) ) {
						alt6=1;
					}

				}

				switch (alt6) {
				case 1 :
					// .\\antlr\\pascal.g:313:35: SEMI ! constantDefinition
					{
					SEMI34=(Token)match(input,SEMI,FOLLOW_SEMI_in_constantDefinitionPart802); 
					pushFollow(FOLLOW_constantDefinition_in_constantDefinitionPart805);
					constantDefinition35=constantDefinition();
					state._fsp--;

					adaptor.addChild(root_0, constantDefinition35.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			SEMI36=(Token)match(input,SEMI,FOLLOW_SEMI_in_constantDefinitionPart810); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantDefinitionPart"


	public static class constantDefinition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constantDefinition"
	// .\\antlr\\pascal.g:316:1: constantDefinition : identifier EQUAL ^ constant ;
	public final pascalParser.constantDefinition_return constantDefinition() throws RecognitionException {
		pascalParser.constantDefinition_return retval = new pascalParser.constantDefinition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL38=null;
		ParserRuleReturnScope identifier37 =null;
		ParserRuleReturnScope constant39 =null;

		CommonTree EQUAL38_tree=null;

		try {
			// .\\antlr\\pascal.g:317:5: ( identifier EQUAL ^ constant )
			// .\\antlr\\pascal.g:317:7: identifier EQUAL ^ constant
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_constantDefinition828);
			identifier37=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier37.getTree());

			EQUAL38=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_constantDefinition830); 
			EQUAL38_tree = (CommonTree)adaptor.create(EQUAL38);
			root_0 = (CommonTree)adaptor.becomeRoot(EQUAL38_tree, root_0);

			pushFollow(FOLLOW_constant_in_constantDefinition833);
			constant39=constant();
			state._fsp--;

			adaptor.addChild(root_0, constant39.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantDefinition"


	public static class constantChr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constantChr"
	// .\\antlr\\pascal.g:320:1: constantChr : CHR ^ LPAREN ! unsignedInteger RPAREN !;
	public final pascalParser.constantChr_return constantChr() throws RecognitionException {
		pascalParser.constantChr_return retval = new pascalParser.constantChr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CHR40=null;
		Token LPAREN41=null;
		Token RPAREN43=null;
		ParserRuleReturnScope unsignedInteger42 =null;

		CommonTree CHR40_tree=null;
		CommonTree LPAREN41_tree=null;
		CommonTree RPAREN43_tree=null;

		try {
			// .\\antlr\\pascal.g:321:5: ( CHR ^ LPAREN ! unsignedInteger RPAREN !)
			// .\\antlr\\pascal.g:321:7: CHR ^ LPAREN ! unsignedInteger RPAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			CHR40=(Token)match(input,CHR,FOLLOW_CHR_in_constantChr850); 
			CHR40_tree = (CommonTree)adaptor.create(CHR40);
			root_0 = (CommonTree)adaptor.becomeRoot(CHR40_tree, root_0);

			LPAREN41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constantChr853); 
			pushFollow(FOLLOW_unsignedInteger_in_constantChr856);
			unsignedInteger42=unsignedInteger();
			state._fsp--;

			adaptor.addChild(root_0, unsignedInteger42.getTree());

			RPAREN43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constantChr858); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantChr"


	public static class constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// .\\antlr\\pascal.g:324:1: constant : ( unsignedNumber |s= sign n= unsignedNumber -> ^( $s $n) | identifier |s2= sign id= identifier -> ^( $s2 $id) | string | constantChr );
	public final pascalParser.constant_return constant() throws RecognitionException {
		pascalParser.constant_return retval = new pascalParser.constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope s =null;
		ParserRuleReturnScope n =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope id =null;
		ParserRuleReturnScope unsignedNumber44 =null;
		ParserRuleReturnScope identifier45 =null;
		ParserRuleReturnScope string46 =null;
		ParserRuleReturnScope constantChr47 =null;

		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_unsignedNumber=new RewriteRuleSubtreeStream(adaptor,"rule unsignedNumber");
		RewriteRuleSubtreeStream stream_sign=new RewriteRuleSubtreeStream(adaptor,"rule sign");

		try {
			// .\\antlr\\pascal.g:325:5: ( unsignedNumber |s= sign n= unsignedNumber -> ^( $s $n) | identifier |s2= sign id= identifier -> ^( $s2 $id) | string | constantChr )
			int alt7=6;
			switch ( input.LA(1) ) {
			case NUM_INT:
			case NUM_REAL:
				{
				alt7=1;
				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA7_3 = input.LA(2);
				if ( ((LA7_3 >= NUM_INT && LA7_3 <= NUM_REAL)) ) {
					alt7=2;
				}
				else if ( (LA7_3==IDENT) ) {
					alt7=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IDENT:
				{
				alt7=3;
				}
				break;
			case STRING_LITERAL:
				{
				alt7=5;
				}
				break;
			case CHR:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// .\\antlr\\pascal.g:325:7: unsignedNumber
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unsignedNumber_in_constant876);
					unsignedNumber44=unsignedNumber();
					state._fsp--;

					adaptor.addChild(root_0, unsignedNumber44.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:326:7: s= sign n= unsignedNumber
					{
					pushFollow(FOLLOW_sign_in_constant886);
					s=sign();
					state._fsp--;

					stream_sign.add(s.getTree());
					pushFollow(FOLLOW_unsignedNumber_in_constant890);
					n=unsignedNumber();
					state._fsp--;

					stream_unsignedNumber.add(n.getTree());
					// AST REWRITE
					// elements: n, s
					// token labels: 
					// rule labels: s, n, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
					RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 326:31: -> ^( $s $n)
					{
						// .\\antlr\\pascal.g:326:34: ^( $s $n)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_s.nextNode(), root_1);
						adaptor.addChild(root_1, stream_n.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:327:7: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_constant909);
					identifier45=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier45.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:328:7: s2= sign id= identifier
					{
					pushFollow(FOLLOW_sign_in_constant919);
					s2=sign();
					state._fsp--;

					stream_sign.add(s2.getTree());
					pushFollow(FOLLOW_identifier_in_constant923);
					id=identifier();
					state._fsp--;

					stream_identifier.add(id.getTree());
					// AST REWRITE
					// elements: id, s2
					// token labels: 
					// rule labels: id, retval, s2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 328:29: -> ^( $s2 $id)
					{
						// .\\antlr\\pascal.g:328:32: ^( $s2 $id)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_s2.nextNode(), root_1);
						adaptor.addChild(root_1, stream_id.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// .\\antlr\\pascal.g:330:7: string
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_in_constant947);
					string46=string();
					state._fsp--;

					adaptor.addChild(root_0, string46.getTree());

					}
					break;
				case 6 :
					// .\\antlr\\pascal.g:331:7: constantChr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constantChr_in_constant955);
					constantChr47=constantChr();
					state._fsp--;

					adaptor.addChild(root_0, constantChr47.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class unsignedNumber_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unsignedNumber"
	// .\\antlr\\pascal.g:334:1: unsignedNumber : ( unsignedInteger | unsignedReal );
	public final pascalParser.unsignedNumber_return unsignedNumber() throws RecognitionException {
		pascalParser.unsignedNumber_return retval = new pascalParser.unsignedNumber_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope unsignedInteger48 =null;
		ParserRuleReturnScope unsignedReal49 =null;


		try {
			// .\\antlr\\pascal.g:335:5: ( unsignedInteger | unsignedReal )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==NUM_INT) ) {
				alt8=1;
			}
			else if ( (LA8_0==NUM_REAL) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// .\\antlr\\pascal.g:335:7: unsignedInteger
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unsignedInteger_in_unsignedNumber972);
					unsignedInteger48=unsignedInteger();
					state._fsp--;

					adaptor.addChild(root_0, unsignedInteger48.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:336:7: unsignedReal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unsignedReal_in_unsignedNumber980);
					unsignedReal49=unsignedReal();
					state._fsp--;

					adaptor.addChild(root_0, unsignedReal49.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unsignedNumber"


	public static class unsignedInteger_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unsignedInteger"
	// .\\antlr\\pascal.g:339:1: unsignedInteger : NUM_INT ;
	public final pascalParser.unsignedInteger_return unsignedInteger() throws RecognitionException {
		pascalParser.unsignedInteger_return retval = new pascalParser.unsignedInteger_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUM_INT50=null;

		CommonTree NUM_INT50_tree=null;

		try {
			// .\\antlr\\pascal.g:340:5: ( NUM_INT )
			// .\\antlr\\pascal.g:340:7: NUM_INT
			{
			root_0 = (CommonTree)adaptor.nil();


			NUM_INT50=(Token)match(input,NUM_INT,FOLLOW_NUM_INT_in_unsignedInteger997); 
			NUM_INT50_tree = (CommonTree)adaptor.create(NUM_INT50);
			adaptor.addChild(root_0, NUM_INT50_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unsignedInteger"


	public static class unsignedReal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unsignedReal"
	// .\\antlr\\pascal.g:343:1: unsignedReal : NUM_REAL ;
	public final pascalParser.unsignedReal_return unsignedReal() throws RecognitionException {
		pascalParser.unsignedReal_return retval = new pascalParser.unsignedReal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUM_REAL51=null;

		CommonTree NUM_REAL51_tree=null;

		try {
			// .\\antlr\\pascal.g:344:5: ( NUM_REAL )
			// .\\antlr\\pascal.g:344:7: NUM_REAL
			{
			root_0 = (CommonTree)adaptor.nil();


			NUM_REAL51=(Token)match(input,NUM_REAL,FOLLOW_NUM_REAL_in_unsignedReal1014); 
			NUM_REAL51_tree = (CommonTree)adaptor.create(NUM_REAL51);
			adaptor.addChild(root_0, NUM_REAL51_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unsignedReal"


	public static class sign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sign"
	// .\\antlr\\pascal.g:347:1: sign : ( PLUS | MINUS );
	public final pascalParser.sign_return sign() throws RecognitionException {
		pascalParser.sign_return retval = new pascalParser.sign_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set52=null;

		CommonTree set52_tree=null;

		try {
			// .\\antlr\\pascal.g:348:5: ( PLUS | MINUS )
			// .\\antlr\\pascal.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set52=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set52));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sign"


	public static class string_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string"
	// .\\antlr\\pascal.g:351:1: string : STRING_LITERAL ;
	public final pascalParser.string_return string() throws RecognitionException {
		pascalParser.string_return retval = new pascalParser.string_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STRING_LITERAL53=null;

		CommonTree STRING_LITERAL53_tree=null;

		try {
			// .\\antlr\\pascal.g:352:5: ( STRING_LITERAL )
			// .\\antlr\\pascal.g:352:7: STRING_LITERAL
			{
			root_0 = (CommonTree)adaptor.nil();


			STRING_LITERAL53=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string1052); 
			STRING_LITERAL53_tree = (CommonTree)adaptor.create(STRING_LITERAL53);
			adaptor.addChild(root_0, STRING_LITERAL53_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"


	public static class typeDefinitionPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeDefinitionPart"
	// .\\antlr\\pascal.g:355:1: typeDefinitionPart : TYPE ^ typeDefinition ( SEMI ! typeDefinition )* SEMI !;
	public final pascalParser.typeDefinitionPart_return typeDefinitionPart() throws RecognitionException {
		pascalParser.typeDefinitionPart_return retval = new pascalParser.typeDefinitionPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TYPE54=null;
		Token SEMI56=null;
		Token SEMI58=null;
		ParserRuleReturnScope typeDefinition55 =null;
		ParserRuleReturnScope typeDefinition57 =null;

		CommonTree TYPE54_tree=null;
		CommonTree SEMI56_tree=null;
		CommonTree SEMI58_tree=null;

		try {
			// .\\antlr\\pascal.g:356:5: ( TYPE ^ typeDefinition ( SEMI ! typeDefinition )* SEMI !)
			// .\\antlr\\pascal.g:356:7: TYPE ^ typeDefinition ( SEMI ! typeDefinition )* SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			TYPE54=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDefinitionPart1069); 
			TYPE54_tree = (CommonTree)adaptor.create(TYPE54);
			root_0 = (CommonTree)adaptor.becomeRoot(TYPE54_tree, root_0);

			pushFollow(FOLLOW_typeDefinition_in_typeDefinitionPart1072);
			typeDefinition55=typeDefinition();
			state._fsp--;

			adaptor.addChild(root_0, typeDefinition55.getTree());

			// .\\antlr\\pascal.g:356:28: ( SEMI ! typeDefinition )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==SEMI) ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1==IDENT) ) {
						alt9=1;
					}

				}

				switch (alt9) {
				case 1 :
					// .\\antlr\\pascal.g:356:30: SEMI ! typeDefinition
					{
					SEMI56=(Token)match(input,SEMI,FOLLOW_SEMI_in_typeDefinitionPart1076); 
					pushFollow(FOLLOW_typeDefinition_in_typeDefinitionPart1079);
					typeDefinition57=typeDefinition();
					state._fsp--;

					adaptor.addChild(root_0, typeDefinition57.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			SEMI58=(Token)match(input,SEMI,FOLLOW_SEMI_in_typeDefinitionPart1084); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeDefinitionPart"


	public static class typeDefinition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeDefinition"
	// .\\antlr\\pascal.g:360:1: typeDefinition : identifier e= EQUAL ^ ( type | functionType | procedureType ) ;
	public final pascalParser.typeDefinition_return typeDefinition() throws RecognitionException {
		pascalParser.typeDefinition_return retval = new pascalParser.typeDefinition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token e=null;
		ParserRuleReturnScope identifier59 =null;
		ParserRuleReturnScope type60 =null;
		ParserRuleReturnScope functionType61 =null;
		ParserRuleReturnScope procedureType62 =null;

		CommonTree e_tree=null;

		try {
			// .\\antlr\\pascal.g:361:5: ( identifier e= EQUAL ^ ( type | functionType | procedureType ) )
			// .\\antlr\\pascal.g:361:7: identifier e= EQUAL ^ ( type | functionType | procedureType )
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_typeDefinition1103);
			identifier59=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier59.getTree());

			e=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_typeDefinition1107); 
			e_tree = (CommonTree)adaptor.create(e);
			root_0 = (CommonTree)adaptor.becomeRoot(e_tree, root_0);

			e.setType(TYPEDECL);
			// .\\antlr\\pascal.g:362:7: ( type | functionType | procedureType )
			int alt10=3;
			switch ( input.LA(1) ) {
			case ARRAY:
			case BOOLEAN:
			case CHAR:
			case CHR:
			case FILE:
			case IDENT:
			case INTEGER:
			case LPAREN:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
			case PACKED:
			case PLUS:
			case POINTER:
			case REAL:
			case RECORD:
			case SET:
			case STRING:
			case STRING_LITERAL:
				{
				alt10=1;
				}
				break;
			case FUNCTION:
				{
				alt10=2;
				}
				break;
			case PROCEDURE:
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
					// .\\antlr\\pascal.g:362:9: type
					{
					pushFollow(FOLLOW_type_in_typeDefinition1120);
					type60=type();
					state._fsp--;

					adaptor.addChild(root_0, type60.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:363:9: functionType
					{
					pushFollow(FOLLOW_functionType_in_typeDefinition1130);
					functionType61=functionType();
					state._fsp--;

					adaptor.addChild(root_0, functionType61.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:365:9: procedureType
					{
					pushFollow(FOLLOW_procedureType_in_typeDefinition1142);
					procedureType62=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType62.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeDefinition"


	public static class functionType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionType"
	// .\\antlr\\pascal.g:370:1: functionType : FUNCTION ^ ( formalParameterList )? COLON ! resultType ;
	public final pascalParser.functionType_return functionType() throws RecognitionException {
		pascalParser.functionType_return retval = new pascalParser.functionType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUNCTION63=null;
		Token COLON65=null;
		ParserRuleReturnScope formalParameterList64 =null;
		ParserRuleReturnScope resultType66 =null;

		CommonTree FUNCTION63_tree=null;
		CommonTree COLON65_tree=null;

		try {
			// .\\antlr\\pascal.g:371:5: ( FUNCTION ^ ( formalParameterList )? COLON ! resultType )
			// .\\antlr\\pascal.g:371:7: FUNCTION ^ ( formalParameterList )? COLON ! resultType
			{
			root_0 = (CommonTree)adaptor.nil();


			FUNCTION63=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionType1168); 
			FUNCTION63_tree = (CommonTree)adaptor.create(FUNCTION63);
			root_0 = (CommonTree)adaptor.becomeRoot(FUNCTION63_tree, root_0);

			// .\\antlr\\pascal.g:371:17: ( formalParameterList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==LPAREN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// .\\antlr\\pascal.g:371:18: formalParameterList
					{
					pushFollow(FOLLOW_formalParameterList_in_functionType1172);
					formalParameterList64=formalParameterList();
					state._fsp--;

					adaptor.addChild(root_0, formalParameterList64.getTree());

					}
					break;

			}

			COLON65=(Token)match(input,COLON,FOLLOW_COLON_in_functionType1176); 
			pushFollow(FOLLOW_resultType_in_functionType1179);
			resultType66=resultType();
			state._fsp--;

			adaptor.addChild(root_0, resultType66.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionType"


	public static class procedureType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedureType"
	// .\\antlr\\pascal.g:374:1: procedureType : PROCEDURE ^ ( formalParameterList )? ;
	public final pascalParser.procedureType_return procedureType() throws RecognitionException {
		pascalParser.procedureType_return retval = new pascalParser.procedureType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PROCEDURE67=null;
		ParserRuleReturnScope formalParameterList68 =null;

		CommonTree PROCEDURE67_tree=null;

		try {
			// .\\antlr\\pascal.g:375:5: ( PROCEDURE ^ ( formalParameterList )? )
			// .\\antlr\\pascal.g:375:7: PROCEDURE ^ ( formalParameterList )?
			{
			root_0 = (CommonTree)adaptor.nil();


			PROCEDURE67=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureType1196); 
			PROCEDURE67_tree = (CommonTree)adaptor.create(PROCEDURE67);
			root_0 = (CommonTree)adaptor.becomeRoot(PROCEDURE67_tree, root_0);

			// .\\antlr\\pascal.g:375:18: ( formalParameterList )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==LPAREN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// .\\antlr\\pascal.g:375:19: formalParameterList
					{
					pushFollow(FOLLOW_formalParameterList_in_procedureType1200);
					formalParameterList68=formalParameterList();
					state._fsp--;

					adaptor.addChild(root_0, formalParameterList68.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureType"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// .\\antlr\\pascal.g:378:1: type : ( simpleType | structuredType | pointerType );
	public final pascalParser.type_return type() throws RecognitionException {
		pascalParser.type_return retval = new pascalParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleType69 =null;
		ParserRuleReturnScope structuredType70 =null;
		ParserRuleReturnScope pointerType71 =null;


		try {
			// .\\antlr\\pascal.g:379:5: ( simpleType | structuredType | pointerType )
			int alt13=3;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case CHAR:
			case CHR:
			case IDENT:
			case INTEGER:
			case LPAREN:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
			case PLUS:
			case REAL:
			case STRING:
			case STRING_LITERAL:
				{
				alt13=1;
				}
				break;
			case ARRAY:
			case FILE:
			case PACKED:
			case RECORD:
			case SET:
				{
				alt13=2;
				}
				break;
			case POINTER:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// .\\antlr\\pascal.g:379:7: simpleType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleType_in_type1219);
					simpleType69=simpleType();
					state._fsp--;

					adaptor.addChild(root_0, simpleType69.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:380:7: structuredType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_structuredType_in_type1227);
					structuredType70=structuredType();
					state._fsp--;

					adaptor.addChild(root_0, structuredType70.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:381:7: pointerType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_pointerType_in_type1235);
					pointerType71=pointerType();
					state._fsp--;

					adaptor.addChild(root_0, pointerType71.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class simpleType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleType"
	// .\\antlr\\pascal.g:384:1: simpleType : ( scalarType | subrangeType | typeIdentifier | stringtype );
	public final pascalParser.simpleType_return simpleType() throws RecognitionException {
		pascalParser.simpleType_return retval = new pascalParser.simpleType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope scalarType72 =null;
		ParserRuleReturnScope subrangeType73 =null;
		ParserRuleReturnScope typeIdentifier74 =null;
		ParserRuleReturnScope stringtype75 =null;


		try {
			// .\\antlr\\pascal.g:385:5: ( scalarType | subrangeType | typeIdentifier | stringtype )
			int alt14=4;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt14=1;
				}
				break;
			case CHR:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
			case PLUS:
			case STRING_LITERAL:
				{
				alt14=2;
				}
				break;
			case IDENT:
				{
				int LA14_5 = input.LA(2);
				if ( (LA14_5==DOTDOT) ) {
					alt14=2;
				}
				else if ( (LA14_5==COMMA||LA14_5==END||(LA14_5 >= RBRACK && LA14_5 <= RBRACK2)||LA14_5==RPAREN||LA14_5==SEMI) ) {
					alt14=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
				{
				alt14=3;
				}
				break;
			case STRING:
				{
				int LA14_12 = input.LA(2);
				if ( (LA14_12==LBRACK) ) {
					alt14=4;
				}
				else if ( (LA14_12==COMMA||LA14_12==END||(LA14_12 >= RBRACK && LA14_12 <= RBRACK2)||LA14_12==RPAREN||LA14_12==SEMI) ) {
					alt14=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// .\\antlr\\pascal.g:385:7: scalarType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_scalarType_in_simpleType1252);
					scalarType72=scalarType();
					state._fsp--;

					adaptor.addChild(root_0, scalarType72.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:386:7: subrangeType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_subrangeType_in_simpleType1260);
					subrangeType73=subrangeType();
					state._fsp--;

					adaptor.addChild(root_0, subrangeType73.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:387:7: typeIdentifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeIdentifier_in_simpleType1268);
					typeIdentifier74=typeIdentifier();
					state._fsp--;

					adaptor.addChild(root_0, typeIdentifier74.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:388:7: stringtype
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_stringtype_in_simpleType1276);
					stringtype75=stringtype();
					state._fsp--;

					adaptor.addChild(root_0, stringtype75.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleType"


	public static class scalarType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "scalarType"
	// .\\antlr\\pascal.g:391:1: scalarType : LPAREN identifierList RPAREN -> ^( SCALARTYPE identifierList ) ;
	public final pascalParser.scalarType_return scalarType() throws RecognitionException {
		pascalParser.scalarType_return retval = new pascalParser.scalarType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN76=null;
		Token RPAREN78=null;
		ParserRuleReturnScope identifierList77 =null;

		CommonTree LPAREN76_tree=null;
		CommonTree RPAREN78_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");

		try {
			// .\\antlr\\pascal.g:392:5: ( LPAREN identifierList RPAREN -> ^( SCALARTYPE identifierList ) )
			// .\\antlr\\pascal.g:392:7: LPAREN identifierList RPAREN
			{
			LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scalarType1293);  
			stream_LPAREN.add(LPAREN76);

			pushFollow(FOLLOW_identifierList_in_scalarType1295);
			identifierList77=identifierList();
			state._fsp--;

			stream_identifierList.add(identifierList77.getTree());
			RPAREN78=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scalarType1297);  
			stream_RPAREN.add(RPAREN78);

			// AST REWRITE
			// elements: identifierList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 392:37: -> ^( SCALARTYPE identifierList )
			{
				// .\\antlr\\pascal.g:392:40: ^( SCALARTYPE identifierList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCALARTYPE, "SCALARTYPE"), root_1);
				adaptor.addChild(root_1, stream_identifierList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalarType"


	public static class subrangeType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "subrangeType"
	// .\\antlr\\pascal.g:396:1: subrangeType : constant DOTDOT ^ constant ;
	public final pascalParser.subrangeType_return subrangeType() throws RecognitionException {
		pascalParser.subrangeType_return retval = new pascalParser.subrangeType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOTDOT80=null;
		ParserRuleReturnScope constant79 =null;
		ParserRuleReturnScope constant81 =null;

		CommonTree DOTDOT80_tree=null;

		try {
			// .\\antlr\\pascal.g:397:5: ( constant DOTDOT ^ constant )
			// .\\antlr\\pascal.g:397:7: constant DOTDOT ^ constant
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_constant_in_subrangeType1328);
			constant79=constant();
			state._fsp--;

			adaptor.addChild(root_0, constant79.getTree());

			DOTDOT80=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_subrangeType1330); 
			DOTDOT80_tree = (CommonTree)adaptor.create(DOTDOT80);
			root_0 = (CommonTree)adaptor.becomeRoot(DOTDOT80_tree, root_0);

			pushFollow(FOLLOW_constant_in_subrangeType1333);
			constant81=constant();
			state._fsp--;

			adaptor.addChild(root_0, constant81.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subrangeType"


	public static class typeIdentifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeIdentifier"
	// .\\antlr\\pascal.g:400:1: typeIdentifier : ( identifier | CHAR | BOOLEAN | INTEGER | REAL | STRING );
	public final pascalParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
		pascalParser.typeIdentifier_return retval = new pascalParser.typeIdentifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CHAR83=null;
		Token BOOLEAN84=null;
		Token INTEGER85=null;
		Token REAL86=null;
		Token STRING87=null;
		ParserRuleReturnScope identifier82 =null;

		CommonTree CHAR83_tree=null;
		CommonTree BOOLEAN84_tree=null;
		CommonTree INTEGER85_tree=null;
		CommonTree REAL86_tree=null;
		CommonTree STRING87_tree=null;

		try {
			// .\\antlr\\pascal.g:401:5: ( identifier | CHAR | BOOLEAN | INTEGER | REAL | STRING )
			int alt15=6;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt15=1;
				}
				break;
			case CHAR:
				{
				alt15=2;
				}
				break;
			case BOOLEAN:
				{
				alt15=3;
				}
				break;
			case INTEGER:
				{
				alt15=4;
				}
				break;
			case REAL:
				{
				alt15=5;
				}
				break;
			case STRING:
				{
				alt15=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// .\\antlr\\pascal.g:401:7: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_typeIdentifier1350);
					identifier82=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier82.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:402:7: CHAR
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR83=(Token)match(input,CHAR,FOLLOW_CHAR_in_typeIdentifier1358); 
					CHAR83_tree = (CommonTree)adaptor.create(CHAR83);
					adaptor.addChild(root_0, CHAR83_tree);

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:403:7: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN84=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_typeIdentifier1366); 
					BOOLEAN84_tree = (CommonTree)adaptor.create(BOOLEAN84);
					adaptor.addChild(root_0, BOOLEAN84_tree);

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:404:7: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER85=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_typeIdentifier1374); 
					INTEGER85_tree = (CommonTree)adaptor.create(INTEGER85);
					adaptor.addChild(root_0, INTEGER85_tree);

					}
					break;
				case 5 :
					// .\\antlr\\pascal.g:405:7: REAL
					{
					root_0 = (CommonTree)adaptor.nil();


					REAL86=(Token)match(input,REAL,FOLLOW_REAL_in_typeIdentifier1382); 
					REAL86_tree = (CommonTree)adaptor.create(REAL86);
					adaptor.addChild(root_0, REAL86_tree);

					}
					break;
				case 6 :
					// .\\antlr\\pascal.g:406:7: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING87=(Token)match(input,STRING,FOLLOW_STRING_in_typeIdentifier1390); 
					STRING87_tree = (CommonTree)adaptor.create(STRING87);
					adaptor.addChild(root_0, STRING87_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeIdentifier"


	public static class structuredType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "structuredType"
	// .\\antlr\\pascal.g:409:1: structuredType : ( PACKED ^ unpackedStructuredType | unpackedStructuredType );
	public final pascalParser.structuredType_return structuredType() throws RecognitionException {
		pascalParser.structuredType_return retval = new pascalParser.structuredType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PACKED88=null;
		ParserRuleReturnScope unpackedStructuredType89 =null;
		ParserRuleReturnScope unpackedStructuredType90 =null;

		CommonTree PACKED88_tree=null;

		try {
			// .\\antlr\\pascal.g:410:5: ( PACKED ^ unpackedStructuredType | unpackedStructuredType )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==PACKED) ) {
				alt16=1;
			}
			else if ( (LA16_0==ARRAY||LA16_0==FILE||LA16_0==RECORD||LA16_0==SET) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// .\\antlr\\pascal.g:410:7: PACKED ^ unpackedStructuredType
					{
					root_0 = (CommonTree)adaptor.nil();


					PACKED88=(Token)match(input,PACKED,FOLLOW_PACKED_in_structuredType1408); 
					PACKED88_tree = (CommonTree)adaptor.create(PACKED88);
					root_0 = (CommonTree)adaptor.becomeRoot(PACKED88_tree, root_0);

					pushFollow(FOLLOW_unpackedStructuredType_in_structuredType1411);
					unpackedStructuredType89=unpackedStructuredType();
					state._fsp--;

					adaptor.addChild(root_0, unpackedStructuredType89.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:411:5: unpackedStructuredType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unpackedStructuredType_in_structuredType1417);
					unpackedStructuredType90=unpackedStructuredType();
					state._fsp--;

					adaptor.addChild(root_0, unpackedStructuredType90.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structuredType"


	public static class unpackedStructuredType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unpackedStructuredType"
	// .\\antlr\\pascal.g:414:1: unpackedStructuredType : ( arrayType | recordType | setType | fileType );
	public final pascalParser.unpackedStructuredType_return unpackedStructuredType() throws RecognitionException {
		pascalParser.unpackedStructuredType_return retval = new pascalParser.unpackedStructuredType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope arrayType91 =null;
		ParserRuleReturnScope recordType92 =null;
		ParserRuleReturnScope setType93 =null;
		ParserRuleReturnScope fileType94 =null;


		try {
			// .\\antlr\\pascal.g:415:5: ( arrayType | recordType | setType | fileType )
			int alt17=4;
			switch ( input.LA(1) ) {
			case ARRAY:
				{
				alt17=1;
				}
				break;
			case RECORD:
				{
				alt17=2;
				}
				break;
			case SET:
				{
				alt17=3;
				}
				break;
			case FILE:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// .\\antlr\\pascal.g:415:7: arrayType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_unpackedStructuredType1434);
					arrayType91=arrayType();
					state._fsp--;

					adaptor.addChild(root_0, arrayType91.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:416:7: recordType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_unpackedStructuredType1442);
					recordType92=recordType();
					state._fsp--;

					adaptor.addChild(root_0, recordType92.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:417:7: setType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_setType_in_unpackedStructuredType1450);
					setType93=setType();
					state._fsp--;

					adaptor.addChild(root_0, setType93.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:418:7: fileType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fileType_in_unpackedStructuredType1458);
					fileType94=fileType();
					state._fsp--;

					adaptor.addChild(root_0, fileType94.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unpackedStructuredType"


	public static class stringtype_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stringtype"
	// .\\antlr\\pascal.g:421:1: stringtype : STRING ^ LBRACK ! ( identifier | unsignedNumber ) RBRACK !;
	public final pascalParser.stringtype_return stringtype() throws RecognitionException {
		pascalParser.stringtype_return retval = new pascalParser.stringtype_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STRING95=null;
		Token LBRACK96=null;
		Token RBRACK99=null;
		ParserRuleReturnScope identifier97 =null;
		ParserRuleReturnScope unsignedNumber98 =null;

		CommonTree STRING95_tree=null;
		CommonTree LBRACK96_tree=null;
		CommonTree RBRACK99_tree=null;

		try {
			// .\\antlr\\pascal.g:422:5: ( STRING ^ LBRACK ! ( identifier | unsignedNumber ) RBRACK !)
			// .\\antlr\\pascal.g:422:7: STRING ^ LBRACK ! ( identifier | unsignedNumber ) RBRACK !
			{
			root_0 = (CommonTree)adaptor.nil();


			STRING95=(Token)match(input,STRING,FOLLOW_STRING_in_stringtype1475); 
			STRING95_tree = (CommonTree)adaptor.create(STRING95);
			root_0 = (CommonTree)adaptor.becomeRoot(STRING95_tree, root_0);

			LBRACK96=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_stringtype1478); 
			// .\\antlr\\pascal.g:422:23: ( identifier | unsignedNumber )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==IDENT) ) {
				alt18=1;
			}
			else if ( ((LA18_0 >= NUM_INT && LA18_0 <= NUM_REAL)) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// .\\antlr\\pascal.g:422:24: identifier
					{
					pushFollow(FOLLOW_identifier_in_stringtype1482);
					identifier97=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier97.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:422:35: unsignedNumber
					{
					pushFollow(FOLLOW_unsignedNumber_in_stringtype1484);
					unsignedNumber98=unsignedNumber();
					state._fsp--;

					adaptor.addChild(root_0, unsignedNumber98.getTree());

					}
					break;

			}

			RBRACK99=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_stringtype1487); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringtype"


	public static class arrayType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayType"
	// .\\antlr\\pascal.g:425:1: arrayType : ( ARRAY ^ LBRACK ! typeList RBRACK ! OF ! componentType | ARRAY ^ LBRACK2 ! typeList RBRACK2 ! OF ! componentType );
	public final pascalParser.arrayType_return arrayType() throws RecognitionException {
		pascalParser.arrayType_return retval = new pascalParser.arrayType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARRAY100=null;
		Token LBRACK101=null;
		Token RBRACK103=null;
		Token OF104=null;
		Token ARRAY106=null;
		Token LBRACK2107=null;
		Token RBRACK2109=null;
		Token OF110=null;
		ParserRuleReturnScope typeList102 =null;
		ParserRuleReturnScope componentType105 =null;
		ParserRuleReturnScope typeList108 =null;
		ParserRuleReturnScope componentType111 =null;

		CommonTree ARRAY100_tree=null;
		CommonTree LBRACK101_tree=null;
		CommonTree RBRACK103_tree=null;
		CommonTree OF104_tree=null;
		CommonTree ARRAY106_tree=null;
		CommonTree LBRACK2107_tree=null;
		CommonTree RBRACK2109_tree=null;
		CommonTree OF110_tree=null;

		try {
			// .\\antlr\\pascal.g:426:5: ( ARRAY ^ LBRACK ! typeList RBRACK ! OF ! componentType | ARRAY ^ LBRACK2 ! typeList RBRACK2 ! OF ! componentType )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ARRAY) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==LBRACK) ) {
					alt19=1;
				}
				else if ( (LA19_1==LBRACK2) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// .\\antlr\\pascal.g:426:7: ARRAY ^ LBRACK ! typeList RBRACK ! OF ! componentType
					{
					root_0 = (CommonTree)adaptor.nil();


					ARRAY100=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1505); 
					ARRAY100_tree = (CommonTree)adaptor.create(ARRAY100);
					root_0 = (CommonTree)adaptor.becomeRoot(ARRAY100_tree, root_0);

					LBRACK101=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayType1508); 
					pushFollow(FOLLOW_typeList_in_arrayType1511);
					typeList102=typeList();
					state._fsp--;

					adaptor.addChild(root_0, typeList102.getTree());

					RBRACK103=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayType1513); 
					OF104=(Token)match(input,OF,FOLLOW_OF_in_arrayType1516); 
					pushFollow(FOLLOW_componentType_in_arrayType1519);
					componentType105=componentType();
					state._fsp--;

					adaptor.addChild(root_0, componentType105.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:427:7: ARRAY ^ LBRACK2 ! typeList RBRACK2 ! OF ! componentType
					{
					root_0 = (CommonTree)adaptor.nil();


					ARRAY106=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1527); 
					ARRAY106_tree = (CommonTree)adaptor.create(ARRAY106);
					root_0 = (CommonTree)adaptor.becomeRoot(ARRAY106_tree, root_0);

					LBRACK2107=(Token)match(input,LBRACK2,FOLLOW_LBRACK2_in_arrayType1530); 
					pushFollow(FOLLOW_typeList_in_arrayType1533);
					typeList108=typeList();
					state._fsp--;

					adaptor.addChild(root_0, typeList108.getTree());

					RBRACK2109=(Token)match(input,RBRACK2,FOLLOW_RBRACK2_in_arrayType1535); 
					OF110=(Token)match(input,OF,FOLLOW_OF_in_arrayType1538); 
					pushFollow(FOLLOW_componentType_in_arrayType1541);
					componentType111=componentType();
					state._fsp--;

					adaptor.addChild(root_0, componentType111.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayType"


	public static class typeList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeList"
	// .\\antlr\\pascal.g:430:1: typeList : indexType ( COMMA indexType )* -> ^( TYPELIST ( indexType )+ ) ;
	public final pascalParser.typeList_return typeList() throws RecognitionException {
		pascalParser.typeList_return retval = new pascalParser.typeList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA113=null;
		ParserRuleReturnScope indexType112 =null;
		ParserRuleReturnScope indexType114 =null;

		CommonTree COMMA113_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_indexType=new RewriteRuleSubtreeStream(adaptor,"rule indexType");

		try {
			// .\\antlr\\pascal.g:431:2: ( indexType ( COMMA indexType )* -> ^( TYPELIST ( indexType )+ ) )
			// .\\antlr\\pascal.g:431:4: indexType ( COMMA indexType )*
			{
			pushFollow(FOLLOW_indexType_in_typeList1552);
			indexType112=indexType();
			state._fsp--;

			stream_indexType.add(indexType112.getTree());
			// .\\antlr\\pascal.g:431:14: ( COMMA indexType )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COMMA) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// .\\antlr\\pascal.g:431:16: COMMA indexType
					{
					COMMA113=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1556);  
					stream_COMMA.add(COMMA113);

					pushFollow(FOLLOW_indexType_in_typeList1558);
					indexType114=indexType();
					state._fsp--;

					stream_indexType.add(indexType114.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			// AST REWRITE
			// elements: indexType
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 431:36: -> ^( TYPELIST ( indexType )+ )
			{
				// .\\antlr\\pascal.g:431:39: ^( TYPELIST ( indexType )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPELIST, "TYPELIST"), root_1);
				if ( !(stream_indexType.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_indexType.hasNext() ) {
					adaptor.addChild(root_1, stream_indexType.nextTree());
				}
				stream_indexType.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeList"


	public static class indexType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "indexType"
	// .\\antlr\\pascal.g:434:1: indexType : simpleType ;
	public final pascalParser.indexType_return indexType() throws RecognitionException {
		pascalParser.indexType_return retval = new pascalParser.indexType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleType115 =null;


		try {
			// .\\antlr\\pascal.g:435:5: ( simpleType )
			// .\\antlr\\pascal.g:435:7: simpleType
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleType_in_indexType1585);
			simpleType115=simpleType();
			state._fsp--;

			adaptor.addChild(root_0, simpleType115.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexType"


	public static class componentType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "componentType"
	// .\\antlr\\pascal.g:438:1: componentType : type ;
	public final pascalParser.componentType_return componentType() throws RecognitionException {
		pascalParser.componentType_return retval = new pascalParser.componentType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope type116 =null;


		try {
			// .\\antlr\\pascal.g:439:5: ( type )
			// .\\antlr\\pascal.g:439:7: type
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_type_in_componentType1602);
			type116=type();
			state._fsp--;

			adaptor.addChild(root_0, type116.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "componentType"


	public static class recordType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "recordType"
	// .\\antlr\\pascal.g:442:1: recordType : RECORD ^ fieldList END !;
	public final pascalParser.recordType_return recordType() throws RecognitionException {
		pascalParser.recordType_return retval = new pascalParser.recordType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token RECORD117=null;
		Token END119=null;
		ParserRuleReturnScope fieldList118 =null;

		CommonTree RECORD117_tree=null;
		CommonTree END119_tree=null;

		try {
			// .\\antlr\\pascal.g:443:5: ( RECORD ^ fieldList END !)
			// .\\antlr\\pascal.g:443:7: RECORD ^ fieldList END !
			{
			root_0 = (CommonTree)adaptor.nil();


			RECORD117=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1619); 
			RECORD117_tree = (CommonTree)adaptor.create(RECORD117);
			root_0 = (CommonTree)adaptor.becomeRoot(RECORD117_tree, root_0);

			pushFollow(FOLLOW_fieldList_in_recordType1622);
			fieldList118=fieldList();
			state._fsp--;

			adaptor.addChild(root_0, fieldList118.getTree());

			END119=(Token)match(input,END,FOLLOW_END_in_recordType1624); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordType"


	public static class fieldList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fieldList"
	// .\\antlr\\pascal.g:446:1: fieldList : ( fixedPart ( SEMI variantPart | SEMI )? -> ^( FIELDLIST fixedPart variantPart ) | variantPart -> ^( FIELDLIST variantPart ) ) ;
	public final pascalParser.fieldList_return fieldList() throws RecognitionException {
		pascalParser.fieldList_return retval = new pascalParser.fieldList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SEMI121=null;
		Token SEMI123=null;
		ParserRuleReturnScope fixedPart120 =null;
		ParserRuleReturnScope variantPart122 =null;
		ParserRuleReturnScope variantPart124 =null;

		CommonTree SEMI121_tree=null;
		CommonTree SEMI123_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleSubtreeStream stream_variantPart=new RewriteRuleSubtreeStream(adaptor,"rule variantPart");
		RewriteRuleSubtreeStream stream_fixedPart=new RewriteRuleSubtreeStream(adaptor,"rule fixedPart");

		try {
			// .\\antlr\\pascal.g:447:5: ( ( fixedPart ( SEMI variantPart | SEMI )? -> ^( FIELDLIST fixedPart variantPart ) | variantPart -> ^( FIELDLIST variantPart ) ) )
			// .\\antlr\\pascal.g:447:7: ( fixedPart ( SEMI variantPart | SEMI )? -> ^( FIELDLIST fixedPart variantPart ) | variantPart -> ^( FIELDLIST variantPart ) )
			{
			// .\\antlr\\pascal.g:447:7: ( fixedPart ( SEMI variantPart | SEMI )? -> ^( FIELDLIST fixedPart variantPart ) | variantPart -> ^( FIELDLIST variantPart ) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==IDENT) ) {
				alt22=1;
			}
			else if ( (LA22_0==CASE) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// .\\antlr\\pascal.g:447:9: fixedPart ( SEMI variantPart | SEMI )?
					{
					pushFollow(FOLLOW_fixedPart_in_fieldList1644);
					fixedPart120=fixedPart();
					state._fsp--;

					stream_fixedPart.add(fixedPart120.getTree());
					// .\\antlr\\pascal.g:447:19: ( SEMI variantPart | SEMI )?
					int alt21=3;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==SEMI) ) {
						int LA21_1 = input.LA(2);
						if ( (LA21_1==CASE) ) {
							alt21=1;
						}
						else if ( (LA21_1==END||LA21_1==RPAREN) ) {
							alt21=2;
						}
					}
					switch (alt21) {
						case 1 :
							// .\\antlr\\pascal.g:447:21: SEMI variantPart
							{
							SEMI121=(Token)match(input,SEMI,FOLLOW_SEMI_in_fieldList1648);  
							stream_SEMI.add(SEMI121);

							pushFollow(FOLLOW_variantPart_in_fieldList1650);
							variantPart122=variantPart();
							state._fsp--;

							stream_variantPart.add(variantPart122.getTree());
							}
							break;
						case 2 :
							// .\\antlr\\pascal.g:447:40: SEMI
							{
							SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_fieldList1654);  
							stream_SEMI.add(SEMI123);

							}
							break;

					}

					// AST REWRITE
					// elements: fixedPart, variantPart
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 447:48: -> ^( FIELDLIST fixedPart variantPart )
					{
						// .\\antlr\\pascal.g:447:51: ^( FIELDLIST fixedPart variantPart )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELDLIST, "FIELDLIST"), root_1);
						adaptor.addChild(root_1, stream_fixedPart.nextTree());
						adaptor.addChild(root_1, stream_variantPart.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:448:9: variantPart
					{
					pushFollow(FOLLOW_variantPart_in_fieldList1677);
					variantPart124=variantPart();
					state._fsp--;

					stream_variantPart.add(variantPart124.getTree());
					// AST REWRITE
					// elements: variantPart
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 448:22: -> ^( FIELDLIST variantPart )
					{
						// .\\antlr\\pascal.g:448:25: ^( FIELDLIST variantPart )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELDLIST, "FIELDLIST"), root_1);
						adaptor.addChild(root_1, stream_variantPart.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldList"


	public static class fixedPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fixedPart"
	// .\\antlr\\pascal.g:453:1: fixedPart : recordSection ( SEMI ! recordSection )* ;
	public final pascalParser.fixedPart_return fixedPart() throws RecognitionException {
		pascalParser.fixedPart_return retval = new pascalParser.fixedPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SEMI126=null;
		ParserRuleReturnScope recordSection125 =null;
		ParserRuleReturnScope recordSection127 =null;

		CommonTree SEMI126_tree=null;

		try {
			// .\\antlr\\pascal.g:454:5: ( recordSection ( SEMI ! recordSection )* )
			// .\\antlr\\pascal.g:454:7: recordSection ( SEMI ! recordSection )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_recordSection_in_fixedPart1716);
			recordSection125=recordSection();
			state._fsp--;

			adaptor.addChild(root_0, recordSection125.getTree());

			// .\\antlr\\pascal.g:454:21: ( SEMI ! recordSection )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==SEMI) ) {
					int LA23_1 = input.LA(2);
					if ( (LA23_1==IDENT) ) {
						alt23=1;
					}

				}

				switch (alt23) {
				case 1 :
					// .\\antlr\\pascal.g:454:23: SEMI ! recordSection
					{
					SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_fixedPart1720); 
					pushFollow(FOLLOW_recordSection_in_fixedPart1723);
					recordSection127=recordSection();
					state._fsp--;

					adaptor.addChild(root_0, recordSection127.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fixedPart"


	public static class recordSection_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "recordSection"
	// .\\antlr\\pascal.g:457:1: recordSection : identifierList COLON type -> ^( FIELD identifierList type ) ;
	public final pascalParser.recordSection_return recordSection() throws RecognitionException {
		pascalParser.recordSection_return retval = new pascalParser.recordSection_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON129=null;
		ParserRuleReturnScope identifierList128 =null;
		ParserRuleReturnScope type130 =null;

		CommonTree COLON129_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// .\\antlr\\pascal.g:458:5: ( identifierList COLON type -> ^( FIELD identifierList type ) )
			// .\\antlr\\pascal.g:458:7: identifierList COLON type
			{
			pushFollow(FOLLOW_identifierList_in_recordSection1743);
			identifierList128=identifierList();
			state._fsp--;

			stream_identifierList.add(identifierList128.getTree());
			COLON129=(Token)match(input,COLON,FOLLOW_COLON_in_recordSection1745);  
			stream_COLON.add(COLON129);

			pushFollow(FOLLOW_type_in_recordSection1747);
			type130=type();
			state._fsp--;

			stream_type.add(type130.getTree());
			// AST REWRITE
			// elements: type, identifierList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 458:33: -> ^( FIELD identifierList type )
			{
				// .\\antlr\\pascal.g:458:36: ^( FIELD identifierList type )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD, "FIELD"), root_1);
				adaptor.addChild(root_1, stream_identifierList.nextTree());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordSection"


	public static class variantPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variantPart"
	// .\\antlr\\pascal.g:462:1: variantPart : CASE ^ tag OF ! variant ( SEMI ! variant | SEMI !)* ;
	public final pascalParser.variantPart_return variantPart() throws RecognitionException {
		pascalParser.variantPart_return retval = new pascalParser.variantPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CASE131=null;
		Token OF133=null;
		Token SEMI135=null;
		Token SEMI137=null;
		ParserRuleReturnScope tag132 =null;
		ParserRuleReturnScope variant134 =null;
		ParserRuleReturnScope variant136 =null;

		CommonTree CASE131_tree=null;
		CommonTree OF133_tree=null;
		CommonTree SEMI135_tree=null;
		CommonTree SEMI137_tree=null;

		try {
			// .\\antlr\\pascal.g:463:5: ( CASE ^ tag OF ! variant ( SEMI ! variant | SEMI !)* )
			// .\\antlr\\pascal.g:463:7: CASE ^ tag OF ! variant ( SEMI ! variant | SEMI !)*
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE131=(Token)match(input,CASE,FOLLOW_CASE_in_variantPart1775); 
			CASE131_tree = (CommonTree)adaptor.create(CASE131);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE131_tree, root_0);

			pushFollow(FOLLOW_tag_in_variantPart1778);
			tag132=tag();
			state._fsp--;

			adaptor.addChild(root_0, tag132.getTree());

			OF133=(Token)match(input,OF,FOLLOW_OF_in_variantPart1780); 
			pushFollow(FOLLOW_variant_in_variantPart1783);
			variant134=variant();
			state._fsp--;

			adaptor.addChild(root_0, variant134.getTree());

			// .\\antlr\\pascal.g:463:29: ( SEMI ! variant | SEMI !)*
			loop24:
			while (true) {
				int alt24=3;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==SEMI) ) {
					int LA24_3 = input.LA(2);
					if ( (LA24_3==CHR||LA24_3==IDENT||LA24_3==MINUS||(LA24_3 >= NUM_INT && LA24_3 <= NUM_REAL)||LA24_3==PLUS||LA24_3==STRING_LITERAL) ) {
						alt24=1;
					}
					else if ( (LA24_3==END||LA24_3==RPAREN||LA24_3==SEMI) ) {
						alt24=2;
					}

				}

				switch (alt24) {
				case 1 :
					// .\\antlr\\pascal.g:463:31: SEMI ! variant
					{
					SEMI135=(Token)match(input,SEMI,FOLLOW_SEMI_in_variantPart1787); 
					pushFollow(FOLLOW_variant_in_variantPart1790);
					variant136=variant();
					state._fsp--;

					adaptor.addChild(root_0, variant136.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:463:47: SEMI !
					{
					SEMI137=(Token)match(input,SEMI,FOLLOW_SEMI_in_variantPart1794); 
					}
					break;

				default :
					break loop24;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variantPart"


	public static class tag_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tag"
	// .\\antlr\\pascal.g:466:1: tag : (id= identifier COLON t= typeIdentifier -> ^( VARIANT_TAG $id $t) |t2= typeIdentifier -> ^( VARIANT_TAG_NO_ID $t2) );
	public final pascalParser.tag_return tag() throws RecognitionException {
		pascalParser.tag_return retval = new pascalParser.tag_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON138=null;
		ParserRuleReturnScope id =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope t2 =null;

		CommonTree COLON138_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");

		try {
			// .\\antlr\\pascal.g:467:5: (id= identifier COLON t= typeIdentifier -> ^( VARIANT_TAG $id $t) |t2= typeIdentifier -> ^( VARIANT_TAG_NO_ID $t2) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==IDENT) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==COLON) ) {
					alt25=1;
				}
				else if ( (LA25_1==OF) ) {
					alt25=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA25_0==BOOLEAN||LA25_0==CHAR||LA25_0==INTEGER||LA25_0==REAL||LA25_0==STRING) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// .\\antlr\\pascal.g:467:7: id= identifier COLON t= typeIdentifier
					{
					pushFollow(FOLLOW_identifier_in_tag1818);
					id=identifier();
					state._fsp--;

					stream_identifier.add(id.getTree());
					COLON138=(Token)match(input,COLON,FOLLOW_COLON_in_tag1820);  
					stream_COLON.add(COLON138);

					pushFollow(FOLLOW_typeIdentifier_in_tag1824);
					t=typeIdentifier();
					state._fsp--;

					stream_typeIdentifier.add(t.getTree());
					// AST REWRITE
					// elements: id, t
					// token labels: 
					// rule labels: t, id, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 467:44: -> ^( VARIANT_TAG $id $t)
					{
						// .\\antlr\\pascal.g:467:47: ^( VARIANT_TAG $id $t)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIANT_TAG, "VARIANT_TAG"), root_1);
						adaptor.addChild(root_1, stream_id.nextTree());
						adaptor.addChild(root_1, stream_t.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:468:7: t2= typeIdentifier
					{
					pushFollow(FOLLOW_typeIdentifier_in_tag1847);
					t2=typeIdentifier();
					state._fsp--;

					stream_typeIdentifier.add(t2.getTree());
					// AST REWRITE
					// elements: t2
					// token labels: 
					// rule labels: t2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 468:26: -> ^( VARIANT_TAG_NO_ID $t2)
					{
						// .\\antlr\\pascal.g:468:29: ^( VARIANT_TAG_NO_ID $t2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIANT_TAG_NO_ID, "VARIANT_TAG_NO_ID"), root_1);
						adaptor.addChild(root_1, stream_t2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tag"


	public static class variant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variant"
	// .\\antlr\\pascal.g:471:1: variant : constList c= COLON ^ LPAREN ! fieldList RPAREN !;
	public final pascalParser.variant_return variant() throws RecognitionException {
		pascalParser.variant_return retval = new pascalParser.variant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token c=null;
		Token LPAREN140=null;
		Token RPAREN142=null;
		ParserRuleReturnScope constList139 =null;
		ParserRuleReturnScope fieldList141 =null;

		CommonTree c_tree=null;
		CommonTree LPAREN140_tree=null;
		CommonTree RPAREN142_tree=null;

		try {
			// .\\antlr\\pascal.g:472:5: ( constList c= COLON ^ LPAREN ! fieldList RPAREN !)
			// .\\antlr\\pascal.g:472:7: constList c= COLON ^ LPAREN ! fieldList RPAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_constList_in_variant1883);
			constList139=constList();
			state._fsp--;

			adaptor.addChild(root_0, constList139.getTree());

			c=(Token)match(input,COLON,FOLLOW_COLON_in_variant1887); 
			c_tree = (CommonTree)adaptor.create(c);
			root_0 = (CommonTree)adaptor.becomeRoot(c_tree, root_0);

			c.setType(VARIANT_CASE);
			LPAREN140=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_variant1895); 
			pushFollow(FOLLOW_fieldList_in_variant1898);
			fieldList141=fieldList();
			state._fsp--;

			adaptor.addChild(root_0, fieldList141.getTree());

			RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_variant1900); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variant"


	public static class setType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "setType"
	// .\\antlr\\pascal.g:476:1: setType : SET ^ OF ! baseType ;
	public final pascalParser.setType_return setType() throws RecognitionException {
		pascalParser.setType_return retval = new pascalParser.setType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SET143=null;
		Token OF144=null;
		ParserRuleReturnScope baseType145 =null;

		CommonTree SET143_tree=null;
		CommonTree OF144_tree=null;

		try {
			// .\\antlr\\pascal.g:477:5: ( SET ^ OF ! baseType )
			// .\\antlr\\pascal.g:477:7: SET ^ OF ! baseType
			{
			root_0 = (CommonTree)adaptor.nil();


			SET143=(Token)match(input,SET,FOLLOW_SET_in_setType1918); 
			SET143_tree = (CommonTree)adaptor.create(SET143);
			root_0 = (CommonTree)adaptor.becomeRoot(SET143_tree, root_0);

			OF144=(Token)match(input,OF,FOLLOW_OF_in_setType1921); 
			pushFollow(FOLLOW_baseType_in_setType1924);
			baseType145=baseType();
			state._fsp--;

			adaptor.addChild(root_0, baseType145.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setType"


	public static class baseType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "baseType"
	// .\\antlr\\pascal.g:480:1: baseType : simpleType ;
	public final pascalParser.baseType_return baseType() throws RecognitionException {
		pascalParser.baseType_return retval = new pascalParser.baseType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleType146 =null;


		try {
			// .\\antlr\\pascal.g:481:5: ( simpleType )
			// .\\antlr\\pascal.g:481:7: simpleType
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleType_in_baseType1941);
			simpleType146=simpleType();
			state._fsp--;

			adaptor.addChild(root_0, simpleType146.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "baseType"


	public static class fileType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fileType"
	// .\\antlr\\pascal.g:484:1: fileType : ( FILE ^ OF ! type | FILE );
	public final pascalParser.fileType_return fileType() throws RecognitionException {
		pascalParser.fileType_return retval = new pascalParser.fileType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FILE147=null;
		Token OF148=null;
		Token FILE150=null;
		ParserRuleReturnScope type149 =null;

		CommonTree FILE147_tree=null;
		CommonTree OF148_tree=null;
		CommonTree FILE150_tree=null;

		try {
			// .\\antlr\\pascal.g:485:5: ( FILE ^ OF ! type | FILE )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==FILE) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==OF) ) {
					alt26=1;
				}
				else if ( (LA26_1==END||LA26_1==RPAREN||LA26_1==SEMI) ) {
					alt26=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// .\\antlr\\pascal.g:485:7: FILE ^ OF ! type
					{
					root_0 = (CommonTree)adaptor.nil();


					FILE147=(Token)match(input,FILE,FOLLOW_FILE_in_fileType1958); 
					FILE147_tree = (CommonTree)adaptor.create(FILE147);
					root_0 = (CommonTree)adaptor.becomeRoot(FILE147_tree, root_0);

					OF148=(Token)match(input,OF,FOLLOW_OF_in_fileType1961); 
					pushFollow(FOLLOW_type_in_fileType1964);
					type149=type();
					state._fsp--;

					adaptor.addChild(root_0, type149.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:486:7: FILE
					{
					root_0 = (CommonTree)adaptor.nil();


					FILE150=(Token)match(input,FILE,FOLLOW_FILE_in_fileType1972); 
					FILE150_tree = (CommonTree)adaptor.create(FILE150);
					adaptor.addChild(root_0, FILE150_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fileType"


	public static class pointerType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pointerType"
	// .\\antlr\\pascal.g:489:1: pointerType : POINTER ^ typeIdentifier ;
	public final pascalParser.pointerType_return pointerType() throws RecognitionException {
		pascalParser.pointerType_return retval = new pascalParser.pointerType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POINTER151=null;
		ParserRuleReturnScope typeIdentifier152 =null;

		CommonTree POINTER151_tree=null;

		try {
			// .\\antlr\\pascal.g:490:5: ( POINTER ^ typeIdentifier )
			// .\\antlr\\pascal.g:490:7: POINTER ^ typeIdentifier
			{
			root_0 = (CommonTree)adaptor.nil();


			POINTER151=(Token)match(input,POINTER,FOLLOW_POINTER_in_pointerType1989); 
			POINTER151_tree = (CommonTree)adaptor.create(POINTER151);
			root_0 = (CommonTree)adaptor.becomeRoot(POINTER151_tree, root_0);

			pushFollow(FOLLOW_typeIdentifier_in_pointerType1992);
			typeIdentifier152=typeIdentifier();
			state._fsp--;

			adaptor.addChild(root_0, typeIdentifier152.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pointerType"


	public static class variableDeclarationPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationPart"
	// .\\antlr\\pascal.g:494:1: variableDeclarationPart : VAR ^ variableDeclaration ( SEMI ! variableDeclaration )* SEMI !;
	public final pascalParser.variableDeclarationPart_return variableDeclarationPart() throws RecognitionException {
		pascalParser.variableDeclarationPart_return retval = new pascalParser.variableDeclarationPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VAR153=null;
		Token SEMI155=null;
		Token SEMI157=null;
		ParserRuleReturnScope variableDeclaration154 =null;
		ParserRuleReturnScope variableDeclaration156 =null;

		CommonTree VAR153_tree=null;
		CommonTree SEMI155_tree=null;
		CommonTree SEMI157_tree=null;

		try {
			// .\\antlr\\pascal.g:495:5: ( VAR ^ variableDeclaration ( SEMI ! variableDeclaration )* SEMI !)
			// .\\antlr\\pascal.g:495:7: VAR ^ variableDeclaration ( SEMI ! variableDeclaration )* SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			VAR153=(Token)match(input,VAR,FOLLOW_VAR_in_variableDeclarationPart2011); 
			VAR153_tree = (CommonTree)adaptor.create(VAR153);
			root_0 = (CommonTree)adaptor.becomeRoot(VAR153_tree, root_0);

			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationPart2014);
			variableDeclaration154=variableDeclaration();
			state._fsp--;

			adaptor.addChild(root_0, variableDeclaration154.getTree());

			// .\\antlr\\pascal.g:495:32: ( SEMI ! variableDeclaration )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==SEMI) ) {
					int LA27_1 = input.LA(2);
					if ( (LA27_1==IDENT) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// .\\antlr\\pascal.g:495:34: SEMI ! variableDeclaration
					{
					SEMI155=(Token)match(input,SEMI,FOLLOW_SEMI_in_variableDeclarationPart2018); 
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationPart2021);
					variableDeclaration156=variableDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, variableDeclaration156.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			SEMI157=(Token)match(input,SEMI,FOLLOW_SEMI_in_variableDeclarationPart2026); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclarationPart"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// .\\antlr\\pascal.g:498:1: variableDeclaration : identifierList c= COLON ^ type ;
	public final pascalParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		pascalParser.variableDeclaration_return retval = new pascalParser.variableDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token c=null;
		ParserRuleReturnScope identifierList158 =null;
		ParserRuleReturnScope type159 =null;

		CommonTree c_tree=null;

		try {
			// .\\antlr\\pascal.g:499:5: ( identifierList c= COLON ^ type )
			// .\\antlr\\pascal.g:499:7: identifierList c= COLON ^ type
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifierList_in_variableDeclaration2044);
			identifierList158=identifierList();
			state._fsp--;

			adaptor.addChild(root_0, identifierList158.getTree());

			c=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration2048); 
			c_tree = (CommonTree)adaptor.create(c);
			root_0 = (CommonTree)adaptor.becomeRoot(c_tree, root_0);

			c.setType(VARDECL);
			pushFollow(FOLLOW_type_in_variableDeclaration2053);
			type159=type();
			state._fsp--;

			adaptor.addChild(root_0, type159.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class procedureAndFunctionDeclarationPart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedureAndFunctionDeclarationPart"
	// .\\antlr\\pascal.g:502:1: procedureAndFunctionDeclarationPart : procedureOrFunctionDeclaration SEMI !;
	public final pascalParser.procedureAndFunctionDeclarationPart_return procedureAndFunctionDeclarationPart() throws RecognitionException {
		pascalParser.procedureAndFunctionDeclarationPart_return retval = new pascalParser.procedureAndFunctionDeclarationPart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SEMI161=null;
		ParserRuleReturnScope procedureOrFunctionDeclaration160 =null;

		CommonTree SEMI161_tree=null;

		try {
			// .\\antlr\\pascal.g:503:5: ( procedureOrFunctionDeclaration SEMI !)
			// .\\antlr\\pascal.g:503:7: procedureOrFunctionDeclaration SEMI !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_procedureOrFunctionDeclaration_in_procedureAndFunctionDeclarationPart2070);
			procedureOrFunctionDeclaration160=procedureOrFunctionDeclaration();
			state._fsp--;

			adaptor.addChild(root_0, procedureOrFunctionDeclaration160.getTree());

			SEMI161=(Token)match(input,SEMI,FOLLOW_SEMI_in_procedureAndFunctionDeclarationPart2072); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureAndFunctionDeclarationPart"


	public static class procedureOrFunctionDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedureOrFunctionDeclaration"
	// .\\antlr\\pascal.g:506:1: procedureOrFunctionDeclaration : ( procedureDeclaration | functionDeclaration );
	public final pascalParser.procedureOrFunctionDeclaration_return procedureOrFunctionDeclaration() throws RecognitionException {
		pascalParser.procedureOrFunctionDeclaration_return retval = new pascalParser.procedureOrFunctionDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope procedureDeclaration162 =null;
		ParserRuleReturnScope functionDeclaration163 =null;


		try {
			// .\\antlr\\pascal.g:507:5: ( procedureDeclaration | functionDeclaration )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==PROCEDURE) ) {
				alt28=1;
			}
			else if ( (LA28_0==FUNCTION) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// .\\antlr\\pascal.g:507:7: procedureDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procedureDeclaration_in_procedureOrFunctionDeclaration2090);
					procedureDeclaration162=procedureDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, procedureDeclaration162.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:508:7: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_procedureOrFunctionDeclaration2098);
					functionDeclaration163=functionDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, functionDeclaration163.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureOrFunctionDeclaration"


	public static class procedureDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedureDeclaration"
	// .\\antlr\\pascal.g:511:1: procedureDeclaration : PROCEDURE ^ identifier ( formalParameterList )? SEMI ! block ;
	public final pascalParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
		pascalParser.procedureDeclaration_return retval = new pascalParser.procedureDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PROCEDURE164=null;
		Token SEMI167=null;
		ParserRuleReturnScope identifier165 =null;
		ParserRuleReturnScope formalParameterList166 =null;
		ParserRuleReturnScope block168 =null;

		CommonTree PROCEDURE164_tree=null;
		CommonTree SEMI167_tree=null;

		try {
			// .\\antlr\\pascal.g:512:5: ( PROCEDURE ^ identifier ( formalParameterList )? SEMI ! block )
			// .\\antlr\\pascal.g:512:7: PROCEDURE ^ identifier ( formalParameterList )? SEMI ! block
			{
			root_0 = (CommonTree)adaptor.nil();


			PROCEDURE164=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration2115); 
			PROCEDURE164_tree = (CommonTree)adaptor.create(PROCEDURE164);
			root_0 = (CommonTree)adaptor.becomeRoot(PROCEDURE164_tree, root_0);

			pushFollow(FOLLOW_identifier_in_procedureDeclaration2118);
			identifier165=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier165.getTree());

			// .\\antlr\\pascal.g:512:29: ( formalParameterList )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==LPAREN) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// .\\antlr\\pascal.g:512:30: formalParameterList
					{
					pushFollow(FOLLOW_formalParameterList_in_procedureDeclaration2121);
					formalParameterList166=formalParameterList();
					state._fsp--;

					adaptor.addChild(root_0, formalParameterList166.getTree());

					}
					break;

			}

			SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_procedureDeclaration2125); 
			pushFollow(FOLLOW_block_in_procedureDeclaration2134);
			block168=block();
			state._fsp--;

			adaptor.addChild(root_0, block168.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureDeclaration"


	public static class formalParameterList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalParameterList"
	// .\\antlr\\pascal.g:516:1: formalParameterList : LPAREN formalParameterSection ( SEMI formalParameterSection )* RPAREN -> ^( ARGDECLS ( formalParameterSection )+ ) ;
	public final pascalParser.formalParameterList_return formalParameterList() throws RecognitionException {
		pascalParser.formalParameterList_return retval = new pascalParser.formalParameterList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN169=null;
		Token SEMI171=null;
		Token RPAREN173=null;
		ParserRuleReturnScope formalParameterSection170 =null;
		ParserRuleReturnScope formalParameterSection172 =null;

		CommonTree LPAREN169_tree=null;
		CommonTree SEMI171_tree=null;
		CommonTree RPAREN173_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_formalParameterSection=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterSection");

		try {
			// .\\antlr\\pascal.g:517:5: ( LPAREN formalParameterSection ( SEMI formalParameterSection )* RPAREN -> ^( ARGDECLS ( formalParameterSection )+ ) )
			// .\\antlr\\pascal.g:517:7: LPAREN formalParameterSection ( SEMI formalParameterSection )* RPAREN
			{
			LPAREN169=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList2151);  
			stream_LPAREN.add(LPAREN169);

			pushFollow(FOLLOW_formalParameterSection_in_formalParameterList2153);
			formalParameterSection170=formalParameterSection();
			state._fsp--;

			stream_formalParameterSection.add(formalParameterSection170.getTree());
			// .\\antlr\\pascal.g:517:37: ( SEMI formalParameterSection )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==SEMI) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// .\\antlr\\pascal.g:517:39: SEMI formalParameterSection
					{
					SEMI171=(Token)match(input,SEMI,FOLLOW_SEMI_in_formalParameterList2157);  
					stream_SEMI.add(SEMI171);

					pushFollow(FOLLOW_formalParameterSection_in_formalParameterList2159);
					formalParameterSection172=formalParameterSection();
					state._fsp--;

					stream_formalParameterSection.add(formalParameterSection172.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			RPAREN173=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList2164);  
			stream_RPAREN.add(RPAREN173);

			// AST REWRITE
			// elements: formalParameterSection
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 518:8: -> ^( ARGDECLS ( formalParameterSection )+ )
			{
				// .\\antlr\\pascal.g:518:11: ^( ARGDECLS ( formalParameterSection )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGDECLS, "ARGDECLS"), root_1);
				if ( !(stream_formalParameterSection.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_formalParameterSection.hasNext() ) {
					adaptor.addChild(root_1, stream_formalParameterSection.nextTree());
				}
				stream_formalParameterSection.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParameterList"


	public static class formalParameterSection_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalParameterSection"
	// .\\antlr\\pascal.g:522:1: formalParameterSection : ( parameterGroup | VAR ^ parameterGroup | FUNCTION ^ parameterGroup | PROCEDURE ^ parameterGroup );
	public final pascalParser.formalParameterSection_return formalParameterSection() throws RecognitionException {
		pascalParser.formalParameterSection_return retval = new pascalParser.formalParameterSection_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VAR175=null;
		Token FUNCTION177=null;
		Token PROCEDURE179=null;
		ParserRuleReturnScope parameterGroup174 =null;
		ParserRuleReturnScope parameterGroup176 =null;
		ParserRuleReturnScope parameterGroup178 =null;
		ParserRuleReturnScope parameterGroup180 =null;

		CommonTree VAR175_tree=null;
		CommonTree FUNCTION177_tree=null;
		CommonTree PROCEDURE179_tree=null;

		try {
			// .\\antlr\\pascal.g:523:5: ( parameterGroup | VAR ^ parameterGroup | FUNCTION ^ parameterGroup | PROCEDURE ^ parameterGroup )
			int alt31=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt31=1;
				}
				break;
			case VAR:
				{
				alt31=2;
				}
				break;
			case FUNCTION:
				{
				alt31=3;
				}
				break;
			case PROCEDURE:
				{
				alt31=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// .\\antlr\\pascal.g:523:7: parameterGroup
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_parameterGroup_in_formalParameterSection2200);
					parameterGroup174=parameterGroup();
					state._fsp--;

					adaptor.addChild(root_0, parameterGroup174.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:524:7: VAR ^ parameterGroup
					{
					root_0 = (CommonTree)adaptor.nil();


					VAR175=(Token)match(input,VAR,FOLLOW_VAR_in_formalParameterSection2208); 
					VAR175_tree = (CommonTree)adaptor.create(VAR175);
					root_0 = (CommonTree)adaptor.becomeRoot(VAR175_tree, root_0);

					pushFollow(FOLLOW_parameterGroup_in_formalParameterSection2211);
					parameterGroup176=parameterGroup();
					state._fsp--;

					adaptor.addChild(root_0, parameterGroup176.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:525:7: FUNCTION ^ parameterGroup
					{
					root_0 = (CommonTree)adaptor.nil();


					FUNCTION177=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_formalParameterSection2219); 
					FUNCTION177_tree = (CommonTree)adaptor.create(FUNCTION177);
					root_0 = (CommonTree)adaptor.becomeRoot(FUNCTION177_tree, root_0);

					pushFollow(FOLLOW_parameterGroup_in_formalParameterSection2222);
					parameterGroup178=parameterGroup();
					state._fsp--;

					adaptor.addChild(root_0, parameterGroup178.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:526:7: PROCEDURE ^ parameterGroup
					{
					root_0 = (CommonTree)adaptor.nil();


					PROCEDURE179=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_formalParameterSection2230); 
					PROCEDURE179_tree = (CommonTree)adaptor.create(PROCEDURE179);
					root_0 = (CommonTree)adaptor.becomeRoot(PROCEDURE179_tree, root_0);

					pushFollow(FOLLOW_parameterGroup_in_formalParameterSection2233);
					parameterGroup180=parameterGroup();
					state._fsp--;

					adaptor.addChild(root_0, parameterGroup180.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParameterSection"


	public static class parameterGroup_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameterGroup"
	// .\\antlr\\pascal.g:529:1: parameterGroup : ids= identifierList COLON t= typeIdentifier -> ^( ARGDECL $ids $t) ;
	public final pascalParser.parameterGroup_return parameterGroup() throws RecognitionException {
		pascalParser.parameterGroup_return retval = new pascalParser.parameterGroup_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON181=null;
		ParserRuleReturnScope ids =null;
		ParserRuleReturnScope t =null;

		CommonTree COLON181_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
		RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");

		try {
			// .\\antlr\\pascal.g:530:5: (ids= identifierList COLON t= typeIdentifier -> ^( ARGDECL $ids $t) )
			// .\\antlr\\pascal.g:530:7: ids= identifierList COLON t= typeIdentifier
			{
			pushFollow(FOLLOW_identifierList_in_parameterGroup2253);
			ids=identifierList();
			state._fsp--;

			stream_identifierList.add(ids.getTree());
			COLON181=(Token)match(input,COLON,FOLLOW_COLON_in_parameterGroup2255);  
			stream_COLON.add(COLON181);

			pushFollow(FOLLOW_typeIdentifier_in_parameterGroup2259);
			t=typeIdentifier();
			state._fsp--;

			stream_typeIdentifier.add(t.getTree());
			// AST REWRITE
			// elements: ids, t
			// token labels: 
			// rule labels: t, ids, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_ids=new RewriteRuleSubtreeStream(adaptor,"rule ids",ids!=null?ids.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 530:49: -> ^( ARGDECL $ids $t)
			{
				// .\\antlr\\pascal.g:530:52: ^( ARGDECL $ids $t)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGDECL, "ARGDECL"), root_1);
				adaptor.addChild(root_1, stream_ids.nextTree());
				adaptor.addChild(root_1, stream_t.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameterGroup"


	public static class identifierList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifierList"
	// .\\antlr\\pascal.g:534:1: identifierList : identifier ( COMMA identifier )* -> ^( IDLIST ( identifier )+ ) ;
	public final pascalParser.identifierList_return identifierList() throws RecognitionException {
		pascalParser.identifierList_return retval = new pascalParser.identifierList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA183=null;
		ParserRuleReturnScope identifier182 =null;
		ParserRuleReturnScope identifier184 =null;

		CommonTree COMMA183_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// .\\antlr\\pascal.g:535:5: ( identifier ( COMMA identifier )* -> ^( IDLIST ( identifier )+ ) )
			// .\\antlr\\pascal.g:535:7: identifier ( COMMA identifier )*
			{
			pushFollow(FOLLOW_identifier_in_identifierList2290);
			identifier182=identifier();
			state._fsp--;

			stream_identifier.add(identifier182.getTree());
			// .\\antlr\\pascal.g:535:18: ( COMMA identifier )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==COMMA) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// .\\antlr\\pascal.g:535:20: COMMA identifier
					{
					COMMA183=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifierList2294);  
					stream_COMMA.add(COMMA183);

					pushFollow(FOLLOW_identifier_in_identifierList2296);
					identifier184=identifier();
					state._fsp--;

					stream_identifier.add(identifier184.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 535:40: -> ^( IDLIST ( identifier )+ )
			{
				// .\\antlr\\pascal.g:535:43: ^( IDLIST ( identifier )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDLIST, "IDLIST"), root_1);
				if ( !(stream_identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifierList"


	public static class constList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constList"
	// .\\antlr\\pascal.g:539:1: constList : constant ( COMMA constant )* -> ^( CONSTLIST ( constant )+ ) ;
	public final pascalParser.constList_return constList() throws RecognitionException {
		pascalParser.constList_return retval = new pascalParser.constList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA186=null;
		ParserRuleReturnScope constant185 =null;
		ParserRuleReturnScope constant187 =null;

		CommonTree COMMA186_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// .\\antlr\\pascal.g:540:5: ( constant ( COMMA constant )* -> ^( CONSTLIST ( constant )+ ) )
			// .\\antlr\\pascal.g:540:7: constant ( COMMA constant )*
			{
			pushFollow(FOLLOW_constant_in_constList2327);
			constant185=constant();
			state._fsp--;

			stream_constant.add(constant185.getTree());
			// .\\antlr\\pascal.g:540:16: ( COMMA constant )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// .\\antlr\\pascal.g:540:18: COMMA constant
					{
					COMMA186=(Token)match(input,COMMA,FOLLOW_COMMA_in_constList2331);  
					stream_COMMA.add(COMMA186);

					pushFollow(FOLLOW_constant_in_constList2333);
					constant187=constant();
					state._fsp--;

					stream_constant.add(constant187.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			// AST REWRITE
			// elements: constant
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 540:36: -> ^( CONSTLIST ( constant )+ )
			{
				// .\\antlr\\pascal.g:540:39: ^( CONSTLIST ( constant )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSTLIST, "CONSTLIST"), root_1);
				if ( !(stream_constant.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_constant.hasNext() ) {
					adaptor.addChild(root_1, stream_constant.nextTree());
				}
				stream_constant.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constList"


	public static class functionDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionDeclaration"
	// .\\antlr\\pascal.g:544:1: functionDeclaration : FUNCTION ^ identifier ( formalParameterList )? COLON ! resultType SEMI ! block ;
	public final pascalParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		pascalParser.functionDeclaration_return retval = new pascalParser.functionDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUNCTION188=null;
		Token COLON191=null;
		Token SEMI193=null;
		ParserRuleReturnScope identifier189 =null;
		ParserRuleReturnScope formalParameterList190 =null;
		ParserRuleReturnScope resultType192 =null;
		ParserRuleReturnScope block194 =null;

		CommonTree FUNCTION188_tree=null;
		CommonTree COLON191_tree=null;
		CommonTree SEMI193_tree=null;

		try {
			// .\\antlr\\pascal.g:545:5: ( FUNCTION ^ identifier ( formalParameterList )? COLON ! resultType SEMI ! block )
			// .\\antlr\\pascal.g:545:7: FUNCTION ^ identifier ( formalParameterList )? COLON ! resultType SEMI ! block
			{
			root_0 = (CommonTree)adaptor.nil();


			FUNCTION188=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration2364); 
			FUNCTION188_tree = (CommonTree)adaptor.create(FUNCTION188);
			root_0 = (CommonTree)adaptor.becomeRoot(FUNCTION188_tree, root_0);

			pushFollow(FOLLOW_identifier_in_functionDeclaration2367);
			identifier189=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier189.getTree());

			// .\\antlr\\pascal.g:545:28: ( formalParameterList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==LPAREN) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// .\\antlr\\pascal.g:545:29: formalParameterList
					{
					pushFollow(FOLLOW_formalParameterList_in_functionDeclaration2370);
					formalParameterList190=formalParameterList();
					state._fsp--;

					adaptor.addChild(root_0, formalParameterList190.getTree());

					}
					break;

			}

			COLON191=(Token)match(input,COLON,FOLLOW_COLON_in_functionDeclaration2374); 
			pushFollow(FOLLOW_resultType_in_functionDeclaration2377);
			resultType192=resultType();
			state._fsp--;

			adaptor.addChild(root_0, resultType192.getTree());

			SEMI193=(Token)match(input,SEMI,FOLLOW_SEMI_in_functionDeclaration2379); 
			pushFollow(FOLLOW_block_in_functionDeclaration2388);
			block194=block();
			state._fsp--;

			adaptor.addChild(root_0, block194.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionDeclaration"


	public static class resultType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "resultType"
	// .\\antlr\\pascal.g:549:1: resultType : typeIdentifier ;
	public final pascalParser.resultType_return resultType() throws RecognitionException {
		pascalParser.resultType_return retval = new pascalParser.resultType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope typeIdentifier195 =null;


		try {
			// .\\antlr\\pascal.g:550:5: ( typeIdentifier )
			// .\\antlr\\pascal.g:550:7: typeIdentifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_typeIdentifier_in_resultType2405);
			typeIdentifier195=typeIdentifier();
			state._fsp--;

			adaptor.addChild(root_0, typeIdentifier195.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "resultType"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// .\\antlr\\pascal.g:553:1: statement : ( label COLON ^ unlabelledStatement | unlabelledStatement );
	public final pascalParser.statement_return statement() throws RecognitionException {
		pascalParser.statement_return retval = new pascalParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON197=null;
		ParserRuleReturnScope label196 =null;
		ParserRuleReturnScope unlabelledStatement198 =null;
		ParserRuleReturnScope unlabelledStatement199 =null;

		CommonTree COLON197_tree=null;

		try {
			// .\\antlr\\pascal.g:554:5: ( label COLON ^ unlabelledStatement | unlabelledStatement )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==NUM_INT) ) {
				alt35=1;
			}
			else if ( ((LA35_0 >= AT && LA35_0 <= BEGIN)||LA35_0==CASE||(LA35_0 >= ELSE && LA35_0 <= END)||LA35_0==FOR||LA35_0==GOTO||LA35_0==IDENT||LA35_0==IF||LA35_0==REPEAT||LA35_0==SEMI||LA35_0==UNTIL||(LA35_0 >= WHILE && LA35_0 <= WITH)) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// .\\antlr\\pascal.g:554:7: label COLON ^ unlabelledStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_statement2422);
					label196=label();
					state._fsp--;

					adaptor.addChild(root_0, label196.getTree());

					COLON197=(Token)match(input,COLON,FOLLOW_COLON_in_statement2424); 
					COLON197_tree = (CommonTree)adaptor.create(COLON197);
					root_0 = (CommonTree)adaptor.becomeRoot(COLON197_tree, root_0);

					pushFollow(FOLLOW_unlabelledStatement_in_statement2427);
					unlabelledStatement198=unlabelledStatement();
					state._fsp--;

					adaptor.addChild(root_0, unlabelledStatement198.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:555:7: unlabelledStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unlabelledStatement_in_statement2435);
					unlabelledStatement199=unlabelledStatement();
					state._fsp--;

					adaptor.addChild(root_0, unlabelledStatement199.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class unlabelledStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unlabelledStatement"
	// .\\antlr\\pascal.g:558:1: unlabelledStatement : ( simpleStatement | structuredStatement );
	public final pascalParser.unlabelledStatement_return unlabelledStatement() throws RecognitionException {
		pascalParser.unlabelledStatement_return retval = new pascalParser.unlabelledStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleStatement200 =null;
		ParserRuleReturnScope structuredStatement201 =null;


		try {
			// .\\antlr\\pascal.g:559:5: ( simpleStatement | structuredStatement )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==AT||(LA36_0 >= ELSE && LA36_0 <= END)||LA36_0==GOTO||LA36_0==IDENT||LA36_0==SEMI||LA36_0==UNTIL) ) {
				alt36=1;
			}
			else if ( (LA36_0==BEGIN||LA36_0==CASE||LA36_0==FOR||LA36_0==IF||LA36_0==REPEAT||(LA36_0 >= WHILE && LA36_0 <= WITH)) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// .\\antlr\\pascal.g:559:7: simpleStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleStatement_in_unlabelledStatement2452);
					simpleStatement200=simpleStatement();
					state._fsp--;

					adaptor.addChild(root_0, simpleStatement200.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:560:7: structuredStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_structuredStatement_in_unlabelledStatement2460);
					structuredStatement201=structuredStatement();
					state._fsp--;

					adaptor.addChild(root_0, structuredStatement201.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unlabelledStatement"


	public static class simpleStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleStatement"
	// .\\antlr\\pascal.g:563:1: simpleStatement : ( assignmentStatement | procedureStatement | gotoStatement | emptyStatement );
	public final pascalParser.simpleStatement_return simpleStatement() throws RecognitionException {
		pascalParser.simpleStatement_return retval = new pascalParser.simpleStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope assignmentStatement202 =null;
		ParserRuleReturnScope procedureStatement203 =null;
		ParserRuleReturnScope gotoStatement204 =null;
		ParserRuleReturnScope emptyStatement205 =null;


		try {
			// .\\antlr\\pascal.g:564:5: ( assignmentStatement | procedureStatement | gotoStatement | emptyStatement )
			int alt37=4;
			switch ( input.LA(1) ) {
			case AT:
				{
				alt37=1;
				}
				break;
			case IDENT:
				{
				int LA37_2 = input.LA(2);
				if ( (LA37_2==ASSIGN||LA37_2==DOT||(LA37_2 >= LBRACK && LA37_2 <= LBRACK2)||LA37_2==POINTER) ) {
					alt37=1;
				}
				else if ( ((LA37_2 >= ELSE && LA37_2 <= END)||LA37_2==LPAREN||LA37_2==SEMI||LA37_2==UNTIL) ) {
					alt37=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case GOTO:
				{
				alt37=3;
				}
				break;
			case ELSE:
			case END:
			case SEMI:
			case UNTIL:
				{
				alt37=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// .\\antlr\\pascal.g:564:7: assignmentStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignmentStatement_in_simpleStatement2477);
					assignmentStatement202=assignmentStatement();
					state._fsp--;

					adaptor.addChild(root_0, assignmentStatement202.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:565:7: procedureStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procedureStatement_in_simpleStatement2485);
					procedureStatement203=procedureStatement();
					state._fsp--;

					adaptor.addChild(root_0, procedureStatement203.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:566:7: gotoStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotoStatement_in_simpleStatement2493);
					gotoStatement204=gotoStatement();
					state._fsp--;

					adaptor.addChild(root_0, gotoStatement204.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:567:7: emptyStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_emptyStatement_in_simpleStatement2501);
					emptyStatement205=emptyStatement();
					state._fsp--;

					adaptor.addChild(root_0, emptyStatement205.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleStatement"


	public static class assignmentStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignmentStatement"
	// .\\antlr\\pascal.g:570:1: assignmentStatement : variable ASSIGN ^ expression ;
	public final pascalParser.assignmentStatement_return assignmentStatement() throws RecognitionException {
		pascalParser.assignmentStatement_return retval = new pascalParser.assignmentStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASSIGN207=null;
		ParserRuleReturnScope variable206 =null;
		ParserRuleReturnScope expression208 =null;

		CommonTree ASSIGN207_tree=null;

		try {
			// .\\antlr\\pascal.g:571:5: ( variable ASSIGN ^ expression )
			// .\\antlr\\pascal.g:571:7: variable ASSIGN ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variable_in_assignmentStatement2518);
			variable206=variable();
			state._fsp--;

			adaptor.addChild(root_0, variable206.getTree());

			ASSIGN207=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentStatement2520); 
			ASSIGN207_tree = (CommonTree)adaptor.create(ASSIGN207);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN207_tree, root_0);

			pushFollow(FOLLOW_expression_in_assignmentStatement2523);
			expression208=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression208.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentStatement"


	public static class variable_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// .\\antlr\\pascal.g:589:1: variable : ( AT ^ identifier | identifier ) ( LBRACK ^ expression ( COMMA ! expression )* RBRACK !| LBRACK2 ^ expression ( COMMA ! expression )* RBRACK2 !| DOT ^ identifier | POINTER ^)* ;
	public final pascalParser.variable_return variable() throws RecognitionException {
		pascalParser.variable_return retval = new pascalParser.variable_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AT209=null;
		Token LBRACK212=null;
		Token COMMA214=null;
		Token RBRACK216=null;
		Token LBRACK2217=null;
		Token COMMA219=null;
		Token RBRACK2221=null;
		Token DOT222=null;
		Token POINTER224=null;
		ParserRuleReturnScope identifier210 =null;
		ParserRuleReturnScope identifier211 =null;
		ParserRuleReturnScope expression213 =null;
		ParserRuleReturnScope expression215 =null;
		ParserRuleReturnScope expression218 =null;
		ParserRuleReturnScope expression220 =null;
		ParserRuleReturnScope identifier223 =null;

		CommonTree AT209_tree=null;
		CommonTree LBRACK212_tree=null;
		CommonTree COMMA214_tree=null;
		CommonTree RBRACK216_tree=null;
		CommonTree LBRACK2217_tree=null;
		CommonTree COMMA219_tree=null;
		CommonTree RBRACK2221_tree=null;
		CommonTree DOT222_tree=null;
		CommonTree POINTER224_tree=null;

		try {
			// .\\antlr\\pascal.g:590:5: ( ( AT ^ identifier | identifier ) ( LBRACK ^ expression ( COMMA ! expression )* RBRACK !| LBRACK2 ^ expression ( COMMA ! expression )* RBRACK2 !| DOT ^ identifier | POINTER ^)* )
			// .\\antlr\\pascal.g:590:7: ( AT ^ identifier | identifier ) ( LBRACK ^ expression ( COMMA ! expression )* RBRACK !| LBRACK2 ^ expression ( COMMA ! expression )* RBRACK2 !| DOT ^ identifier | POINTER ^)*
			{
			root_0 = (CommonTree)adaptor.nil();


			// .\\antlr\\pascal.g:590:7: ( AT ^ identifier | identifier )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==AT) ) {
				alt38=1;
			}
			else if ( (LA38_0==IDENT) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// .\\antlr\\pascal.g:590:9: AT ^ identifier
					{
					AT209=(Token)match(input,AT,FOLLOW_AT_in_variable2544); 
					AT209_tree = (CommonTree)adaptor.create(AT209);
					root_0 = (CommonTree)adaptor.becomeRoot(AT209_tree, root_0);

					pushFollow(FOLLOW_identifier_in_variable2547);
					identifier210=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier210.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:591:9: identifier
					{
					pushFollow(FOLLOW_identifier_in_variable2558);
					identifier211=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier211.getTree());

					}
					break;

			}

			// .\\antlr\\pascal.g:593:7: ( LBRACK ^ expression ( COMMA ! expression )* RBRACK !| LBRACK2 ^ expression ( COMMA ! expression )* RBRACK2 !| DOT ^ identifier | POINTER ^)*
			loop41:
			while (true) {
				int alt41=5;
				switch ( input.LA(1) ) {
				case LBRACK:
					{
					alt41=1;
					}
					break;
				case LBRACK2:
					{
					alt41=2;
					}
					break;
				case DOT:
					{
					alt41=3;
					}
					break;
				case POINTER:
					{
					alt41=4;
					}
					break;
				}
				switch (alt41) {
				case 1 :
					// .\\antlr\\pascal.g:593:9: LBRACK ^ expression ( COMMA ! expression )* RBRACK !
					{
					LBRACK212=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_variable2576); 
					LBRACK212_tree = (CommonTree)adaptor.create(LBRACK212);
					root_0 = (CommonTree)adaptor.becomeRoot(LBRACK212_tree, root_0);

					pushFollow(FOLLOW_expression_in_variable2579);
					expression213=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression213.getTree());

					// .\\antlr\\pascal.g:593:28: ( COMMA ! expression )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==COMMA) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// .\\antlr\\pascal.g:593:30: COMMA ! expression
							{
							COMMA214=(Token)match(input,COMMA,FOLLOW_COMMA_in_variable2583); 
							pushFollow(FOLLOW_expression_in_variable2586);
							expression215=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression215.getTree());

							}
							break;

						default :
							break loop39;
						}
					}

					RBRACK216=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_variable2590); 
					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:594:9: LBRACK2 ^ expression ( COMMA ! expression )* RBRACK2 !
					{
					LBRACK2217=(Token)match(input,LBRACK2,FOLLOW_LBRACK2_in_variable2601); 
					LBRACK2217_tree = (CommonTree)adaptor.create(LBRACK2217);
					root_0 = (CommonTree)adaptor.becomeRoot(LBRACK2217_tree, root_0);

					pushFollow(FOLLOW_expression_in_variable2604);
					expression218=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression218.getTree());

					// .\\antlr\\pascal.g:594:29: ( COMMA ! expression )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==COMMA) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// .\\antlr\\pascal.g:594:31: COMMA ! expression
							{
							COMMA219=(Token)match(input,COMMA,FOLLOW_COMMA_in_variable2608); 
							pushFollow(FOLLOW_expression_in_variable2611);
							expression220=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression220.getTree());

							}
							break;

						default :
							break loop40;
						}
					}

					RBRACK2221=(Token)match(input,RBRACK2,FOLLOW_RBRACK2_in_variable2615); 
					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:595:9: DOT ^ identifier
					{
					DOT222=(Token)match(input,DOT,FOLLOW_DOT_in_variable2626); 
					DOT222_tree = (CommonTree)adaptor.create(DOT222);
					root_0 = (CommonTree)adaptor.becomeRoot(DOT222_tree, root_0);

					pushFollow(FOLLOW_identifier_in_variable2629);
					identifier223=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier223.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:596:9: POINTER ^
					{
					POINTER224=(Token)match(input,POINTER,FOLLOW_POINTER_in_variable2639); 
					POINTER224_tree = (CommonTree)adaptor.create(POINTER224);
					root_0 = (CommonTree)adaptor.becomeRoot(POINTER224_tree, root_0);

					}
					break;

				default :
					break loop41;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// .\\antlr\\pascal.g:600:1: expression : simpleExpression ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^| IN ^) simpleExpression )* ;
	public final pascalParser.expression_return expression() throws RecognitionException {
		pascalParser.expression_return retval = new pascalParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL226=null;
		Token NOT_EQUAL227=null;
		Token LT228=null;
		Token LE229=null;
		Token GE230=null;
		Token GT231=null;
		Token IN232=null;
		ParserRuleReturnScope simpleExpression225 =null;
		ParserRuleReturnScope simpleExpression233 =null;

		CommonTree EQUAL226_tree=null;
		CommonTree NOT_EQUAL227_tree=null;
		CommonTree LT228_tree=null;
		CommonTree LE229_tree=null;
		CommonTree GE230_tree=null;
		CommonTree GT231_tree=null;
		CommonTree IN232_tree=null;

		try {
			// .\\antlr\\pascal.g:601:5: ( simpleExpression ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^| IN ^) simpleExpression )* )
			// .\\antlr\\pascal.g:601:7: simpleExpression ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^| IN ^) simpleExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleExpression_in_expression2666);
			simpleExpression225=simpleExpression();
			state._fsp--;

			adaptor.addChild(root_0, simpleExpression225.getTree());

			// .\\antlr\\pascal.g:602:4: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^| IN ^) simpleExpression )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==EQUAL||LA43_0==GE||LA43_0==GT||LA43_0==IN||LA43_0==LE||LA43_0==LT||LA43_0==NOT_EQUAL) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// .\\antlr\\pascal.g:602:6: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^| IN ^) simpleExpression
					{
					// .\\antlr\\pascal.g:602:6: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^| IN ^)
					int alt42=7;
					switch ( input.LA(1) ) {
					case EQUAL:
						{
						alt42=1;
						}
						break;
					case NOT_EQUAL:
						{
						alt42=2;
						}
						break;
					case LT:
						{
						alt42=3;
						}
						break;
					case LE:
						{
						alt42=4;
						}
						break;
					case GE:
						{
						alt42=5;
						}
						break;
					case GT:
						{
						alt42=6;
						}
						break;
					case IN:
						{
						alt42=7;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}
					switch (alt42) {
						case 1 :
							// .\\antlr\\pascal.g:602:7: EQUAL ^
							{
							EQUAL226=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_expression2674); 
							EQUAL226_tree = (CommonTree)adaptor.create(EQUAL226);
							root_0 = (CommonTree)adaptor.becomeRoot(EQUAL226_tree, root_0);

							}
							break;
						case 2 :
							// .\\antlr\\pascal.g:602:16: NOT_EQUAL ^
							{
							NOT_EQUAL227=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expression2679); 
							NOT_EQUAL227_tree = (CommonTree)adaptor.create(NOT_EQUAL227);
							root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL227_tree, root_0);

							}
							break;
						case 3 :
							// .\\antlr\\pascal.g:602:29: LT ^
							{
							LT228=(Token)match(input,LT,FOLLOW_LT_in_expression2684); 
							LT228_tree = (CommonTree)adaptor.create(LT228);
							root_0 = (CommonTree)adaptor.becomeRoot(LT228_tree, root_0);

							}
							break;
						case 4 :
							// .\\antlr\\pascal.g:602:35: LE ^
							{
							LE229=(Token)match(input,LE,FOLLOW_LE_in_expression2689); 
							LE229_tree = (CommonTree)adaptor.create(LE229);
							root_0 = (CommonTree)adaptor.becomeRoot(LE229_tree, root_0);

							}
							break;
						case 5 :
							// .\\antlr\\pascal.g:602:41: GE ^
							{
							GE230=(Token)match(input,GE,FOLLOW_GE_in_expression2694); 
							GE230_tree = (CommonTree)adaptor.create(GE230);
							root_0 = (CommonTree)adaptor.becomeRoot(GE230_tree, root_0);

							}
							break;
						case 6 :
							// .\\antlr\\pascal.g:602:47: GT ^
							{
							GT231=(Token)match(input,GT,FOLLOW_GT_in_expression2699); 
							GT231_tree = (CommonTree)adaptor.create(GT231);
							root_0 = (CommonTree)adaptor.becomeRoot(GT231_tree, root_0);

							}
							break;
						case 7 :
							// .\\antlr\\pascal.g:602:53: IN ^
							{
							IN232=(Token)match(input,IN,FOLLOW_IN_in_expression2704); 
							IN232_tree = (CommonTree)adaptor.create(IN232);
							root_0 = (CommonTree)adaptor.becomeRoot(IN232_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_simpleExpression_in_expression2708);
					simpleExpression233=simpleExpression();
					state._fsp--;

					adaptor.addChild(root_0, simpleExpression233.getTree());

					}
					break;

				default :
					break loop43;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class simpleExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleExpression"
	// .\\antlr\\pascal.g:605:1: simpleExpression : term ( ( PLUS ^| MINUS ^| OR ^) term )* ;
	public final pascalParser.simpleExpression_return simpleExpression() throws RecognitionException {
		pascalParser.simpleExpression_return retval = new pascalParser.simpleExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PLUS235=null;
		Token MINUS236=null;
		Token OR237=null;
		ParserRuleReturnScope term234 =null;
		ParserRuleReturnScope term238 =null;

		CommonTree PLUS235_tree=null;
		CommonTree MINUS236_tree=null;
		CommonTree OR237_tree=null;

		try {
			// .\\antlr\\pascal.g:606:5: ( term ( ( PLUS ^| MINUS ^| OR ^) term )* )
			// .\\antlr\\pascal.g:606:7: term ( ( PLUS ^| MINUS ^| OR ^) term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_term_in_simpleExpression2728);
			term234=term();
			state._fsp--;

			adaptor.addChild(root_0, term234.getTree());

			// .\\antlr\\pascal.g:606:12: ( ( PLUS ^| MINUS ^| OR ^) term )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==MINUS||LA45_0==OR||LA45_0==PLUS) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// .\\antlr\\pascal.g:606:14: ( PLUS ^| MINUS ^| OR ^) term
					{
					// .\\antlr\\pascal.g:606:14: ( PLUS ^| MINUS ^| OR ^)
					int alt44=3;
					switch ( input.LA(1) ) {
					case PLUS:
						{
						alt44=1;
						}
						break;
					case MINUS:
						{
						alt44=2;
						}
						break;
					case OR:
						{
						alt44=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}
					switch (alt44) {
						case 1 :
							// .\\antlr\\pascal.g:606:15: PLUS ^
							{
							PLUS235=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression2733); 
							PLUS235_tree = (CommonTree)adaptor.create(PLUS235);
							root_0 = (CommonTree)adaptor.becomeRoot(PLUS235_tree, root_0);

							}
							break;
						case 2 :
							// .\\antlr\\pascal.g:606:23: MINUS ^
							{
							MINUS236=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression2738); 
							MINUS236_tree = (CommonTree)adaptor.create(MINUS236);
							root_0 = (CommonTree)adaptor.becomeRoot(MINUS236_tree, root_0);

							}
							break;
						case 3 :
							// .\\antlr\\pascal.g:606:32: OR ^
							{
							OR237=(Token)match(input,OR,FOLLOW_OR_in_simpleExpression2743); 
							OR237_tree = (CommonTree)adaptor.create(OR237);
							root_0 = (CommonTree)adaptor.becomeRoot(OR237_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_term_in_simpleExpression2747);
					term238=term();
					state._fsp--;

					adaptor.addChild(root_0, term238.getTree());

					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleExpression"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// .\\antlr\\pascal.g:609:1: term : signedFactor ( ( STAR ^| SLASH ^| DIV ^| MOD ^| AND ^) signedFactor )* ;
	public final pascalParser.term_return term() throws RecognitionException {
		pascalParser.term_return retval = new pascalParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR240=null;
		Token SLASH241=null;
		Token DIV242=null;
		Token MOD243=null;
		Token AND244=null;
		ParserRuleReturnScope signedFactor239 =null;
		ParserRuleReturnScope signedFactor245 =null;

		CommonTree STAR240_tree=null;
		CommonTree SLASH241_tree=null;
		CommonTree DIV242_tree=null;
		CommonTree MOD243_tree=null;
		CommonTree AND244_tree=null;

		try {
			// .\\antlr\\pascal.g:610:2: ( signedFactor ( ( STAR ^| SLASH ^| DIV ^| MOD ^| AND ^) signedFactor )* )
			// .\\antlr\\pascal.g:610:4: signedFactor ( ( STAR ^| SLASH ^| DIV ^| MOD ^| AND ^) signedFactor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_signedFactor_in_term2764);
			signedFactor239=signedFactor();
			state._fsp--;

			adaptor.addChild(root_0, signedFactor239.getTree());

			// .\\antlr\\pascal.g:610:17: ( ( STAR ^| SLASH ^| DIV ^| MOD ^| AND ^) signedFactor )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==AND||LA47_0==DIV||LA47_0==MOD||(LA47_0 >= SLASH && LA47_0 <= STAR)) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// .\\antlr\\pascal.g:610:19: ( STAR ^| SLASH ^| DIV ^| MOD ^| AND ^) signedFactor
					{
					// .\\antlr\\pascal.g:610:19: ( STAR ^| SLASH ^| DIV ^| MOD ^| AND ^)
					int alt46=5;
					switch ( input.LA(1) ) {
					case STAR:
						{
						alt46=1;
						}
						break;
					case SLASH:
						{
						alt46=2;
						}
						break;
					case DIV:
						{
						alt46=3;
						}
						break;
					case MOD:
						{
						alt46=4;
						}
						break;
					case AND:
						{
						alt46=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						throw nvae;
					}
					switch (alt46) {
						case 1 :
							// .\\antlr\\pascal.g:610:20: STAR ^
							{
							STAR240=(Token)match(input,STAR,FOLLOW_STAR_in_term2769); 
							STAR240_tree = (CommonTree)adaptor.create(STAR240);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR240_tree, root_0);

							}
							break;
						case 2 :
							// .\\antlr\\pascal.g:610:28: SLASH ^
							{
							SLASH241=(Token)match(input,SLASH,FOLLOW_SLASH_in_term2774); 
							SLASH241_tree = (CommonTree)adaptor.create(SLASH241);
							root_0 = (CommonTree)adaptor.becomeRoot(SLASH241_tree, root_0);

							}
							break;
						case 3 :
							// .\\antlr\\pascal.g:610:37: DIV ^
							{
							DIV242=(Token)match(input,DIV,FOLLOW_DIV_in_term2779); 
							DIV242_tree = (CommonTree)adaptor.create(DIV242);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV242_tree, root_0);

							}
							break;
						case 4 :
							// .\\antlr\\pascal.g:610:44: MOD ^
							{
							MOD243=(Token)match(input,MOD,FOLLOW_MOD_in_term2784); 
							MOD243_tree = (CommonTree)adaptor.create(MOD243);
							root_0 = (CommonTree)adaptor.becomeRoot(MOD243_tree, root_0);

							}
							break;
						case 5 :
							// .\\antlr\\pascal.g:610:51: AND ^
							{
							AND244=(Token)match(input,AND,FOLLOW_AND_in_term2789); 
							AND244_tree = (CommonTree)adaptor.create(AND244);
							root_0 = (CommonTree)adaptor.becomeRoot(AND244_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_signedFactor_in_term2793);
					signedFactor245=signedFactor();
					state._fsp--;

					adaptor.addChild(root_0, signedFactor245.getTree());

					}
					break;

				default :
					break loop47;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class signedFactor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "signedFactor"
	// .\\antlr\\pascal.g:613:1: signedFactor : ( PLUS ^| MINUS ^)? factor ;
	public final pascalParser.signedFactor_return signedFactor() throws RecognitionException {
		pascalParser.signedFactor_return retval = new pascalParser.signedFactor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PLUS246=null;
		Token MINUS247=null;
		ParserRuleReturnScope factor248 =null;

		CommonTree PLUS246_tree=null;
		CommonTree MINUS247_tree=null;

		try {
			// .\\antlr\\pascal.g:614:5: ( ( PLUS ^| MINUS ^)? factor )
			// .\\antlr\\pascal.g:614:7: ( PLUS ^| MINUS ^)? factor
			{
			root_0 = (CommonTree)adaptor.nil();


			// .\\antlr\\pascal.g:614:7: ( PLUS ^| MINUS ^)?
			int alt48=3;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==PLUS) ) {
				alt48=1;
			}
			else if ( (LA48_0==MINUS) ) {
				alt48=2;
			}
			switch (alt48) {
				case 1 :
					// .\\antlr\\pascal.g:614:8: PLUS ^
					{
					PLUS246=(Token)match(input,PLUS,FOLLOW_PLUS_in_signedFactor2814); 
					PLUS246_tree = (CommonTree)adaptor.create(PLUS246);
					root_0 = (CommonTree)adaptor.becomeRoot(PLUS246_tree, root_0);

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:614:14: MINUS ^
					{
					MINUS247=(Token)match(input,MINUS,FOLLOW_MINUS_in_signedFactor2817); 
					MINUS247_tree = (CommonTree)adaptor.create(MINUS247);
					root_0 = (CommonTree)adaptor.becomeRoot(MINUS247_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_factor_in_signedFactor2822);
			factor248=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor248.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "signedFactor"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// .\\antlr\\pascal.g:617:1: factor : ( variable | LPAREN ! expression RPAREN !| functionDesignator | unsignedConstant | set | NOT ^ factor );
	public final pascalParser.factor_return factor() throws RecognitionException {
		pascalParser.factor_return retval = new pascalParser.factor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN250=null;
		Token RPAREN252=null;
		Token NOT256=null;
		ParserRuleReturnScope variable249 =null;
		ParserRuleReturnScope expression251 =null;
		ParserRuleReturnScope functionDesignator253 =null;
		ParserRuleReturnScope unsignedConstant254 =null;
		ParserRuleReturnScope set255 =null;
		ParserRuleReturnScope factor257 =null;

		CommonTree LPAREN250_tree=null;
		CommonTree RPAREN252_tree=null;
		CommonTree NOT256_tree=null;

		try {
			// .\\antlr\\pascal.g:618:5: ( variable | LPAREN ! expression RPAREN !| functionDesignator | unsignedConstant | set | NOT ^ factor )
			int alt49=6;
			switch ( input.LA(1) ) {
			case AT:
				{
				alt49=1;
				}
				break;
			case IDENT:
				{
				int LA49_2 = input.LA(2);
				if ( (LA49_2==AND||LA49_2==COMMA||(LA49_2 >= DIV && LA49_2 <= DOWNTO)||(LA49_2 >= ELSE && LA49_2 <= EQUAL)||LA49_2==GE||LA49_2==GT||LA49_2==IN||(LA49_2 >= LBRACK && LA49_2 <= LBRACK2)||LA49_2==LE||LA49_2==LT||(LA49_2 >= MINUS && LA49_2 <= MOD)||LA49_2==NOT_EQUAL||(LA49_2 >= OF && LA49_2 <= OR)||(LA49_2 >= PLUS && LA49_2 <= POINTER)||(LA49_2 >= RBRACK && LA49_2 <= RBRACK2)||LA49_2==RPAREN||LA49_2==SEMI||(LA49_2 >= SLASH && LA49_2 <= STAR)||(LA49_2 >= THEN && LA49_2 <= TO)||LA49_2==UNTIL) ) {
					alt49=1;
				}
				else if ( (LA49_2==LPAREN) ) {
					alt49=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAREN:
				{
				alt49=2;
				}
				break;
			case CHR:
			case NIL:
			case NUM_INT:
			case NUM_REAL:
			case STRING_LITERAL:
				{
				alt49=4;
				}
				break;
			case LBRACK:
			case LBRACK2:
				{
				alt49=5;
				}
				break;
			case NOT:
				{
				alt49=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// .\\antlr\\pascal.g:618:7: variable
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variable_in_factor2839);
					variable249=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable249.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:619:7: LPAREN ! expression RPAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor2847); 
					pushFollow(FOLLOW_expression_in_factor2850);
					expression251=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression251.getTree());

					RPAREN252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor2852); 
					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:620:7: functionDesignator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDesignator_in_factor2861);
					functionDesignator253=functionDesignator();
					state._fsp--;

					adaptor.addChild(root_0, functionDesignator253.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:621:7: unsignedConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unsignedConstant_in_factor2869);
					unsignedConstant254=unsignedConstant();
					state._fsp--;

					adaptor.addChild(root_0, unsignedConstant254.getTree());

					}
					break;
				case 5 :
					// .\\antlr\\pascal.g:622:7: set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor2877);
					set255=set();
					state._fsp--;

					adaptor.addChild(root_0, set255.getTree());

					}
					break;
				case 6 :
					// .\\antlr\\pascal.g:623:7: NOT ^ factor
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT256=(Token)match(input,NOT,FOLLOW_NOT_in_factor2885); 
					NOT256_tree = (CommonTree)adaptor.create(NOT256);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT256_tree, root_0);

					pushFollow(FOLLOW_factor_in_factor2888);
					factor257=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor257.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class unsignedConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unsignedConstant"
	// .\\antlr\\pascal.g:626:1: unsignedConstant : ( unsignedNumber | constantChr | string | NIL );
	public final pascalParser.unsignedConstant_return unsignedConstant() throws RecognitionException {
		pascalParser.unsignedConstant_return retval = new pascalParser.unsignedConstant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NIL261=null;
		ParserRuleReturnScope unsignedNumber258 =null;
		ParserRuleReturnScope constantChr259 =null;
		ParserRuleReturnScope string260 =null;

		CommonTree NIL261_tree=null;

		try {
			// .\\antlr\\pascal.g:627:5: ( unsignedNumber | constantChr | string | NIL )
			int alt50=4;
			switch ( input.LA(1) ) {
			case NUM_INT:
			case NUM_REAL:
				{
				alt50=1;
				}
				break;
			case CHR:
				{
				alt50=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt50=3;
				}
				break;
			case NIL:
				{
				alt50=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// .\\antlr\\pascal.g:627:7: unsignedNumber
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unsignedNumber_in_unsignedConstant2905);
					unsignedNumber258=unsignedNumber();
					state._fsp--;

					adaptor.addChild(root_0, unsignedNumber258.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:628:7: constantChr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constantChr_in_unsignedConstant2913);
					constantChr259=constantChr();
					state._fsp--;

					adaptor.addChild(root_0, constantChr259.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:629:7: string
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_in_unsignedConstant2930);
					string260=string();
					state._fsp--;

					adaptor.addChild(root_0, string260.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:630:7: NIL
					{
					root_0 = (CommonTree)adaptor.nil();


					NIL261=(Token)match(input,NIL,FOLLOW_NIL_in_unsignedConstant2938); 
					NIL261_tree = (CommonTree)adaptor.create(NIL261);
					adaptor.addChild(root_0, NIL261_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unsignedConstant"


	public static class functionDesignator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionDesignator"
	// .\\antlr\\pascal.g:633:1: functionDesignator : id= identifier LPAREN args= parameterList RPAREN -> ^( FUNC_CALL $id $args) ;
	public final pascalParser.functionDesignator_return functionDesignator() throws RecognitionException {
		pascalParser.functionDesignator_return retval = new pascalParser.functionDesignator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN262=null;
		Token RPAREN263=null;
		ParserRuleReturnScope id =null;
		ParserRuleReturnScope args =null;

		CommonTree LPAREN262_tree=null;
		CommonTree RPAREN263_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");

		try {
			// .\\antlr\\pascal.g:634:5: (id= identifier LPAREN args= parameterList RPAREN -> ^( FUNC_CALL $id $args) )
			// .\\antlr\\pascal.g:634:7: id= identifier LPAREN args= parameterList RPAREN
			{
			pushFollow(FOLLOW_identifier_in_functionDesignator2958);
			id=identifier();
			state._fsp--;

			stream_identifier.add(id.getTree());
			LPAREN262=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionDesignator2960);  
			stream_LPAREN.add(LPAREN262);

			pushFollow(FOLLOW_parameterList_in_functionDesignator2964);
			args=parameterList();
			state._fsp--;

			stream_parameterList.add(args.getTree());
			RPAREN263=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionDesignator2966);  
			stream_RPAREN.add(RPAREN263);

			// AST REWRITE
			// elements: args, id
			// token labels: 
			// rule labels: args, id, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args",args!=null?args.getTree():null);
			RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 634:54: -> ^( FUNC_CALL $id $args)
			{
				// .\\antlr\\pascal.g:634:57: ^( FUNC_CALL $id $args)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_args.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionDesignator"


	public static class parameterList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameterList"
	// .\\antlr\\pascal.g:638:1: parameterList : actualParameter ( COMMA actualParameter )* -> ^( ARGLIST ( actualParameter )+ ) ;
	public final pascalParser.parameterList_return parameterList() throws RecognitionException {
		pascalParser.parameterList_return retval = new pascalParser.parameterList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA265=null;
		ParserRuleReturnScope actualParameter264 =null;
		ParserRuleReturnScope actualParameter266 =null;

		CommonTree COMMA265_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_actualParameter=new RewriteRuleSubtreeStream(adaptor,"rule actualParameter");

		try {
			// .\\antlr\\pascal.g:639:5: ( actualParameter ( COMMA actualParameter )* -> ^( ARGLIST ( actualParameter )+ ) )
			// .\\antlr\\pascal.g:639:7: actualParameter ( COMMA actualParameter )*
			{
			pushFollow(FOLLOW_actualParameter_in_parameterList2997);
			actualParameter264=actualParameter();
			state._fsp--;

			stream_actualParameter.add(actualParameter264.getTree());
			// .\\antlr\\pascal.g:639:23: ( COMMA actualParameter )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==COMMA) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// .\\antlr\\pascal.g:639:25: COMMA actualParameter
					{
					COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameterList3001);  
					stream_COMMA.add(COMMA265);

					pushFollow(FOLLOW_actualParameter_in_parameterList3003);
					actualParameter266=actualParameter();
					state._fsp--;

					stream_actualParameter.add(actualParameter266.getTree());
					}
					break;

				default :
					break loop51;
				}
			}

			// AST REWRITE
			// elements: actualParameter
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 639:50: -> ^( ARGLIST ( actualParameter )+ )
			{
				// .\\antlr\\pascal.g:639:53: ^( ARGLIST ( actualParameter )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGLIST, "ARGLIST"), root_1);
				if ( !(stream_actualParameter.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_actualParameter.hasNext() ) {
					adaptor.addChild(root_1, stream_actualParameter.nextTree());
				}
				stream_actualParameter.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameterList"


	public static class set_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set"
	// .\\antlr\\pascal.g:643:1: set : ( LBRACK elementList RBRACK -> ^( SET elementList ) | LBRACK2 elementList RBRACK2 -> ^( SET elementList ) );
	public final pascalParser.set_return set() throws RecognitionException {
		pascalParser.set_return retval = new pascalParser.set_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LBRACK267=null;
		Token RBRACK269=null;
		Token LBRACK2270=null;
		Token RBRACK2272=null;
		ParserRuleReturnScope elementList268 =null;
		ParserRuleReturnScope elementList271 =null;

		CommonTree LBRACK267_tree=null;
		CommonTree RBRACK269_tree=null;
		CommonTree LBRACK2270_tree=null;
		CommonTree RBRACK2272_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_RBRACK2=new RewriteRuleTokenStream(adaptor,"token RBRACK2");
		RewriteRuleTokenStream stream_LBRACK2=new RewriteRuleTokenStream(adaptor,"token LBRACK2");
		RewriteRuleSubtreeStream stream_elementList=new RewriteRuleSubtreeStream(adaptor,"rule elementList");

		try {
			// .\\antlr\\pascal.g:644:5: ( LBRACK elementList RBRACK -> ^( SET elementList ) | LBRACK2 elementList RBRACK2 -> ^( SET elementList ) )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==LBRACK) ) {
				alt52=1;
			}
			else if ( (LA52_0==LBRACK2) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// .\\antlr\\pascal.g:644:7: LBRACK elementList RBRACK
					{
					LBRACK267=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_set3034);  
					stream_LBRACK.add(LBRACK267);

					pushFollow(FOLLOW_elementList_in_set3036);
					elementList268=elementList();
					state._fsp--;

					stream_elementList.add(elementList268.getTree());
					RBRACK269=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_set3038);  
					stream_RBRACK.add(RBRACK269);

					// AST REWRITE
					// elements: elementList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 644:34: -> ^( SET elementList )
					{
						// .\\antlr\\pascal.g:644:37: ^( SET elementList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET, "SET"), root_1);
						adaptor.addChild(root_1, stream_elementList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:645:7: LBRACK2 elementList RBRACK2
					{
					LBRACK2270=(Token)match(input,LBRACK2,FOLLOW_LBRACK2_in_set3056);  
					stream_LBRACK2.add(LBRACK2270);

					pushFollow(FOLLOW_elementList_in_set3058);
					elementList271=elementList();
					state._fsp--;

					stream_elementList.add(elementList271.getTree());
					RBRACK2272=(Token)match(input,RBRACK2,FOLLOW_RBRACK2_in_set3060);  
					stream_RBRACK2.add(RBRACK2272);

					// AST REWRITE
					// elements: elementList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 645:35: -> ^( SET elementList )
					{
						// .\\antlr\\pascal.g:645:38: ^( SET elementList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET, "SET"), root_1);
						adaptor.addChild(root_1, stream_elementList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set"


	public static class elementList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "elementList"
	// .\\antlr\\pascal.g:648:1: elementList : ( element ( COMMA ! element )* |);
	public final pascalParser.elementList_return elementList() throws RecognitionException {
		pascalParser.elementList_return retval = new pascalParser.elementList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA274=null;
		ParserRuleReturnScope element273 =null;
		ParserRuleReturnScope element275 =null;

		CommonTree COMMA274_tree=null;

		try {
			// .\\antlr\\pascal.g:649:5: ( element ( COMMA ! element )* |)
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==AT||LA54_0==CHR||LA54_0==IDENT||(LA54_0 >= LBRACK && LA54_0 <= LBRACK2)||LA54_0==LPAREN||LA54_0==MINUS||LA54_0==NIL||LA54_0==NOT||(LA54_0 >= NUM_INT && LA54_0 <= NUM_REAL)||LA54_0==PLUS||LA54_0==STRING_LITERAL) ) {
				alt54=1;
			}
			else if ( ((LA54_0 >= RBRACK && LA54_0 <= RBRACK2)) ) {
				alt54=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// .\\antlr\\pascal.g:649:7: element ( COMMA ! element )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_element_in_elementList3087);
					element273=element();
					state._fsp--;

					adaptor.addChild(root_0, element273.getTree());

					// .\\antlr\\pascal.g:649:15: ( COMMA ! element )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==COMMA) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// .\\antlr\\pascal.g:649:17: COMMA ! element
							{
							COMMA274=(Token)match(input,COMMA,FOLLOW_COMMA_in_elementList3091); 
							pushFollow(FOLLOW_element_in_elementList3094);
							element275=element();
							state._fsp--;

							adaptor.addChild(root_0, element275.getTree());

							}
							break;

						default :
							break loop53;
						}
					}

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:651:5: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elementList"


	public static class element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "element"
	// .\\antlr\\pascal.g:653:1: element : expression ( DOTDOT ^ expression )? ;
	public final pascalParser.element_return element() throws RecognitionException {
		pascalParser.element_return retval = new pascalParser.element_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOTDOT277=null;
		ParserRuleReturnScope expression276 =null;
		ParserRuleReturnScope expression278 =null;

		CommonTree DOTDOT277_tree=null;

		try {
			// .\\antlr\\pascal.g:654:5: ( expression ( DOTDOT ^ expression )? )
			// .\\antlr\\pascal.g:654:7: expression ( DOTDOT ^ expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_element3120);
			expression276=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression276.getTree());

			// .\\antlr\\pascal.g:654:18: ( DOTDOT ^ expression )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==DOTDOT) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// .\\antlr\\pascal.g:654:20: DOTDOT ^ expression
					{
					DOTDOT277=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_element3124); 
					DOTDOT277_tree = (CommonTree)adaptor.create(DOTDOT277);
					root_0 = (CommonTree)adaptor.becomeRoot(DOTDOT277_tree, root_0);

					pushFollow(FOLLOW_expression_in_element3127);
					expression278=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression278.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element"


	public static class procedureStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedureStatement"
	// .\\antlr\\pascal.g:657:1: procedureStatement : id= identifier ( LPAREN args= parameterList RPAREN )? -> ^( PROC_CALL $id $args) ;
	public final pascalParser.procedureStatement_return procedureStatement() throws RecognitionException {
		pascalParser.procedureStatement_return retval = new pascalParser.procedureStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN279=null;
		Token RPAREN280=null;
		ParserRuleReturnScope id =null;
		ParserRuleReturnScope args =null;

		CommonTree LPAREN279_tree=null;
		CommonTree RPAREN280_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");

		try {
			// .\\antlr\\pascal.g:658:5: (id= identifier ( LPAREN args= parameterList RPAREN )? -> ^( PROC_CALL $id $args) )
			// .\\antlr\\pascal.g:658:7: id= identifier ( LPAREN args= parameterList RPAREN )?
			{
			pushFollow(FOLLOW_identifier_in_procedureStatement3149);
			id=identifier();
			state._fsp--;

			stream_identifier.add(id.getTree());
			// .\\antlr\\pascal.g:658:21: ( LPAREN args= parameterList RPAREN )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==LPAREN) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// .\\antlr\\pascal.g:658:23: LPAREN args= parameterList RPAREN
					{
					LPAREN279=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_procedureStatement3153);  
					stream_LPAREN.add(LPAREN279);

					pushFollow(FOLLOW_parameterList_in_procedureStatement3157);
					args=parameterList();
					state._fsp--;

					stream_parameterList.add(args.getTree());
					RPAREN280=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_procedureStatement3159);  
					stream_RPAREN.add(RPAREN280);

					}
					break;

			}

			// AST REWRITE
			// elements: args, id
			// token labels: 
			// rule labels: args, id, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args",args!=null?args.getTree():null);
			RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 658:59: -> ^( PROC_CALL $id $args)
			{
				// .\\antlr\\pascal.g:658:62: ^( PROC_CALL $id $args)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_CALL, "PROC_CALL"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_args.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureStatement"


	public static class actualParameter_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualParameter"
	// .\\antlr\\pascal.g:662:1: actualParameter : expression ;
	public final pascalParser.actualParameter_return actualParameter() throws RecognitionException {
		pascalParser.actualParameter_return retval = new pascalParser.actualParameter_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression281 =null;


		try {
			// .\\antlr\\pascal.g:663:5: ( expression )
			// .\\antlr\\pascal.g:663:7: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_actualParameter3193);
			expression281=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression281.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualParameter"


	public static class gotoStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "gotoStatement"
	// .\\antlr\\pascal.g:666:1: gotoStatement : GOTO ^ label ;
	public final pascalParser.gotoStatement_return gotoStatement() throws RecognitionException {
		pascalParser.gotoStatement_return retval = new pascalParser.gotoStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token GOTO282=null;
		ParserRuleReturnScope label283 =null;

		CommonTree GOTO282_tree=null;

		try {
			// .\\antlr\\pascal.g:667:5: ( GOTO ^ label )
			// .\\antlr\\pascal.g:667:7: GOTO ^ label
			{
			root_0 = (CommonTree)adaptor.nil();


			GOTO282=(Token)match(input,GOTO,FOLLOW_GOTO_in_gotoStatement3210); 
			GOTO282_tree = (CommonTree)adaptor.create(GOTO282);
			root_0 = (CommonTree)adaptor.becomeRoot(GOTO282_tree, root_0);

			pushFollow(FOLLOW_label_in_gotoStatement3213);
			label283=label();
			state._fsp--;

			adaptor.addChild(root_0, label283.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "gotoStatement"


	public static class emptyStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "emptyStatement"
	// .\\antlr\\pascal.g:670:1: emptyStatement :;
	public final pascalParser.emptyStatement_return emptyStatement() throws RecognitionException {
		pascalParser.emptyStatement_return retval = new pascalParser.emptyStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		try {
			// .\\antlr\\pascal.g:671:5: ()
			// .\\antlr\\pascal.g:672:5: 
			{
			root_0 = (CommonTree)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "emptyStatement"


	public static class empty_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "empty"
	// .\\antlr\\pascal.g:674:1: empty :;
	public final pascalParser.empty_return empty() throws RecognitionException {
		pascalParser.empty_return retval = new pascalParser.empty_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		try {
			// .\\antlr\\pascal.g:675:5: ()
			// .\\antlr\\pascal.g:676:5: 
			{
			root_0 = (CommonTree)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "empty"


	public static class structuredStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "structuredStatement"
	// .\\antlr\\pascal.g:678:1: structuredStatement : ( compoundStatement | conditionalStatement | repetetiveStatement | withStatement );
	public final pascalParser.structuredStatement_return structuredStatement() throws RecognitionException {
		pascalParser.structuredStatement_return retval = new pascalParser.structuredStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope compoundStatement284 =null;
		ParserRuleReturnScope conditionalStatement285 =null;
		ParserRuleReturnScope repetetiveStatement286 =null;
		ParserRuleReturnScope withStatement287 =null;


		try {
			// .\\antlr\\pascal.g:679:5: ( compoundStatement | conditionalStatement | repetetiveStatement | withStatement )
			int alt57=4;
			switch ( input.LA(1) ) {
			case BEGIN:
				{
				alt57=1;
				}
				break;
			case CASE:
			case IF:
				{
				alt57=2;
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				{
				alt57=3;
				}
				break;
			case WITH:
				{
				alt57=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// .\\antlr\\pascal.g:679:7: compoundStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_compoundStatement_in_structuredStatement3262);
					compoundStatement284=compoundStatement();
					state._fsp--;

					adaptor.addChild(root_0, compoundStatement284.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:680:7: conditionalStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_conditionalStatement_in_structuredStatement3270);
					conditionalStatement285=conditionalStatement();
					state._fsp--;

					adaptor.addChild(root_0, conditionalStatement285.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:681:7: repetetiveStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_repetetiveStatement_in_structuredStatement3278);
					repetetiveStatement286=repetetiveStatement();
					state._fsp--;

					adaptor.addChild(root_0, repetetiveStatement286.getTree());

					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:682:7: withStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withStatement_in_structuredStatement3286);
					withStatement287=withStatement();
					state._fsp--;

					adaptor.addChild(root_0, withStatement287.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structuredStatement"


	public static class compoundStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compoundStatement"
	// .\\antlr\\pascal.g:685:1: compoundStatement : BEGIN ! statements END !;
	public final pascalParser.compoundStatement_return compoundStatement() throws RecognitionException {
		pascalParser.compoundStatement_return retval = new pascalParser.compoundStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BEGIN288=null;
		Token END290=null;
		ParserRuleReturnScope statements289 =null;

		CommonTree BEGIN288_tree=null;
		CommonTree END290_tree=null;

		try {
			// .\\antlr\\pascal.g:686:5: ( BEGIN ! statements END !)
			// .\\antlr\\pascal.g:686:7: BEGIN ! statements END !
			{
			root_0 = (CommonTree)adaptor.nil();


			BEGIN288=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_compoundStatement3303); 
			pushFollow(FOLLOW_statements_in_compoundStatement3308);
			statements289=statements();
			state._fsp--;

			adaptor.addChild(root_0, statements289.getTree());

			END290=(Token)match(input,END,FOLLOW_END_in_compoundStatement3316); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compoundStatement"


	public static class statements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// .\\antlr\\pascal.g:691:1: statements : statement ( SEMI statement )* -> ^( BLOCK ( statement )+ ) ;
	public final pascalParser.statements_return statements() throws RecognitionException {
		pascalParser.statements_return retval = new pascalParser.statements_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SEMI292=null;
		ParserRuleReturnScope statement291 =null;
		ParserRuleReturnScope statement293 =null;

		CommonTree SEMI292_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// .\\antlr\\pascal.g:692:5: ( statement ( SEMI statement )* -> ^( BLOCK ( statement )+ ) )
			// .\\antlr\\pascal.g:692:7: statement ( SEMI statement )*
			{
			pushFollow(FOLLOW_statement_in_statements3334);
			statement291=statement();
			state._fsp--;

			stream_statement.add(statement291.getTree());
			// .\\antlr\\pascal.g:692:17: ( SEMI statement )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==SEMI) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// .\\antlr\\pascal.g:692:19: SEMI statement
					{
					SEMI292=(Token)match(input,SEMI,FOLLOW_SEMI_in_statements3338);  
					stream_SEMI.add(SEMI292);

					pushFollow(FOLLOW_statement_in_statements3340);
					statement293=statement();
					state._fsp--;

					stream_statement.add(statement293.getTree());
					}
					break;

				default :
					break loop58;
				}
			}

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 692:37: -> ^( BLOCK ( statement )+ )
			{
				// .\\antlr\\pascal.g:692:40: ^( BLOCK ( statement )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class conditionalStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditionalStatement"
	// .\\antlr\\pascal.g:695:1: conditionalStatement : ( ifStatement | caseStatement );
	public final pascalParser.conditionalStatement_return conditionalStatement() throws RecognitionException {
		pascalParser.conditionalStatement_return retval = new pascalParser.conditionalStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope ifStatement294 =null;
		ParserRuleReturnScope caseStatement295 =null;


		try {
			// .\\antlr\\pascal.g:696:5: ( ifStatement | caseStatement )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==IF) ) {
				alt59=1;
			}
			else if ( (LA59_0==CASE) ) {
				alt59=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// .\\antlr\\pascal.g:696:7: ifStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_conditionalStatement3371);
					ifStatement294=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement294.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:697:7: caseStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_caseStatement_in_conditionalStatement3379);
					caseStatement295=caseStatement();
					state._fsp--;

					adaptor.addChild(root_0, caseStatement295.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalStatement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// .\\antlr\\pascal.g:700:1: ifStatement : IF ^ expression THEN ! statement ( ELSE ! statement )? ;
	public final pascalParser.ifStatement_return ifStatement() throws RecognitionException {
		pascalParser.ifStatement_return retval = new pascalParser.ifStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IF296=null;
		Token THEN298=null;
		Token ELSE300=null;
		ParserRuleReturnScope expression297 =null;
		ParserRuleReturnScope statement299 =null;
		ParserRuleReturnScope statement301 =null;

		CommonTree IF296_tree=null;
		CommonTree THEN298_tree=null;
		CommonTree ELSE300_tree=null;

		try {
			// .\\antlr\\pascal.g:701:5: ( IF ^ expression THEN ! statement ( ELSE ! statement )? )
			// .\\antlr\\pascal.g:701:7: IF ^ expression THEN ! statement ( ELSE ! statement )?
			{
			root_0 = (CommonTree)adaptor.nil();


			IF296=(Token)match(input,IF,FOLLOW_IF_in_ifStatement3396); 
			IF296_tree = (CommonTree)adaptor.create(IF296);
			root_0 = (CommonTree)adaptor.becomeRoot(IF296_tree, root_0);

			pushFollow(FOLLOW_expression_in_ifStatement3399);
			expression297=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression297.getTree());

			THEN298=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement3401); 
			pushFollow(FOLLOW_statement_in_ifStatement3404);
			statement299=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement299.getTree());

			// .\\antlr\\pascal.g:702:7: ( ELSE ! statement )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==ELSE) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// .\\antlr\\pascal.g:709:5: ELSE ! statement
					{
					ELSE300=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement3431); 
					pushFollow(FOLLOW_statement_in_ifStatement3434);
					statement301=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement301.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class caseStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "caseStatement"
	// .\\antlr\\pascal.g:713:1: caseStatement : CASE ^ expression OF ! caseListElement ( SEMI ! caseListElement )* ( SEMI ! ELSE ! statements )? END !;
	public final pascalParser.caseStatement_return caseStatement() throws RecognitionException {
		pascalParser.caseStatement_return retval = new pascalParser.caseStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CASE302=null;
		Token OF304=null;
		Token SEMI306=null;
		Token SEMI308=null;
		Token ELSE309=null;
		Token END311=null;
		ParserRuleReturnScope expression303 =null;
		ParserRuleReturnScope caseListElement305 =null;
		ParserRuleReturnScope caseListElement307 =null;
		ParserRuleReturnScope statements310 =null;

		CommonTree CASE302_tree=null;
		CommonTree OF304_tree=null;
		CommonTree SEMI306_tree=null;
		CommonTree SEMI308_tree=null;
		CommonTree ELSE309_tree=null;
		CommonTree END311_tree=null;

		try {
			// .\\antlr\\pascal.g:714:5: ( CASE ^ expression OF ! caseListElement ( SEMI ! caseListElement )* ( SEMI ! ELSE ! statements )? END !)
			// .\\antlr\\pascal.g:714:7: CASE ^ expression OF ! caseListElement ( SEMI ! caseListElement )* ( SEMI ! ELSE ! statements )? END !
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE302=(Token)match(input,CASE,FOLLOW_CASE_in_caseStatement3458); 
			CASE302_tree = (CommonTree)adaptor.create(CASE302);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE302_tree, root_0);

			pushFollow(FOLLOW_expression_in_caseStatement3461);
			expression303=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression303.getTree());

			OF304=(Token)match(input,OF,FOLLOW_OF_in_caseStatement3463); 
			pushFollow(FOLLOW_caseListElement_in_caseStatement3474);
			caseListElement305=caseListElement();
			state._fsp--;

			adaptor.addChild(root_0, caseListElement305.getTree());

			// .\\antlr\\pascal.g:715:25: ( SEMI ! caseListElement )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==SEMI) ) {
					int LA61_1 = input.LA(2);
					if ( (LA61_1==CHR||LA61_1==IDENT||LA61_1==MINUS||(LA61_1 >= NUM_INT && LA61_1 <= NUM_REAL)||LA61_1==PLUS||LA61_1==STRING_LITERAL) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// .\\antlr\\pascal.g:715:27: SEMI ! caseListElement
					{
					SEMI306=(Token)match(input,SEMI,FOLLOW_SEMI_in_caseStatement3478); 
					pushFollow(FOLLOW_caseListElement_in_caseStatement3481);
					caseListElement307=caseListElement();
					state._fsp--;

					adaptor.addChild(root_0, caseListElement307.getTree());

					}
					break;

				default :
					break loop61;
				}
			}

			// .\\antlr\\pascal.g:716:7: ( SEMI ! ELSE ! statements )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==SEMI) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// .\\antlr\\pascal.g:716:9: SEMI ! ELSE ! statements
					{
					SEMI308=(Token)match(input,SEMI,FOLLOW_SEMI_in_caseStatement3494); 
					ELSE309=(Token)match(input,ELSE,FOLLOW_ELSE_in_caseStatement3497); 
					pushFollow(FOLLOW_statements_in_caseStatement3500);
					statements310=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements310.getTree());

					}
					break;

			}

			END311=(Token)match(input,END,FOLLOW_END_in_caseStatement3511); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseStatement"


	public static class caseListElement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "caseListElement"
	// .\\antlr\\pascal.g:720:1: caseListElement : constList COLON ^ statement ;
	public final pascalParser.caseListElement_return caseListElement() throws RecognitionException {
		pascalParser.caseListElement_return retval = new pascalParser.caseListElement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON313=null;
		ParserRuleReturnScope constList312 =null;
		ParserRuleReturnScope statement314 =null;

		CommonTree COLON313_tree=null;

		try {
			// .\\antlr\\pascal.g:721:5: ( constList COLON ^ statement )
			// .\\antlr\\pascal.g:721:7: constList COLON ^ statement
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_constList_in_caseListElement3529);
			constList312=constList();
			state._fsp--;

			adaptor.addChild(root_0, constList312.getTree());

			COLON313=(Token)match(input,COLON,FOLLOW_COLON_in_caseListElement3531); 
			COLON313_tree = (CommonTree)adaptor.create(COLON313);
			root_0 = (CommonTree)adaptor.becomeRoot(COLON313_tree, root_0);

			pushFollow(FOLLOW_statement_in_caseListElement3534);
			statement314=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement314.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseListElement"


	public static class repetetiveStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "repetetiveStatement"
	// .\\antlr\\pascal.g:724:1: repetetiveStatement : ( whileStatement | repeatStatement | forStatement );
	public final pascalParser.repetetiveStatement_return repetetiveStatement() throws RecognitionException {
		pascalParser.repetetiveStatement_return retval = new pascalParser.repetetiveStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope whileStatement315 =null;
		ParserRuleReturnScope repeatStatement316 =null;
		ParserRuleReturnScope forStatement317 =null;


		try {
			// .\\antlr\\pascal.g:725:5: ( whileStatement | repeatStatement | forStatement )
			int alt63=3;
			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt63=1;
				}
				break;
			case REPEAT:
				{
				alt63=2;
				}
				break;
			case FOR:
				{
				alt63=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// .\\antlr\\pascal.g:725:7: whileStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_repetetiveStatement3551);
					whileStatement315=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement315.getTree());

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:726:7: repeatStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_repetetiveStatement3559);
					repeatStatement316=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement316.getTree());

					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:727:7: forStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_repetetiveStatement3567);
					forStatement317=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement317.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repetetiveStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// .\\antlr\\pascal.g:730:1: whileStatement : WHILE ^ expression DO ! statement ;
	public final pascalParser.whileStatement_return whileStatement() throws RecognitionException {
		pascalParser.whileStatement_return retval = new pascalParser.whileStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WHILE318=null;
		Token DO320=null;
		ParserRuleReturnScope expression319 =null;
		ParserRuleReturnScope statement321 =null;

		CommonTree WHILE318_tree=null;
		CommonTree DO320_tree=null;

		try {
			// .\\antlr\\pascal.g:731:5: ( WHILE ^ expression DO ! statement )
			// .\\antlr\\pascal.g:731:7: WHILE ^ expression DO ! statement
			{
			root_0 = (CommonTree)adaptor.nil();


			WHILE318=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement3584); 
			WHILE318_tree = (CommonTree)adaptor.create(WHILE318);
			root_0 = (CommonTree)adaptor.becomeRoot(WHILE318_tree, root_0);

			pushFollow(FOLLOW_expression_in_whileStatement3587);
			expression319=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression319.getTree());

			DO320=(Token)match(input,DO,FOLLOW_DO_in_whileStatement3589); 
			pushFollow(FOLLOW_statement_in_whileStatement3592);
			statement321=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement321.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class repeatStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "repeatStatement"
	// .\\antlr\\pascal.g:734:1: repeatStatement : REPEAT ^ statements UNTIL ! expression ;
	public final pascalParser.repeatStatement_return repeatStatement() throws RecognitionException {
		pascalParser.repeatStatement_return retval = new pascalParser.repeatStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REPEAT322=null;
		Token UNTIL324=null;
		ParserRuleReturnScope statements323 =null;
		ParserRuleReturnScope expression325 =null;

		CommonTree REPEAT322_tree=null;
		CommonTree UNTIL324_tree=null;

		try {
			// .\\antlr\\pascal.g:735:5: ( REPEAT ^ statements UNTIL ! expression )
			// .\\antlr\\pascal.g:735:7: REPEAT ^ statements UNTIL ! expression
			{
			root_0 = (CommonTree)adaptor.nil();


			REPEAT322=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_repeatStatement3609); 
			REPEAT322_tree = (CommonTree)adaptor.create(REPEAT322);
			root_0 = (CommonTree)adaptor.becomeRoot(REPEAT322_tree, root_0);

			pushFollow(FOLLOW_statements_in_repeatStatement3612);
			statements323=statements();
			state._fsp--;

			adaptor.addChild(root_0, statements323.getTree());

			UNTIL324=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_repeatStatement3614); 
			pushFollow(FOLLOW_expression_in_repeatStatement3617);
			expression325=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression325.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repeatStatement"


	public static class forStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
	// .\\antlr\\pascal.g:738:1: forStatement : FOR ^ identifier ASSIGN ! forList DO ! statement ;
	public final pascalParser.forStatement_return forStatement() throws RecognitionException {
		pascalParser.forStatement_return retval = new pascalParser.forStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FOR326=null;
		Token ASSIGN328=null;
		Token DO330=null;
		ParserRuleReturnScope identifier327 =null;
		ParserRuleReturnScope forList329 =null;
		ParserRuleReturnScope statement331 =null;

		CommonTree FOR326_tree=null;
		CommonTree ASSIGN328_tree=null;
		CommonTree DO330_tree=null;

		try {
			// .\\antlr\\pascal.g:739:5: ( FOR ^ identifier ASSIGN ! forList DO ! statement )
			// .\\antlr\\pascal.g:739:7: FOR ^ identifier ASSIGN ! forList DO ! statement
			{
			root_0 = (CommonTree)adaptor.nil();


			FOR326=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement3634); 
			FOR326_tree = (CommonTree)adaptor.create(FOR326);
			root_0 = (CommonTree)adaptor.becomeRoot(FOR326_tree, root_0);

			pushFollow(FOLLOW_identifier_in_forStatement3637);
			identifier327=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier327.getTree());

			ASSIGN328=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_forStatement3639); 
			pushFollow(FOLLOW_forList_in_forStatement3642);
			forList329=forList();
			state._fsp--;

			adaptor.addChild(root_0, forList329.getTree());

			DO330=(Token)match(input,DO,FOLLOW_DO_in_forStatement3644); 
			pushFollow(FOLLOW_statement_in_forStatement3647);
			statement331=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement331.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forStatement"


	public static class forList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forList"
	// .\\antlr\\pascal.g:742:1: forList : initialValue ( TO ^| DOWNTO ^) finalValue ;
	public final pascalParser.forList_return forList() throws RecognitionException {
		pascalParser.forList_return retval = new pascalParser.forList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TO333=null;
		Token DOWNTO334=null;
		ParserRuleReturnScope initialValue332 =null;
		ParserRuleReturnScope finalValue335 =null;

		CommonTree TO333_tree=null;
		CommonTree DOWNTO334_tree=null;

		try {
			// .\\antlr\\pascal.g:743:5: ( initialValue ( TO ^| DOWNTO ^) finalValue )
			// .\\antlr\\pascal.g:743:7: initialValue ( TO ^| DOWNTO ^) finalValue
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_initialValue_in_forList3664);
			initialValue332=initialValue();
			state._fsp--;

			adaptor.addChild(root_0, initialValue332.getTree());

			// .\\antlr\\pascal.g:743:20: ( TO ^| DOWNTO ^)
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==TO) ) {
				alt64=1;
			}
			else if ( (LA64_0==DOWNTO) ) {
				alt64=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// .\\antlr\\pascal.g:743:21: TO ^
					{
					TO333=(Token)match(input,TO,FOLLOW_TO_in_forList3667); 
					TO333_tree = (CommonTree)adaptor.create(TO333);
					root_0 = (CommonTree)adaptor.becomeRoot(TO333_tree, root_0);

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:743:27: DOWNTO ^
					{
					DOWNTO334=(Token)match(input,DOWNTO,FOLLOW_DOWNTO_in_forList3672); 
					DOWNTO334_tree = (CommonTree)adaptor.create(DOWNTO334);
					root_0 = (CommonTree)adaptor.becomeRoot(DOWNTO334_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_finalValue_in_forList3676);
			finalValue335=finalValue();
			state._fsp--;

			adaptor.addChild(root_0, finalValue335.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forList"


	public static class initialValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "initialValue"
	// .\\antlr\\pascal.g:746:1: initialValue : expression ;
	public final pascalParser.initialValue_return initialValue() throws RecognitionException {
		pascalParser.initialValue_return retval = new pascalParser.initialValue_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression336 =null;


		try {
			// .\\antlr\\pascal.g:747:5: ( expression )
			// .\\antlr\\pascal.g:747:7: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_initialValue3693);
			expression336=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression336.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initialValue"


	public static class finalValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "finalValue"
	// .\\antlr\\pascal.g:750:1: finalValue : expression ;
	public final pascalParser.finalValue_return finalValue() throws RecognitionException {
		pascalParser.finalValue_return retval = new pascalParser.finalValue_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression337 =null;


		try {
			// .\\antlr\\pascal.g:751:5: ( expression )
			// .\\antlr\\pascal.g:751:7: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_finalValue3710);
			expression337=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression337.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "finalValue"


	public static class withStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "withStatement"
	// .\\antlr\\pascal.g:754:1: withStatement : WITH ^ recordVariableList DO ! statement ;
	public final pascalParser.withStatement_return withStatement() throws RecognitionException {
		pascalParser.withStatement_return retval = new pascalParser.withStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WITH338=null;
		Token DO340=null;
		ParserRuleReturnScope recordVariableList339 =null;
		ParserRuleReturnScope statement341 =null;

		CommonTree WITH338_tree=null;
		CommonTree DO340_tree=null;

		try {
			// .\\antlr\\pascal.g:755:5: ( WITH ^ recordVariableList DO ! statement )
			// .\\antlr\\pascal.g:755:7: WITH ^ recordVariableList DO ! statement
			{
			root_0 = (CommonTree)adaptor.nil();


			WITH338=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement3727); 
			WITH338_tree = (CommonTree)adaptor.create(WITH338);
			root_0 = (CommonTree)adaptor.becomeRoot(WITH338_tree, root_0);

			pushFollow(FOLLOW_recordVariableList_in_withStatement3730);
			recordVariableList339=recordVariableList();
			state._fsp--;

			adaptor.addChild(root_0, recordVariableList339.getTree());

			DO340=(Token)match(input,DO,FOLLOW_DO_in_withStatement3732); 
			pushFollow(FOLLOW_statement_in_withStatement3735);
			statement341=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement341.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "withStatement"


	public static class recordVariableList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "recordVariableList"
	// .\\antlr\\pascal.g:758:1: recordVariableList : variable ( COMMA ! variable )* ;
	public final pascalParser.recordVariableList_return recordVariableList() throws RecognitionException {
		pascalParser.recordVariableList_return retval = new pascalParser.recordVariableList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA343=null;
		ParserRuleReturnScope variable342 =null;
		ParserRuleReturnScope variable344 =null;

		CommonTree COMMA343_tree=null;

		try {
			// .\\antlr\\pascal.g:759:5: ( variable ( COMMA ! variable )* )
			// .\\antlr\\pascal.g:759:7: variable ( COMMA ! variable )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variable_in_recordVariableList3752);
			variable342=variable();
			state._fsp--;

			adaptor.addChild(root_0, variable342.getTree());

			// .\\antlr\\pascal.g:759:16: ( COMMA ! variable )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==COMMA) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// .\\antlr\\pascal.g:759:18: COMMA ! variable
					{
					COMMA343=(Token)match(input,COMMA,FOLLOW_COMMA_in_recordVariableList3756); 
					pushFollow(FOLLOW_variable_in_recordVariableList3759);
					variable344=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable344.getTree());

					}
					break;

				default :
					break loop65;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordVariableList"

	// Delegated rules



	public static final BitSet FOLLOW_programHeading_in_program524 = new BitSet(new long[]{0x0019010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_INTERFACE_in_program527 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_block_in_program538 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_DOT_in_program546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROGRAM_in_programHeading564 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_programHeading567 = new BitSet(new long[]{0x0400000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_programHeading570 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifierList_in_programHeading573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_programHeading575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_programHeading580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIT_in_programHeading589 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_programHeading592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_programHeading594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identifier609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_labelDeclarationPart_in_block628 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_constantDefinitionPart_in_block638 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_typeDefinitionPart_in_block648 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_variableDeclarationPart_in_block658 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_procedureAndFunctionDeclarationPart_in_block668 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_usesUnitsPart_in_block678 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_IMPLEMENTATION_in_block688 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_compoundStatement_in_block705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USES_in_usesUnitsPart722 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifierList_in_usesUnitsPart725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_usesUnitsPart727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABEL_in_labelDeclarationPart745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_label_in_labelDeclarationPart748 = new BitSet(new long[]{0x0000000000100000L,0x0000000000400000L});
	public static final BitSet FOLLOW_COMMA_in_labelDeclarationPart752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_label_in_labelDeclarationPart755 = new BitSet(new long[]{0x0000000000100000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_labelDeclarationPart760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unsignedInteger_in_label778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constantDefinitionPart795 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_constantDefinition_in_constantDefinitionPart798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_constantDefinitionPart802 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_constantDefinition_in_constantDefinitionPart805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_constantDefinitionPart810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_constantDefinition828 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_EQUAL_in_constantDefinition830 = new BitSet(new long[]{0x2000200000040000L,0x0000000010000230L});
	public static final BitSet FOLLOW_constant_in_constantDefinition833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHR_in_constantChr850 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_constantChr853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_unsignedInteger_in_constantChr856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_constantChr858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unsignedNumber_in_constant876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_constant886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_unsignedNumber_in_constant890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_constant909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_constant919 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_constant923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_constant947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantChr_in_constant955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unsignedInteger_in_unsignedNumber972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unsignedReal_in_unsignedNumber980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_INT_in_unsignedInteger997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_REAL_in_unsignedReal1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_string1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_typeDefinitionPart1069 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_typeDefinition_in_typeDefinitionPart1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_typeDefinitionPart1076 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_typeDefinition_in_typeDefinitionPart1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_typeDefinitionPart1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_typeDefinition1103 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_EQUAL_in_typeDefinition1107 = new BitSet(new long[]{0x2404212000068200L,0x0000000018860F30L});
	public static final BitSet FOLLOW_type_in_typeDefinition1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionType_in_typeDefinition1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_typeDefinition1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionType1168 = new BitSet(new long[]{0x0400000000080000L});
	public static final BitSet FOLLOW_formalParameterList_in_functionType1172 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_functionType1176 = new BitSet(new long[]{0x0004200000028000L,0x0000000008020000L});
	public static final BitSet FOLLOW_resultType_in_functionType1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_in_procedureType1196 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_formalParameterList_in_procedureType1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_structuredType_in_type1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointerType_in_type1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarType_in_simpleType1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subrangeType_in_simpleType1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeIdentifier_in_simpleType1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringtype_in_simpleType1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_scalarType1293 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifierList_in_scalarType1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_scalarType1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subrangeType1328 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOTDOT_in_subrangeType1330 = new BitSet(new long[]{0x2000200000040000L,0x0000000010000230L});
	public static final BitSet FOLLOW_constant_in_subrangeType1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_typeIdentifier1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_typeIdentifier1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_typeIdentifier1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_typeIdentifier1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_typeIdentifier1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_typeIdentifier1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKED_in_structuredType1408 = new BitSet(new long[]{0x0000002000000200L,0x0000000000840000L});
	public static final BitSet FOLLOW_unpackedStructuredType_in_structuredType1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unpackedStructuredType_in_structuredType1417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_unpackedStructuredType1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_unpackedStructuredType1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setType_in_unpackedStructuredType1450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fileType_in_unpackedStructuredType1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_stringtype1475 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LBRACK_in_stringtype1478 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_identifier_in_stringtype1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_unsignedNumber_in_stringtype1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACK_in_stringtype1487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_arrayType1505 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LBRACK_in_arrayType1508 = new BitSet(new long[]{0x2404200000068000L,0x0000000018020230L});
	public static final BitSet FOLLOW_typeList_in_arrayType1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACK_in_arrayType1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_OF_in_arrayType1516 = new BitSet(new long[]{0x2404202000068200L,0x0000000018860730L});
	public static final BitSet FOLLOW_componentType_in_arrayType1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_arrayType1527 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LBRACK2_in_arrayType1530 = new BitSet(new long[]{0x2404200000068000L,0x0000000018020230L});
	public static final BitSet FOLLOW_typeList_in_arrayType1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACK2_in_arrayType1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_OF_in_arrayType1538 = new BitSet(new long[]{0x2404202000068200L,0x0000000018860730L});
	public static final BitSet FOLLOW_componentType_in_arrayType1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indexType_in_typeList1552 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_typeList1556 = new BitSet(new long[]{0x2404200000068000L,0x0000000018020230L});
	public static final BitSet FOLLOW_indexType_in_typeList1558 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_simpleType_in_indexType1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_componentType1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECORD_in_recordType1619 = new BitSet(new long[]{0x0000200000010000L});
	public static final BitSet FOLLOW_fieldList_in_recordType1622 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_END_in_recordType1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fixedPart_in_fieldList1644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_fieldList1648 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_variantPart_in_fieldList1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_fieldList1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variantPart_in_fieldList1677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordSection_in_fixedPart1716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_fixedPart1720 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_recordSection_in_fixedPart1723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_identifierList_in_recordSection1743 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_recordSection1745 = new BitSet(new long[]{0x2404202000068200L,0x0000000018860730L});
	public static final BitSet FOLLOW_type_in_recordSection1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_variantPart1775 = new BitSet(new long[]{0x0004200000028000L,0x0000000008020000L});
	public static final BitSet FOLLOW_tag_in_variantPart1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_OF_in_variantPart1780 = new BitSet(new long[]{0x2000200000040000L,0x0000000010000230L});
	public static final BitSet FOLLOW_variant_in_variantPart1783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_variantPart1787 = new BitSet(new long[]{0x2000200000040000L,0x0000000010000230L});
	public static final BitSet FOLLOW_variant_in_variantPart1790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_variantPart1794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_identifier_in_tag1818 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_tag1820 = new BitSet(new long[]{0x0004200000028000L,0x0000000008020000L});
	public static final BitSet FOLLOW_typeIdentifier_in_tag1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeIdentifier_in_tag1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constList_in_variant1883 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_variant1887 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_variant1895 = new BitSet(new long[]{0x0000200000010000L});
	public static final BitSet FOLLOW_fieldList_in_variant1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_variant1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_setType1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_OF_in_setType1921 = new BitSet(new long[]{0x2404200000068000L,0x0000000018020230L});
	public static final BitSet FOLLOW_baseType_in_setType1924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_baseType1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILE_in_fileType1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_OF_in_fileType1961 = new BitSet(new long[]{0x2404202000068200L,0x0000000018860730L});
	public static final BitSet FOLLOW_type_in_fileType1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILE_in_fileType1972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POINTER_in_pointerType1989 = new BitSet(new long[]{0x0004200000028000L,0x0000000008020000L});
	public static final BitSet FOLLOW_typeIdentifier_in_pointerType1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variableDeclarationPart2011 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationPart2014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_variableDeclarationPart2018 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationPart2021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_variableDeclarationPart2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierList_in_variableDeclaration2044 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration2048 = new BitSet(new long[]{0x2404202000068200L,0x0000000018860730L});
	public static final BitSet FOLLOW_type_in_variableDeclaration2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureOrFunctionDeclaration_in_procedureAndFunctionDeclarationPart2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_procedureAndFunctionDeclarationPart2072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureDeclaration_in_procedureOrFunctionDeclaration2090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_procedureOrFunctionDeclaration2098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration2115 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_procedureDeclaration2118 = new BitSet(new long[]{0x0400000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_formalParameterList_in_procedureDeclaration2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_procedureDeclaration2125 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_block_in_procedureDeclaration2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_formalParameterList2151 = new BitSet(new long[]{0x0000210000000000L,0x0000002000000800L});
	public static final BitSet FOLLOW_formalParameterSection_in_formalParameterList2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_SEMI_in_formalParameterList2157 = new BitSet(new long[]{0x0000210000000000L,0x0000002000000800L});
	public static final BitSet FOLLOW_formalParameterSection_in_formalParameterList2159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_RPAREN_in_formalParameterList2164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameterGroup_in_formalParameterSection2200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formalParameterSection2208 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_parameterGroup_in_formalParameterSection2211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_formalParameterSection2219 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_parameterGroup_in_formalParameterSection2222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_in_formalParameterSection2230 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_parameterGroup_in_formalParameterSection2233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierList_in_parameterGroup2253 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_parameterGroup2255 = new BitSet(new long[]{0x0004200000028000L,0x0000000008020000L});
	public static final BitSet FOLLOW_typeIdentifier_in_parameterGroup2259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_identifierList2290 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_identifierList2294 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_identifierList2296 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_constant_in_constList2327 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_constList2331 = new BitSet(new long[]{0x2000200000040000L,0x0000000010000230L});
	public static final BitSet FOLLOW_constant_in_constList2333 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration2364 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_functionDeclaration2367 = new BitSet(new long[]{0x0400000000080000L});
	public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration2370 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_functionDeclaration2374 = new BitSet(new long[]{0x0004200000028000L,0x0000000008020000L});
	public static final BitSet FOLLOW_resultType_in_functionDeclaration2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_functionDeclaration2379 = new BitSet(new long[]{0x0011010000802000L,0x0000003080000800L});
	public static final BitSet FOLLOW_block_in_functionDeclaration2388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeIdentifier_in_resultType2405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_statement2422 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_statement2424 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080000L});
	public static final BitSet FOLLOW_unlabelledStatement_in_statement2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unlabelledStatement_in_statement2435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleStatement_in_unlabelledStatement2452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_structuredStatement_in_unlabelledStatement2460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStatement_in_simpleStatement2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureStatement_in_simpleStatement2485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotoStatement_in_simpleStatement2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyStatement_in_simpleStatement2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_assignmentStatement2518 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ASSIGN_in_assignmentStatement2520 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_assignmentStatement2523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_variable2544 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_variable2547 = new BitSet(new long[]{0x0060000008000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_identifier_in_variable2558 = new BitSet(new long[]{0x0060000008000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACK_in_variable2576 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_variable2579 = new BitSet(new long[]{0x0000000000100000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_variable2583 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_variable2586 = new BitSet(new long[]{0x0000000000100000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACK_in_variable2590 = new BitSet(new long[]{0x0060000008000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACK2_in_variable2601 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_variable2604 = new BitSet(new long[]{0x0000000000100000L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_variable2608 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_variable2611 = new BitSet(new long[]{0x0000000000100000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACK2_in_variable2615 = new BitSet(new long[]{0x0060000008000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_variable2626 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_variable2629 = new BitSet(new long[]{0x0060000008000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_POINTER_in_variable2639 = new BitSet(new long[]{0x0060000008000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_simpleExpression_in_expression2666 = new BitSet(new long[]{0x0902140200000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_EQUAL_in_expression2674 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_NOT_EQUAL_in_expression2679 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_LT_in_expression2684 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_LE_in_expression2689 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_GE_in_expression2694 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_GT_in_expression2699 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_IN_in_expression2704 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_simpleExpression_in_expression2708 = new BitSet(new long[]{0x0902140200000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_term_in_simpleExpression2728 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_PLUS_in_simpleExpression2733 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_MINUS_in_simpleExpression2738 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_OR_in_simpleExpression2743 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_term_in_simpleExpression2747 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_signedFactor_in_term2764 = new BitSet(new long[]{0x4000000002000022L,0x0000000006000000L});
	public static final BitSet FOLLOW_STAR_in_term2769 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_SLASH_in_term2774 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_DIV_in_term2779 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_MOD_in_term2784 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_AND_in_term2789 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_signedFactor_in_term2793 = new BitSet(new long[]{0x4000000002000022L,0x0000000006000000L});
	public static final BitSet FOLLOW_PLUS_in_signedFactor2814 = new BitSet(new long[]{0x0460200000041000L,0x0000000010000035L});
	public static final BitSet FOLLOW_MINUS_in_signedFactor2817 = new BitSet(new long[]{0x0460200000041000L,0x0000000010000035L});
	public static final BitSet FOLLOW_factor_in_signedFactor2822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_factor2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_factor2847 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_factor2850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_factor2852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDesignator_in_factor2861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unsignedConstant_in_factor2869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_factor2885 = new BitSet(new long[]{0x0460200000041000L,0x0000000010000035L});
	public static final BitSet FOLLOW_factor_in_factor2888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unsignedNumber_in_unsignedConstant2905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantChr_in_unsignedConstant2913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_unsignedConstant2930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NIL_in_unsignedConstant2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionDesignator2958 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_functionDesignator2960 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_parameterList_in_functionDesignator2964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_functionDesignator2966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualParameter_in_parameterList2997 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_parameterList3001 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_actualParameter_in_parameterList3003 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_LBRACK_in_set3034 = new BitSet(new long[]{0x2460200000041000L,0x0000000010004235L});
	public static final BitSet FOLLOW_elementList_in_set3036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACK_in_set3038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK2_in_set3056 = new BitSet(new long[]{0x2460200000041000L,0x0000000010008235L});
	public static final BitSet FOLLOW_elementList_in_set3058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACK2_in_set3060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_element_in_elementList3087 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_elementList3091 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_element_in_elementList3094 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_expression_in_element3120 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOTDOT_in_element3124 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_element3127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_procedureStatement3149 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_procedureStatement3153 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_parameterList_in_procedureStatement3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RPAREN_in_procedureStatement3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_actualParameter3193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GOTO_in_gotoStatement3210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_label_in_gotoStatement3213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundStatement_in_structuredStatement3262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalStatement_in_structuredStatement3270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repetetiveStatement_in_structuredStatement3278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_structuredStatement3286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_compoundStatement3303 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statements_in_compoundStatement3308 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_END_in_compoundStatement3316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements3334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_statements3338 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statement_in_statements3340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_ifStatement_in_conditionalStatement3371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_conditionalStatement3379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement3396 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_ifStatement3399 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_THEN_in_ifStatement3401 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statement_in_ifStatement3404 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatement3431 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statement_in_ifStatement3434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseStatement3458 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_caseStatement3461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_OF_in_caseStatement3463 = new BitSet(new long[]{0x2000200000040000L,0x0000000010000230L});
	public static final BitSet FOLLOW_caseListElement_in_caseStatement3474 = new BitSet(new long[]{0x0000000100000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_caseStatement3478 = new BitSet(new long[]{0x2000200000040000L,0x0000000010000230L});
	public static final BitSet FOLLOW_caseListElement_in_caseStatement3481 = new BitSet(new long[]{0x0000000100000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SEMI_in_caseStatement3494 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ELSE_in_caseStatement3497 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statements_in_caseStatement3500 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_END_in_caseStatement3511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constList_in_caseListElement3529 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_caseListElement3531 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statement_in_caseListElement3534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_repetetiveStatement3551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_repetetiveStatement3559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_repetetiveStatement3567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement3584 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_whileStatement3587 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DO_in_whileStatement3589 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statement_in_whileStatement3592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEAT_in_repeatStatement3609 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statements_in_repeatStatement3612 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_UNTIL_in_repeatStatement3614 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_expression_in_repeatStatement3617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStatement3634 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_identifier_in_forStatement3637 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ASSIGN_in_forStatement3639 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_forList_in_forStatement3642 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DO_in_forStatement3644 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statement_in_forStatement3647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initialValue_in_forList3664 = new BitSet(new long[]{0x0000000020000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_TO_in_forList3667 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_DOWNTO_in_forList3672 = new BitSet(new long[]{0x2460200000041000L,0x0000000010000235L});
	public static final BitSet FOLLOW_finalValue_in_forList3676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_initialValue3693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_finalValue3710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withStatement3727 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_recordVariableList_in_withStatement3730 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DO_in_withStatement3732 = new BitSet(new long[]{0x0000A84000013000L,0x00000C0000080010L});
	public static final BitSet FOLLOW_statement_in_withStatement3735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_recordVariableList3752 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_recordVariableList3756 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_variable_in_recordVariableList3759 = new BitSet(new long[]{0x0000000000100002L});
}
