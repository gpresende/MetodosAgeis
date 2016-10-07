
public class CampoMinado 
{
	private int[][] matrix;
	
	// Construtor
	public CampoMinado(int x, int y)
	{
		int[][] matrix = new int[x][y]; 
	}
	
	
	public void InserirMina(int x, int y)
	{
		matrix[x][y] = 9;
	}
	
	
	public void Calcular()
	{
		
	}
	
	
	public int[][] Palpite(int x, int y)
	{
		return matrix;
	}
	
	
	public static void main(String[] args) 
	{

	}

}


