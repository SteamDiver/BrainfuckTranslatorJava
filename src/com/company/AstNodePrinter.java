package com.company;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import javax.sound.sampled.AudioFormat;

public class AstNodePrinter
{
    public static char ConnectChar    = '|',
        MiddleNodeChar = '*',
        LastNodeChar   = '-';


    private static String getStringSubTree(CommonTree node, String indent, boolean root) {
        if (node == null)
            return "";

        String result = indent;
        if (!root)
            if(node.childIndex < node.parent.getChildCount() - 1) {
                result += MiddleNodeChar + " ";
                indent += ConnectChar + " ";
            }
            else {
                result += LastNodeChar + " ";
                indent += "  ";
            }
        result += node + "\n";
        for(int i = 0; i < node.getChildCount(); i++)
            result += getStringSubTree((CommonTree) node.getChild(i), indent, false);

        return result;
    }


    public static String astNodeToAdvancedDosStringTree(CommonTree node) {
        return getStringSubTree(node, "", true);
    }


    public static void Print(Tree node) {
        String tree = astNodeToAdvancedDosStringTree((CommonTree)node);
        System.out.println(tree);
    }
}
