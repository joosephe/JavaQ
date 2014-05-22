import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
 
import gram.gramLexer;
import gram.gramParser;

public class random {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asd = "circuit bool tere() { tere() ; }";
		createParseTree(asd);
	}
	private static ParseTree createParseTree(String program) {
	    ANTLRInputStream antlrInput = new ANTLRInputStream(program);
	    gramLexer lexer = new gramLexer(antlrInput);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    gramParser parser = new gramParser(tokens);
	    ParseTree tree = parser.program();
	    System.out.println(tree.toStringTree(parser));
	    return tree;
	}
}
