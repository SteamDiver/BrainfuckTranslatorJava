package com.company.classes;// $ANTLR 3.5.2 .\\antlr\\pascal.g 2019-10-21 20:50:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class pascalLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public pascalLexer() {} 
	public pascalLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public pascalLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return ".\\antlr\\pascal.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:776:18: ( 'and' )
			// .\\antlr\\pascal.g:776:20: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:777:18: ( 'array' )
			// .\\antlr\\pascal.g:777:20: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:778:18: ( 'begin' )
			// .\\antlr\\pascal.g:778:20: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:779:18: ( 'boolean' )
			// .\\antlr\\pascal.g:779:20: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:780:18: ( 'case' )
			// .\\antlr\\pascal.g:780:20: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:781:18: ( 'char' )
			// .\\antlr\\pascal.g:781:20: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "CHR"
	public final void mCHR() throws RecognitionException {
		try {
			int _type = CHR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:782:18: ( 'chr' )
			// .\\antlr\\pascal.g:782:20: 'chr'
			{
			match("chr"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHR"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:783:18: ( 'const' )
			// .\\antlr\\pascal.g:783:20: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:784:18: ( 'div' )
			// .\\antlr\\pascal.g:784:20: 'div'
			{
			match("div"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:785:18: ( 'do' )
			// .\\antlr\\pascal.g:785:20: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DOWNTO"
	public final void mDOWNTO() throws RecognitionException {
		try {
			int _type = DOWNTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:786:18: ( 'downto' )
			// .\\antlr\\pascal.g:786:20: 'downto'
			{
			match("downto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOWNTO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:787:18: ( 'else' )
			// .\\antlr\\pascal.g:787:20: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:788:18: ( 'end' )
			// .\\antlr\\pascal.g:788:20: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FILE"
	public final void mFILE() throws RecognitionException {
		try {
			int _type = FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:789:18: ( 'file' )
			// .\\antlr\\pascal.g:789:20: 'file'
			{
			match("file"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:790:18: ( 'for' )
			// .\\antlr\\pascal.g:790:20: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:791:18: ( 'function' )
			// .\\antlr\\pascal.g:791:20: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "GOTO"
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:792:18: ( 'goto' )
			// .\\antlr\\pascal.g:792:20: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOTO"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:793:18: ( 'if' )
			// .\\antlr\\pascal.g:793:20: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:794:18: ( 'in' )
			// .\\antlr\\pascal.g:794:20: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:795:18: ( 'integer' )
			// .\\antlr\\pascal.g:795:20: 'integer'
			{
			match("integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "LABEL"
	public final void mLABEL() throws RecognitionException {
		try {
			int _type = LABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:796:18: ( 'label' )
			// .\\antlr\\pascal.g:796:20: 'label'
			{
			match("label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LABEL"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:797:18: ( 'mod' )
			// .\\antlr\\pascal.g:797:20: 'mod'
			{
			match("mod"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NIL"
	public final void mNIL() throws RecognitionException {
		try {
			int _type = NIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:798:18: ( 'nil' )
			// .\\antlr\\pascal.g:798:20: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NIL"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:799:18: ( 'not' )
			// .\\antlr\\pascal.g:799:20: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OF"
	public final void mOF() throws RecognitionException {
		try {
			int _type = OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:800:18: ( 'of' )
			// .\\antlr\\pascal.g:800:20: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OF"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:801:18: ( 'or' )
			// .\\antlr\\pascal.g:801:20: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PACKED"
	public final void mPACKED() throws RecognitionException {
		try {
			int _type = PACKED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:802:18: ( 'packed' )
			// .\\antlr\\pascal.g:802:20: 'packed'
			{
			match("packed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKED"

	// $ANTLR start "PROCEDURE"
	public final void mPROCEDURE() throws RecognitionException {
		try {
			int _type = PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:803:18: ( 'procedure' )
			// .\\antlr\\pascal.g:803:20: 'procedure'
			{
			match("procedure"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROCEDURE"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:804:18: ( 'program' )
			// .\\antlr\\pascal.g:804:20: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			int _type = REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:805:18: ( 'real' )
			// .\\antlr\\pascal.g:805:20: 'real'
			{
			match("real"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "RECORD"
	public final void mRECORD() throws RecognitionException {
		try {
			int _type = RECORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:806:18: ( 'record' )
			// .\\antlr\\pascal.g:806:20: 'record'
			{
			match("record"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECORD"

	// $ANTLR start "REPEAT"
	public final void mREPEAT() throws RecognitionException {
		try {
			int _type = REPEAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:807:18: ( 'repeat' )
			// .\\antlr\\pascal.g:807:20: 'repeat'
			{
			match("repeat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPEAT"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:808:18: ( 'set' )
			// .\\antlr\\pascal.g:808:20: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:809:18: ( 'then' )
			// .\\antlr\\pascal.g:809:20: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:810:18: ( 'to' )
			// .\\antlr\\pascal.g:810:20: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:811:18: ( 'type' )
			// .\\antlr\\pascal.g:811:20: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "UNTIL"
	public final void mUNTIL() throws RecognitionException {
		try {
			int _type = UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:812:18: ( 'until' )
			// .\\antlr\\pascal.g:812:20: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNTIL"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:813:18: ( 'var' )
			// .\\antlr\\pascal.g:813:20: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:814:18: ( 'while' )
			// .\\antlr\\pascal.g:814:20: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "WITH"
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:815:18: ( 'with' )
			// .\\antlr\\pascal.g:815:20: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITH"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:820:17: ( '+' )
			// .\\antlr\\pascal.g:820:19: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:821:17: ( '-' )
			// .\\antlr\\pascal.g:821:19: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:822:17: ( '*' )
			// .\\antlr\\pascal.g:822:19: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:823:17: ( '/' )
			// .\\antlr\\pascal.g:823:19: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:824:17: ( ':=' )
			// .\\antlr\\pascal.g:824:19: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:825:17: ( ',' )
			// .\\antlr\\pascal.g:825:19: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:826:17: ( ';' )
			// .\\antlr\\pascal.g:826:19: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:827:17: ( ':' )
			// .\\antlr\\pascal.g:827:19: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:828:17: ( '=' )
			// .\\antlr\\pascal.g:828:19: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "NOT_EQUAL"
	public final void mNOT_EQUAL() throws RecognitionException {
		try {
			int _type = NOT_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:829:17: ( '<>' )
			// .\\antlr\\pascal.g:829:19: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUAL"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:830:17: ( '<' )
			// .\\antlr\\pascal.g:830:19: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:831:17: ( '<=' )
			// .\\antlr\\pascal.g:831:19: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:832:17: ( '>=' )
			// .\\antlr\\pascal.g:832:19: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:833:17: ( '>' )
			// .\\antlr\\pascal.g:833:19: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:834:17: ( '(' )
			// .\\antlr\\pascal.g:834:19: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:835:17: ( ')' )
			// .\\antlr\\pascal.g:835:19: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:836:17: ( '[' )
			// .\\antlr\\pascal.g:836:19: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "LBRACK2"
	public final void mLBRACK2() throws RecognitionException {
		try {
			int _type = LBRACK2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:837:17: ( '(.' )
			// .\\antlr\\pascal.g:837:19: '(.'
			{
			match("(."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK2"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:838:17: ( ']' )
			// .\\antlr\\pascal.g:838:19: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "RBRACK2"
	public final void mRBRACK2() throws RecognitionException {
		try {
			int _type = RBRACK2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:839:17: ( '.)' )
			// .\\antlr\\pascal.g:839:19: '.)'
			{
			match(".)"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK2"

	// $ANTLR start "POINTER"
	public final void mPOINTER() throws RecognitionException {
		try {
			int _type = POINTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:840:17: ( '^' )
			// .\\antlr\\pascal.g:840:19: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINTER"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:841:17: ( '@' )
			// .\\antlr\\pascal.g:841:19: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:842:17: ( '.' )
			// .\\antlr\\pascal.g:842:19: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "DOTDOT"
	public final void mDOTDOT() throws RecognitionException {
		try {
			int _type = DOTDOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:844:2: ( '..' )
			// .\\antlr\\pascal.g:844:5: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTDOT"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:845:17: ( '{' )
			// .\\antlr\\pascal.g:845:19: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:846:17: ( '}' )
			// .\\antlr\\pascal.g:846:19: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "UNIT"
	public final void mUNIT() throws RecognitionException {
		try {
			int _type = UNIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:847:17: ( 'unit' )
			// .\\antlr\\pascal.g:847:19: 'unit'
			{
			match("unit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIT"

	// $ANTLR start "INTERFACE"
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:848:17: ( 'interface' )
			// .\\antlr\\pascal.g:848:19: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERFACE"

	// $ANTLR start "USES"
	public final void mUSES() throws RecognitionException {
		try {
			int _type = USES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:849:17: ( 'uses' )
			// .\\antlr\\pascal.g:849:19: 'uses'
			{
			match("uses"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USES"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:850:17: ( 'string' )
			// .\\antlr\\pascal.g:850:19: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "IMPLEMENTATION"
	public final void mIMPLEMENTATION() throws RecognitionException {
		try {
			int _type = IMPLEMENTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:851:17: ( 'implementation' )
			// .\\antlr\\pascal.g:851:19: 'implementation'
			{
			match("implementation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLEMENTATION"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:855:9: ( ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) ) )
			// .\\antlr\\pascal.g:855:11: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
			{
			// .\\antlr\\pascal.g:855:11: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
			int alt2=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt2=1;
				}
				break;
			case '\t':
				{
				alt2=2;
				}
				break;
			case '\f':
				{
				alt2=3;
				}
				break;
			case '\n':
			case '\r':
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// .\\antlr\\pascal.g:855:13: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:856:5: '\\t'
					{
					match('\t'); 
					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:857:5: '\\f'
					{
					match('\f'); 
					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:859:5: ( '\\r\\n' | '\\r' | '\\n' )
					{
					// .\\antlr\\pascal.g:859:5: ( '\\r\\n' | '\\r' | '\\n' )
					int alt1=3;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='\r') ) {
						int LA1_1 = input.LA(2);
						if ( (LA1_1=='\n') ) {
							alt1=1;
						}

						else {
							alt1=2;
						}

					}
					else if ( (LA1_0=='\n') ) {
						alt1=3;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// .\\antlr\\pascal.g:859:7: '\\r\\n'
							{
							match("\r\n"); 

							}
							break;
						case 2 :
							// .\\antlr\\pascal.g:860:6: '\\r'
							{
							match('\r'); 
							}
							break;
						case 3 :
							// .\\antlr\\pascal.g:861:6: '\\n'
							{
							match('\n'); 
							}
							break;

					}

					 //newline(); 
								
					}
					break;

			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT_1"
	public final void mCOMMENT_1() throws RecognitionException {
		try {
			int _type = COMMENT_1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:871:9: ( '(*' ({...}? '*' | '\\r' '\\n' | '\\r' | '\\n' |~ ( '*' | '\\n' | '\\r' ) )* '*)' )
			// .\\antlr\\pascal.g:871:11: '(*' ({...}? '*' | '\\r' '\\n' | '\\r' | '\\n' |~ ( '*' | '\\n' | '\\r' ) )* '*)'
			{
			match("(*"); 

			// .\\antlr\\pascal.g:872:12: ({...}? '*' | '\\r' '\\n' | '\\r' | '\\n' |~ ( '*' | '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=6;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='*') ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==')') ) {
						int LA3_5 = input.LA(3);
						if ( ((LA3_5 >= '\u0000' && LA3_5 <= '\uFFFF')) ) {
							alt3=1;
						}

					}
					else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '(')||(LA3_1 >= '*' && LA3_1 <= '\uFFFF')) ) {
						alt3=1;
					}

				}
				else if ( (LA3_0=='\r') ) {
					int LA3_2 = input.LA(2);
					if ( (LA3_2=='\n') ) {
						alt3=2;
					}
					else if ( ((LA3_2 >= '\u0000' && LA3_2 <= '\t')||(LA3_2 >= '\u000B' && LA3_2 <= '\uFFFF')) ) {
						alt3=3;
					}

				}
				else if ( (LA3_0=='\n') ) {
					alt3=4;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
					alt3=5;
				}

				switch (alt3) {
				case 1 :
					// .\\antlr\\pascal.g:874:8: {...}? '*'
					{
					if ( !((input.LA(2) != ')' )) ) {
						throw new FailedPredicateException(input, "COMMENT_1", "input.LA(2) != ')' ");
					}
					match('*'); 
					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:875:8: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:876:8: '\\r'
					{
					match('\r'); 
					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:877:8: '\\n'
					{
					match('\n'); 
					}
					break;
				case 5 :
					// .\\antlr\\pascal.g:878:16: ~ ( '*' | '\\n' | '\\r' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			match("*)"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT_1"

	// $ANTLR start "COMMENT_2"
	public final void mCOMMENT_2() throws RecognitionException {
		try {
			int _type = COMMENT_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:885:9: ( '{' ( '\\r' '\\n' | '\\r' | '\\n' |~ ( '}' | '\\n' | '\\r' ) )* '}' )
			// .\\antlr\\pascal.g:885:12: '{' ( '\\r' '\\n' | '\\r' | '\\n' |~ ( '}' | '\\n' | '\\r' ) )* '}'
			{
			match('{'); 
			// .\\antlr\\pascal.g:886:12: ( '\\r' '\\n' | '\\r' | '\\n' |~ ( '}' | '\\n' | '\\r' ) )*
			loop4:
			while (true) {
				int alt4=5;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\r') ) {
					int LA4_2 = input.LA(2);
					if ( (LA4_2=='\n') ) {
						alt4=1;
					}
					else if ( ((LA4_2 >= '\u0000' && LA4_2 <= '\t')||(LA4_2 >= '\u000B' && LA4_2 <= '\uFFFF')) ) {
						alt4=2;
					}

				}
				else if ( (LA4_0=='\n') ) {
					alt4=3;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '|')||(LA4_0 >= '~' && LA4_0 <= '\uFFFF')) ) {
					alt4=4;
				}

				switch (alt4) {
				case 1 :
					// .\\antlr\\pascal.g:888:17: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:889:9: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// .\\antlr\\pascal.g:890:9: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// .\\antlr\\pascal.g:891:17: ~ ( '}' | '\\n' | '\\r' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '|')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('}'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT_2"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:902:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// .\\antlr\\pascal.g:902:4: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// .\\antlr\\pascal.g:902:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// .\\antlr\\pascal.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:907:2: ( '\\'' ( '\\'\\'' |~ ( '\\'' ) )* '\\'' )
			// .\\antlr\\pascal.g:907:4: '\\'' ( '\\'\\'' |~ ( '\\'' ) )* '\\''
			{
			match('\''); 
			// .\\antlr\\pascal.g:907:9: ( '\\'\\'' |~ ( '\\'' ) )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\'') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='\'') ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// .\\antlr\\pascal.g:907:10: '\\'\\''
					{
					match("''"); 

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:907:19: ~ ( '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "NUM_INT"
	public final void mNUM_INT() throws RecognitionException {
		try {
			int _type = NUM_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\antlr\\pascal.g:923:2: ( ( '0' .. '9' )+ ( ({...}? '.' ( '0' .. '9' )+ ( EXPONENT )? )? | EXPONENT ) )
			// .\\antlr\\pascal.g:923:4: ( '0' .. '9' )+ ( ({...}? '.' ( '0' .. '9' )+ ( EXPONENT )? )? | EXPONENT )
			{
			// .\\antlr\\pascal.g:923:4: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// .\\antlr\\pascal.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			// .\\antlr\\pascal.g:924:3: ( ({...}? '.' ( '0' .. '9' )+ ( EXPONENT )? )? | EXPONENT )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='e') ) {
				alt11=2;
			}

			else {
				alt11=1;
			}

			switch (alt11) {
				case 1 :
					// .\\antlr\\pascal.g:924:5: ({...}? '.' ( '0' .. '9' )+ ( EXPONENT )? )?
					{
					// .\\antlr\\pascal.g:924:5: ({...}? '.' ( '0' .. '9' )+ ( EXPONENT )? )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='.') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// .\\antlr\\pascal.g:924:7: {...}? '.' ( '0' .. '9' )+ ( EXPONENT )?
							{
							if ( !(((input.LA(2)!='.')&&(input.LA(2)!=')'))) ) {
								throw new FailedPredicateException(input, "NUM_INT", "(input.LA(2)!='.')&&(input.LA(2)!=')')");
							}
							match('.'); 
							_type = NUM_REAL;
							// .\\antlr\\pascal.g:927:5: ( '0' .. '9' )+
							int cnt8=0;
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// .\\antlr\\pascal.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt8 >= 1 ) break loop8;
									EarlyExitException eee = new EarlyExitException(8, input);
									throw eee;
								}
								cnt8++;
							}

							// .\\antlr\\pascal.g:927:17: ( EXPONENT )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0=='e') ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// .\\antlr\\pascal.g:927:18: EXPONENT
									{
									mEXPONENT(); 

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// .\\antlr\\pascal.g:929:5: EXPONENT
					{
					mEXPONENT(); 

					_type=NUM_REAL;
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_INT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// .\\antlr\\pascal.g:931:2: ( ( 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// .\\antlr\\pascal.g:931:4: ( 'e' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			// .\\antlr\\pascal.g:931:4: ( 'e' )
			// .\\antlr\\pascal.g:931:5: 'e'
			{
			match('e'); 
			}

			// .\\antlr\\pascal.g:931:10: ( '+' | '-' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='+'||LA12_0=='-') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// .\\antlr\\pascal.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// .\\antlr\\pascal.g:931:21: ( '0' .. '9' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// .\\antlr\\pascal.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	@Override
	public void mTokens() throws RecognitionException {
		// .\\antlr\\pascal.g:1:8: ( AND | ARRAY | BEGIN | BOOLEAN | CASE | CHAR | CHR | CONST | DIV | DO | DOWNTO | ELSE | END | FILE | FOR | FUNCTION | GOTO | IF | IN | INTEGER | LABEL | MOD | NIL | NOT | OF | OR | PACKED | PROCEDURE | PROGRAM | REAL | RECORD | REPEAT | SET | THEN | TO | TYPE | UNTIL | VAR | WHILE | WITH | PLUS | MINUS | STAR | SLASH | ASSIGN | COMMA | SEMI | COLON | EQUAL | NOT_EQUAL | LT | LE | GE | GT | LPAREN | RPAREN | LBRACK | LBRACK2 | RBRACK | RBRACK2 | POINTER | AT | DOT | DOTDOT | LCURLY | RCURLY | UNIT | INTERFACE | USES | STRING | IMPLEMENTATION | WS | COMMENT_1 | COMMENT_2 | IDENT | STRING_LITERAL | NUM_INT )
		int alt14=77;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// .\\antlr\\pascal.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// .\\antlr\\pascal.g:1:14: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 3 :
				// .\\antlr\\pascal.g:1:20: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 4 :
				// .\\antlr\\pascal.g:1:26: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 5 :
				// .\\antlr\\pascal.g:1:34: CASE
				{
				mCASE(); 

				}
				break;
			case 6 :
				// .\\antlr\\pascal.g:1:39: CHAR
				{
				mCHAR(); 

				}
				break;
			case 7 :
				// .\\antlr\\pascal.g:1:44: CHR
				{
				mCHR(); 

				}
				break;
			case 8 :
				// .\\antlr\\pascal.g:1:48: CONST
				{
				mCONST(); 

				}
				break;
			case 9 :
				// .\\antlr\\pascal.g:1:54: DIV
				{
				mDIV(); 

				}
				break;
			case 10 :
				// .\\antlr\\pascal.g:1:58: DO
				{
				mDO(); 

				}
				break;
			case 11 :
				// .\\antlr\\pascal.g:1:61: DOWNTO
				{
				mDOWNTO(); 

				}
				break;
			case 12 :
				// .\\antlr\\pascal.g:1:68: ELSE
				{
				mELSE(); 

				}
				break;
			case 13 :
				// .\\antlr\\pascal.g:1:73: END
				{
				mEND(); 

				}
				break;
			case 14 :
				// .\\antlr\\pascal.g:1:77: FILE
				{
				mFILE(); 

				}
				break;
			case 15 :
				// .\\antlr\\pascal.g:1:82: FOR
				{
				mFOR(); 

				}
				break;
			case 16 :
				// .\\antlr\\pascal.g:1:86: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 17 :
				// .\\antlr\\pascal.g:1:95: GOTO
				{
				mGOTO(); 

				}
				break;
			case 18 :
				// .\\antlr\\pascal.g:1:100: IF
				{
				mIF(); 

				}
				break;
			case 19 :
				// .\\antlr\\pascal.g:1:103: IN
				{
				mIN(); 

				}
				break;
			case 20 :
				// .\\antlr\\pascal.g:1:106: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 21 :
				// .\\antlr\\pascal.g:1:114: LABEL
				{
				mLABEL(); 

				}
				break;
			case 22 :
				// .\\antlr\\pascal.g:1:120: MOD
				{
				mMOD(); 

				}
				break;
			case 23 :
				// .\\antlr\\pascal.g:1:124: NIL
				{
				mNIL(); 

				}
				break;
			case 24 :
				// .\\antlr\\pascal.g:1:128: NOT
				{
				mNOT(); 

				}
				break;
			case 25 :
				// .\\antlr\\pascal.g:1:132: OF
				{
				mOF(); 

				}
				break;
			case 26 :
				// .\\antlr\\pascal.g:1:135: OR
				{
				mOR(); 

				}
				break;
			case 27 :
				// .\\antlr\\pascal.g:1:138: PACKED
				{
				mPACKED(); 

				}
				break;
			case 28 :
				// .\\antlr\\pascal.g:1:145: PROCEDURE
				{
				mPROCEDURE(); 

				}
				break;
			case 29 :
				// .\\antlr\\pascal.g:1:155: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 30 :
				// .\\antlr\\pascal.g:1:163: REAL
				{
				mREAL(); 

				}
				break;
			case 31 :
				// .\\antlr\\pascal.g:1:168: RECORD
				{
				mRECORD(); 

				}
				break;
			case 32 :
				// .\\antlr\\pascal.g:1:175: REPEAT
				{
				mREPEAT(); 

				}
				break;
			case 33 :
				// .\\antlr\\pascal.g:1:182: SET
				{
				mSET(); 

				}
				break;
			case 34 :
				// .\\antlr\\pascal.g:1:186: THEN
				{
				mTHEN(); 

				}
				break;
			case 35 :
				// .\\antlr\\pascal.g:1:191: TO
				{
				mTO(); 

				}
				break;
			case 36 :
				// .\\antlr\\pascal.g:1:194: TYPE
				{
				mTYPE(); 

				}
				break;
			case 37 :
				// .\\antlr\\pascal.g:1:199: UNTIL
				{
				mUNTIL(); 

				}
				break;
			case 38 :
				// .\\antlr\\pascal.g:1:205: VAR
				{
				mVAR(); 

				}
				break;
			case 39 :
				// .\\antlr\\pascal.g:1:209: WHILE
				{
				mWHILE(); 

				}
				break;
			case 40 :
				// .\\antlr\\pascal.g:1:215: WITH
				{
				mWITH(); 

				}
				break;
			case 41 :
				// .\\antlr\\pascal.g:1:220: PLUS
				{
				mPLUS(); 

				}
				break;
			case 42 :
				// .\\antlr\\pascal.g:1:225: MINUS
				{
				mMINUS(); 

				}
				break;
			case 43 :
				// .\\antlr\\pascal.g:1:231: STAR
				{
				mSTAR(); 

				}
				break;
			case 44 :
				// .\\antlr\\pascal.g:1:236: SLASH
				{
				mSLASH(); 

				}
				break;
			case 45 :
				// .\\antlr\\pascal.g:1:242: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 46 :
				// .\\antlr\\pascal.g:1:249: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 47 :
				// .\\antlr\\pascal.g:1:255: SEMI
				{
				mSEMI(); 

				}
				break;
			case 48 :
				// .\\antlr\\pascal.g:1:260: COLON
				{
				mCOLON(); 

				}
				break;
			case 49 :
				// .\\antlr\\pascal.g:1:266: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 50 :
				// .\\antlr\\pascal.g:1:272: NOT_EQUAL
				{
				mNOT_EQUAL(); 

				}
				break;
			case 51 :
				// .\\antlr\\pascal.g:1:282: LT
				{
				mLT(); 

				}
				break;
			case 52 :
				// .\\antlr\\pascal.g:1:285: LE
				{
				mLE(); 

				}
				break;
			case 53 :
				// .\\antlr\\pascal.g:1:288: GE
				{
				mGE(); 

				}
				break;
			case 54 :
				// .\\antlr\\pascal.g:1:291: GT
				{
				mGT(); 

				}
				break;
			case 55 :
				// .\\antlr\\pascal.g:1:294: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 56 :
				// .\\antlr\\pascal.g:1:301: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 57 :
				// .\\antlr\\pascal.g:1:308: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 58 :
				// .\\antlr\\pascal.g:1:315: LBRACK2
				{
				mLBRACK2(); 

				}
				break;
			case 59 :
				// .\\antlr\\pascal.g:1:323: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 60 :
				// .\\antlr\\pascal.g:1:330: RBRACK2
				{
				mRBRACK2(); 

				}
				break;
			case 61 :
				// .\\antlr\\pascal.g:1:338: POINTER
				{
				mPOINTER(); 

				}
				break;
			case 62 :
				// .\\antlr\\pascal.g:1:346: AT
				{
				mAT(); 

				}
				break;
			case 63 :
				// .\\antlr\\pascal.g:1:349: DOT
				{
				mDOT(); 

				}
				break;
			case 64 :
				// .\\antlr\\pascal.g:1:353: DOTDOT
				{
				mDOTDOT(); 

				}
				break;
			case 65 :
				// .\\antlr\\pascal.g:1:360: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 66 :
				// .\\antlr\\pascal.g:1:367: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 67 :
				// .\\antlr\\pascal.g:1:374: UNIT
				{
				mUNIT(); 

				}
				break;
			case 68 :
				// .\\antlr\\pascal.g:1:379: INTERFACE
				{
				mINTERFACE(); 

				}
				break;
			case 69 :
				// .\\antlr\\pascal.g:1:389: USES
				{
				mUSES(); 

				}
				break;
			case 70 :
				// .\\antlr\\pascal.g:1:394: STRING
				{
				mSTRING(); 

				}
				break;
			case 71 :
				// .\\antlr\\pascal.g:1:401: IMPLEMENTATION
				{
				mIMPLEMENTATION(); 

				}
				break;
			case 72 :
				// .\\antlr\\pascal.g:1:416: WS
				{
				mWS(); 

				}
				break;
			case 73 :
				// .\\antlr\\pascal.g:1:419: COMMENT_1
				{
				mCOMMENT_1(); 

				}
				break;
			case 74 :
				// .\\antlr\\pascal.g:1:429: COMMENT_2
				{
				mCOMMENT_2(); 

				}
				break;
			case 75 :
				// .\\antlr\\pascal.g:1:439: IDENT
				{
				mIDENT(); 

				}
				break;
			case 76 :
				// .\\antlr\\pascal.g:1:445: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 77 :
				// .\\antlr\\pascal.g:1:460: NUM_INT
				{
				mNUM_INT(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\1\uffff\23\50\4\uffff\1\121\3\uffff\1\124\1\126\1\131\3\uffff\1\134\2"+
		"\uffff\1\135\5\uffff\10\50\1\151\6\50\1\160\1\162\5\50\1\170\1\171\6\50"+
		"\1\u0082\6\50\17\uffff\1\u008a\5\50\1\u0090\1\50\1\u0092\1\50\1\uffff"+
		"\1\50\1\u0095\1\50\1\u0097\2\50\1\uffff\1\50\1\uffff\2\50\1\u009d\1\u009e"+
		"\1\u009f\2\uffff\5\50\1\u00a6\2\50\1\uffff\4\50\1\u00ad\2\50\1\uffff\3"+
		"\50\1\u00b3\1\u00b4\1\uffff\1\50\1\uffff\1\50\1\u00b7\1\uffff\1\u00b8"+
		"\1\uffff\1\50\1\u00ba\3\50\3\uffff\3\50\1\u00c2\2\50\1\uffff\1\50\1\u00c6"+
		"\1\u00c7\1\50\1\u00c9\1\u00ca\1\uffff\1\50\1\u00cc\1\u00cd\1\u00ce\1\50"+
		"\2\uffff\1\u00d0\1\50\2\uffff\1\50\1\uffff\3\50\1\u00d6\3\50\1\uffff\3"+
		"\50\2\uffff\1\u00dd\2\uffff\1\u00de\3\uffff\1\50\1\uffff\1\u00e0\4\50"+
		"\1\uffff\1\u00e5\2\50\1\u00e8\1\u00e9\1\u00ea\2\uffff\1\u00eb\1\uffff"+
		"\1\50\1\u00ed\2\50\1\uffff\1\50\1\u00f1\4\uffff\1\u00f2\1\uffff\3\50\2"+
		"\uffff\1\u00f6\1\50\1\u00f8\1\uffff\1\50\1\uffff\3\50\1\u00fd\1\uffff";
	static final String DFA14_eofS =
		"\u00fe\uffff";
	static final String DFA14_minS =
		"\1\11\1\156\1\145\1\141\1\151\1\154\1\151\1\157\1\146\1\141\1\157\1\151"+
		"\1\146\1\141\2\145\1\150\1\156\1\141\1\150\4\uffff\1\75\3\uffff\2\75\1"+
		"\52\3\uffff\1\51\2\uffff\1\0\5\uffff\1\144\1\162\1\147\1\157\1\163\1\141"+
		"\1\156\1\166\1\60\1\163\1\144\1\154\1\162\1\156\1\164\2\60\1\160\1\142"+
		"\1\144\1\154\1\164\2\60\1\143\1\157\1\141\1\164\1\162\1\145\1\60\1\160"+
		"\1\151\1\145\1\162\1\151\1\164\17\uffff\1\60\1\141\1\151\1\154\1\145\1"+
		"\162\1\60\1\163\1\60\1\156\1\uffff\1\145\1\60\1\145\1\60\1\143\1\157\1"+
		"\uffff\1\145\1\uffff\1\154\1\145\3\60\2\uffff\1\153\1\143\1\154\1\157"+
		"\1\145\1\60\1\151\1\156\1\uffff\1\145\1\151\1\164\1\163\1\60\1\154\1\150"+
		"\1\uffff\1\171\1\156\1\145\2\60\1\uffff\1\164\1\uffff\1\164\1\60\1\uffff"+
		"\1\60\1\uffff\1\164\1\60\1\147\1\145\1\154\3\uffff\2\145\1\162\1\60\1"+
		"\162\1\141\1\uffff\1\156\2\60\1\154\2\60\1\uffff\1\145\3\60\1\141\2\uffff"+
		"\1\60\1\157\2\uffff\1\151\1\uffff\1\145\1\146\1\155\1\60\2\144\1\141\1"+
		"\uffff\1\144\1\164\1\147\2\uffff\1\60\2\uffff\1\60\3\uffff\1\156\1\uffff"+
		"\1\60\1\157\1\162\1\141\1\145\1\uffff\1\60\1\165\1\155\3\60\2\uffff\1"+
		"\60\1\uffff\1\156\1\60\1\143\1\156\1\uffff\1\162\1\60\4\uffff\1\60\1\uffff"+
		"\1\145\1\164\1\145\2\uffff\1\60\1\141\1\60\1\uffff\1\164\1\uffff\1\151"+
		"\1\157\1\156\1\60\1\uffff";
	static final String DFA14_maxS =
		"\1\175\1\162\3\157\1\156\1\165\1\157\1\156\1\141\2\157\2\162\1\145\1\164"+
		"\1\171\1\163\1\141\1\151\4\uffff\1\75\3\uffff\1\76\1\75\1\56\3\uffff\1"+
		"\56\2\uffff\1\uffff\5\uffff\1\144\1\162\1\147\1\157\1\163\1\162\1\156"+
		"\1\166\1\172\1\163\1\144\1\154\1\162\1\156\1\164\2\172\1\160\1\142\1\144"+
		"\1\154\1\164\2\172\1\143\1\157\1\160\1\164\1\162\1\145\1\172\1\160\1\164"+
		"\1\145\1\162\1\151\1\164\17\uffff\1\172\1\141\1\151\1\154\1\145\1\162"+
		"\1\172\1\163\1\172\1\156\1\uffff\1\145\1\172\1\145\1\172\1\143\1\157\1"+
		"\uffff\1\145\1\uffff\1\154\1\145\3\172\2\uffff\1\153\1\147\1\154\1\157"+
		"\1\145\1\172\1\151\1\156\1\uffff\1\145\1\151\1\164\1\163\1\172\1\154\1"+
		"\150\1\uffff\1\171\1\156\1\145\2\172\1\uffff\1\164\1\uffff\1\164\1\172"+
		"\1\uffff\1\172\1\uffff\1\164\1\172\1\162\1\145\1\154\3\uffff\2\145\1\162"+
		"\1\172\1\162\1\141\1\uffff\1\156\2\172\1\154\2\172\1\uffff\1\145\3\172"+
		"\1\141\2\uffff\1\172\1\157\2\uffff\1\151\1\uffff\1\145\1\146\1\155\1\172"+
		"\2\144\1\141\1\uffff\1\144\1\164\1\147\2\uffff\1\172\2\uffff\1\172\3\uffff"+
		"\1\156\1\uffff\1\172\1\157\1\162\1\141\1\145\1\uffff\1\172\1\165\1\155"+
		"\3\172\2\uffff\1\172\1\uffff\1\156\1\172\1\143\1\156\1\uffff\1\162\1\172"+
		"\4\uffff\1\172\1\uffff\1\145\1\164\1\145\2\uffff\1\172\1\141\1\172\1\uffff"+
		"\1\164\1\uffff\1\151\1\157\1\156\1\172\1\uffff";
	static final String DFA14_acceptS =
		"\24\uffff\1\51\1\52\1\53\1\54\1\uffff\1\56\1\57\1\61\3\uffff\1\70\1\71"+
		"\1\73\1\uffff\1\75\1\76\1\uffff\1\102\1\110\1\113\1\114\1\115\45\uffff"+
		"\1\55\1\60\1\62\1\64\1\63\1\65\1\66\1\72\1\111\1\67\1\74\1\100\1\77\1"+
		"\101\1\112\12\uffff\1\12\6\uffff\1\22\1\uffff\1\23\5\uffff\1\31\1\32\10"+
		"\uffff\1\43\7\uffff\1\1\5\uffff\1\7\1\uffff\1\11\2\uffff\1\15\1\uffff"+
		"\1\17\5\uffff\1\26\1\27\1\30\6\uffff\1\41\6\uffff\1\46\5\uffff\1\5\1\6"+
		"\2\uffff\1\14\1\16\1\uffff\1\21\7\uffff\1\36\3\uffff\1\42\1\44\1\uffff"+
		"\1\103\1\105\1\uffff\1\50\1\2\1\3\1\uffff\1\10\5\uffff\1\25\6\uffff\1"+
		"\45\1\47\1\uffff\1\13\4\uffff\1\33\2\uffff\1\37\1\40\1\106\1\4\1\uffff"+
		"\1\24\3\uffff\1\35\1\20\3\uffff\1\104\1\uffff\1\34\4\uffff\1\107";
	static final String DFA14_specialS =
		"\45\uffff\1\0\u00d8\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\47\1\uffff\2\47\22\uffff\1\47\6\uffff\1\51\1\36\1\37\1\26\1\24\1\31"+
			"\1\25\1\42\1\27\12\52\1\30\1\32\1\34\1\33\1\35\1\uffff\1\44\32\50\1\40"+
			"\1\uffff\1\41\1\43\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\50\1\10\2\50"+
			"\1\11\1\12\1\13\1\14\1\15\1\50\1\16\1\17\1\20\1\21\1\22\1\23\3\50\1\45"+
			"\1\uffff\1\46",
			"\1\53\3\uffff\1\54",
			"\1\55\11\uffff\1\56",
			"\1\57\6\uffff\1\60\6\uffff\1\61",
			"\1\62\5\uffff\1\63",
			"\1\64\1\uffff\1\65",
			"\1\66\5\uffff\1\67\5\uffff\1\70",
			"\1\71",
			"\1\72\6\uffff\1\74\1\73",
			"\1\75",
			"\1\76",
			"\1\77\5\uffff\1\100",
			"\1\101\13\uffff\1\102",
			"\1\103\20\uffff\1\104",
			"\1\105",
			"\1\106\16\uffff\1\107",
			"\1\110\6\uffff\1\111\11\uffff\1\112",
			"\1\113\4\uffff\1\114",
			"\1\115",
			"\1\116\1\117",
			"",
			"",
			"",
			"",
			"\1\120",
			"",
			"",
			"",
			"\1\123\1\122",
			"\1\125",
			"\1\130\3\uffff\1\127",
			"",
			"",
			"",
			"\1\132\4\uffff\1\133",
			"",
			"",
			"\0\136",
			"",
			"",
			"",
			"",
			"",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144\20\uffff\1\145",
			"\1\146",
			"\1\147",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\26\50\1\150\3\50",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\161\6\50",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\172",
			"\1\173",
			"\1\174\1\uffff\1\175\14\uffff\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0083",
			"\1\u0085\12\uffff\1\u0084",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0091",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0093",
			"",
			"\1\u0094",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0096",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0098",
			"\1\u0099",
			"",
			"\1\u009a",
			"",
			"\1\u009b",
			"\1\u009c",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\u00a0",
			"\1\u00a1\3\uffff\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a7",
			"\1\u00a8",
			"",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ae",
			"\1\u00af",
			"",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00b5",
			"",
			"\1\u00b6",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00b9",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00bb\12\uffff\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"",
			"",
			"",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c3",
			"\1\u00c4",
			"",
			"\1\u00c5",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c8",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00cb",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00cf",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d1",
			"",
			"",
			"\1\u00d2",
			"",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			"\1\u00df",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00e6",
			"\1\u00e7",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00ec",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ee",
			"\1\u00ef",
			"",
			"\1\u00f0",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00f7",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00f9",
			"",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ARRAY | BEGIN | BOOLEAN | CASE | CHAR | CHR | CONST | DIV | DO | DOWNTO | ELSE | END | FILE | FOR | FUNCTION | GOTO | IF | IN | INTEGER | LABEL | MOD | NIL | NOT | OF | OR | PACKED | PROCEDURE | PROGRAM | REAL | RECORD | REPEAT | SET | THEN | TO | TYPE | UNTIL | VAR | WHILE | WITH | PLUS | MINUS | STAR | SLASH | ASSIGN | COMMA | SEMI | COLON | EQUAL | NOT_EQUAL | LT | LE | GE | GT | LPAREN | RPAREN | LBRACK | LBRACK2 | RBRACK | RBRACK2 | POINTER | AT | DOT | DOTDOT | LCURLY | RCURLY | UNIT | INTERFACE | USES | STRING | IMPLEMENTATION | WS | COMMENT_1 | COMMENT_2 | IDENT | STRING_LITERAL | NUM_INT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_37 = input.LA(1);
						s = -1;
						if ( ((LA14_37 >= '\u0000' && LA14_37 <= '\uFFFF')) ) {s = 94;}
						else s = 93;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
