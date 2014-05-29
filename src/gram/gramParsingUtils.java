package gram;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ee.ut.cs.akt.aktk.ast.AstNode;

public class gramParsingUtils {
	static public AstNode createAst(String program) {
		ParseTree tree = createParseTree(program);
		//System.out.println("siia küll jõudsin");
		gramVisitor<AstNode> visitor = new gramAstCreationVisitor();
		return tree.accept(visitor);
	}
	
	
	private static ParseTree createParseTree(String program) {
		ANTLRInputStream antlrInput = new ANTLRInputStream(program);
		gramLexer lexer = new gramLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramParser parser = new gramParser(tokens);
        ParseTree tree = parser.program();
		//System.out.println("siia küll jõudsin");
        //System.out.println(tree.toStringTree(parser));
        return tree;
	}
	
}
