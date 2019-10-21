package com.company.classes;//import antlr.CommonTree;
import java.io.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;
public class PascalAST extends CommonTree {
	 
	Symbol symbol;
	   //public Type type;

	   public PascalAST() {
	      super();
	 //     type = null;
	   }

	   public PascalAST(Token tok) {
	      super(tok);
	   //   type = null;
	   }

	   public PascalAST(PascalAST tree) {
	      super(tree);
//	      this.type = tree.type;
	   }

	  /* public PascalAST(Token tok, Type type) {
	      super(tok);
	      this.type = type;
	   }*/

	   @Override public Tree dupNode() {
	      return new PascalAST(this);
	   }

	/*   @Override public String toString() {
	      final String result;
	      if (type==null) {
	         result = super.toString();
	      } else {
	         result = String.format("%s[%s]",
	                     super.toString(),type.nickName());
	      }
	      return result;
	   }*/
	}


