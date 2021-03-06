package Internals;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ee.ut.cs.akt.aktk.ast.AstNode;
import gram.gramLexer;
import gram.gramParser;
import gram.gramParsingUtils;

public class random {
	//this probably should be put in its own file
	public static void ComplexTests(){
		Complex zero= new Complex();
		Complex onei = new Complex(1,1);
		Complex twominusi= new Complex(2,-1);
		Complex minusonetwoi = new Complex(-1,2);

		//Complex.printCom(Complex.Add(onei, twominusi));
		System.out.println();
		//Complex.printCom(Complex.Multiply(onei, twominusi));
		System.out.println();
		System.out.println(Complex.Modulus(onei));
		//Complex.printCom(Complex.conjugate(twominusi));
		
		Complex[] one = new Complex[3];
		one[0]=zero;
		one[1]=onei;
		one[2]=twominusi;
		
		Complex[] two = new Complex[3];
		two[0]=onei;
		two[1]=zero;
		two[2]=twominusi;
		
		Complex.printCom(one);
		System.out.println();
		Complex.printCom(two);
		System.out.println();
		
		Complex.printCom(Complex.scalarProduct(two,two));
		System.out.println();
		
		System.out.println(Complex.norm(one)*Complex.norm(one));
		
		System.out.println(Complex.isEqual(onei, Complex.Add(twominusi,minusonetwoi)));
	}
	
	public static void testComplexMatrix() {
		ComplexMatrix com= new ComplexMatrix(5,4);
		//ComplexMatrix.printComMat(com);
		Complex zero= new Complex();
		Complex one= new Complex(1,0);
		Complex onei = new Complex(1,1);
		Complex twominusi= new Complex(2,-1);
		Complex minusonetwoi = new Complex(-1,2);
		Complex[] oneVec = new Complex[3];
		oneVec[0]=zero;
		oneVec[1]=onei;
		oneVec[2]=twominusi;
		
		Complex[] two = new Complex[3];
		two[0]=onei;
		two[1]=zero;
		two[2]=twominusi;
		
		Complex[] first = new Complex[3];
		first[0]=one;
		first[1]=zero;
		first[2]=zero;
		
		Complex[] second = new Complex[3];
		second[0]=zero;
		second[1]=one;
		second[2]=zero;
		
		Complex[] third = new Complex[3];
		third[0]=zero;
		third[1]=zero;
		third[2]=one;
		
		Complex[][] mat= new Complex[2][3];
		mat[0]=oneVec;
		mat[1]=two;
		//mat[2]=oneVec;
		
		Complex[][] idmat= new Complex[3][3];
		idmat[0]=first;
		idmat[1]=second;
		idmat[2]=third;
		
		ComplexMatrix com2= new ComplexMatrix(mat);
		ComplexMatrix id= new ComplexMatrix(idmat);

		ComplexMatrix.printComMat(com2);
		System.out.println();

		//ComplexMatrix com3 = ComplexMatrix.transpose(com2);
		
		//ComplexMatrix.printComMat(com3);
		System.out.println();
		//ComplexMatrix.printComMat(ComplexMatrix.add(com2, com3));
		System.out.println();
		//ComplexMatrix.printComMat(ComplexMatrix.multiply(com2, com3));
		
		System.out.println();
		ComplexMatrix.printComMat(id);
		System.out.println(ComplexMatrix.isIdentity(id));
		ComplexMatrix.printComMat(com2);
		System.out.println(ComplexMatrix.isUnitary(id));
		ComplexMatrix.printComMat(ComplexMatrix.multiply(com2, id));
		//ComplexMatrix.printComMat(ComplexMatrix.multiply(id, com2));
		System.out.println(ComplexMatrix.isEqual(id,ComplexMatrix.multiply(com2, id)));



	}
	
	
	public static void QubitTests(){
		Complex zero= new Complex();
		Complex one= new Complex(1,0);
		Complex i= new Complex(0,1);

		Complex onei = new Complex(1,1);
		Complex twominusi= new Complex(2,-1);
		Complex minusonetwoi = new Complex(-1,2);
		Complex a = new Complex(0.8,0.0);
		Complex b = new Complex(0.0,0.6);
		//Complex c = new Complex(0.7071067812,0.0);
		
		//When checking whether the norm is 1, we have to pay attention to roundings.
		//So we must also accept answers that are approximately one.
		Complex c = new Complex(Math.sqrt(0.3),0.0);
		Complex d = new Complex(Math.sqrt(0.7),0.0);
		
		Complex[] oneZero = new Complex[2];
		Complex[] zeroOne = new Complex[2];
		Complex[] zeroZero = new Complex[2];

		oneZero[0]=one;
		oneZero[1]=zero;
		
		zeroOne[0]=zero;
		zeroOne[1]=one;
		
		zeroZero[0]=zero;
		zeroZero[1]=zero;
		
		Complex[][] m1000=new Complex[2][2];
		m1000[0]=oneZero;
		m1000[1]=zeroZero;
		
		Complex[][] m0001=new Complex[2][2];
		m0001[0]=zeroZero;
		m0001[1]=zeroOne;
		
		ComplexMatrix first= new ComplexMatrix(m1000);
		ComplexMatrix second= new ComplexMatrix(m0001);
		
		ComplexMatrix[] coms = new ComplexMatrix[2];
		coms[0]=first;
		coms[1]=second;
		//coms[1]=first;
		ComplexMatrix.printComMat(coms[0]);
		ComplexMatrix.printComMat(coms[1]);

		
		Complex[][] unit2= new Complex[2][2];
		unit2[0]=oneZero;
		unit2[1]=zeroOne;
		
		Complex[][] inv2= new Complex[2][2];
		inv2[1]=oneZero;
		inv2[0]=zeroOne;
		
		Transformation same= new Transformation(unit2);
		Transformation flip = new Transformation(inv2);
		
		Transformation combo = Transformation.tensorProd(same, flip);
		System.out.println("here is wunderbar transformation. ich lieb.");

		ComplexMatrix.printComMat(combo);
		Transformation combo2 = Transformation.tensorProd(flip, same);
		System.out.println("here is wunderbar transformation. ich lieb.");

		ComplexMatrix.printComMat(combo2);

		Measurement un = new Measurement(coms);
		
		
		
		
		System.out.println("Initializing measurement miraculously worked.");

		
		Complex[] oneVec = new Complex[3];
		oneVec[0]=zero;
		oneVec[1]=onei;
		oneVec[2]=twominusi;
		Complex[] twoVec = new Complex[2];
		twoVec[0]=c;
		twoVec[1]=d;
		
		
		//Qubit qu = new Qubit(oneVec);
		Qubit qu2 = new Qubit(twoVec);
		Qubit.printQub(qu2);
		QuantumState qs = new QuantumState(qu2);
		int result = Measurement.apply(qs, un);
		
		System.out.println("Int = "+ result);

		
		
		//Qubit.printQub(qu2);
		//Ensemble en =new Ensemble(qu2);
		//Ensemble.printEnsemble(en);

	}
	public static void DeutschJosza(){
		QuantumState qs= new QuantumState();
		Qubit first = Qubit.ZEROQUBIT;
		Qubit second = Qubit.ZEROQUBIT;
		Transformation ha =Transformation.HAD;
		first = Transformation.apply(first, ha);
		second = Transformation.apply(second, ha);
		
		qs = new QuantumState(qs,first);
		qs = new QuantumState(qs,second);

		Complex[] zeroRow= {Complex.ZEROC,Complex.ZEROC,Complex.ZEROC,Complex.ZEROC};

		Complex[] firstRow= {Complex.ZEROC,Complex.ONEC,Complex.ZEROC,Complex.ZEROC};
		Complex[] secondRow= {Complex.ONEC,Complex.ZEROC,Complex.ZEROC,Complex.ZEROC};
		Complex[] thirdRow= {Complex.ZEROC,Complex.ZEROC,Complex.ZEROC,Complex.ONEC};
		Complex[] fourthRow= {Complex.ZEROC,Complex.ZEROC,Complex.ONEC,Complex.ZEROC};
		
		Complex[][] Umat={firstRow,secondRow,thirdRow,fourthRow};
		
		Transformation U = new Transformation(Umat);
		
		qs = Transformation.apply(qs,U);
		Transformation id = new Transformation(2);
		
		Transformation haid =Transformation.tensorProd(ha,id);
		qs = Transformation.apply(qs,U);

		Complex.printCom(qs.stateVector);
		
		qs = QuantumState.forgetAllButFirst(qs);
		
		System.out.println();

		Complex.printCom(qs.stateVector);



		
	}

	
	
	
	public static String[] initialArgs;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialArgs = args;
		DeutschJosza();
		System.out.println("siia küll jõudsin");
		//String asd = "circuit bool tere(int a) { int a = 9;tere(); a=3;}circuit int tere(float y){int x = 0;}";
		//AstNode ast = gramParsingUtils.createAst(asd);
		//System.out.println(ast.toString());
		//QubitTests();
		/*
		ParseTree tree = createParseTree(asd);
		Visitor foo = new Visitor(tree);
		try {
			//foo.runProgram();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(foo.getResult());*/
	}
/*
	private static ParseTree createParseTree(String program) {
	    ANTLRInputStream antlrInput = new ANTLRInputStream(program);
	    gramLexer lexer = new gramLexer(antlrInput);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    gramParser parser = new gramParser(tokens);
	    ParseTree tree = parser.program();	    
	    System.out.println(tree.toStringTree(parser));
	    return tree;
	}*/
}
