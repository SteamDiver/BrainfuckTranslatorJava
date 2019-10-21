package com.company;

import com.company.classes.PascalAST;
import com.company.classes.pascalLexer;
import com.company.classes.pascalParser;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;


public class Main {

    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if ( args.length>0 ) {
            input = new ANTLRFileStream(args[0]);
        }
        else {
            input = new ANTLRInputStream(System.in);
        }

        pascalLexer lexer = new pascalLexer(input);
        pascalParser parser = new pascalParser(new CommonTokenStream(lexer));
        var tree = parser.program().getTree();

        AstNodePrinter.Print(tree);
        /*DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        System.out.println(st);*/


    }
}
