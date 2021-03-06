class ArrayTest02 
{
	public static void main(String[] args) 
	{
		//int Data Type의 배열의 배열(2차원 배열)을 생성
		int[][] value = new int[9][9];

		//index를 이용 value의 값 접근 및 대입
		for(int i=0; i<9; i++){
			value[0][i] = 1 * (i+1);
		}

		//값 다 대입해보기
		for(int i = 1; i < value.length; i++){
			for(int j=0; j < value[i].length; j++){
				value[i][j] = i * (j+1);
			}//innerFor
		}//outerFor




		//입력된 값을 출력
		//==> value.length / value[j].length의 의미를 이해
		//==> valeue[0][0] ~ value[0][9]까지의 출력값을 확인
		//==> 그 이외 값들은? (<== 배열은 생성시 자동 초기화됨을 확인.)
		for(int j=0; j<value.length; j++){

			System.out.println("======================");

			for(int k=0; k<value[j].length; k++){

				System.out.println("value["+j+"]["+k+"] = "+value[j][k]);

			}//end of innerFor

		}//end of outerFor
		
		System.out.println("======================");

	}//end of main()
}//end of class
