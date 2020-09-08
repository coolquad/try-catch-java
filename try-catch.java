class Demo{
   public static void main(String args[]){

   	for (int i = 0; i < args.length - 1 ; i++) {
   		try{

   			String [] letter_index= {"A", "B", "C", "D", "E", "F"};
   			System.out.println(args[i] + " is valid number");
   			if (args[i] < 0) {
   				throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!"); 
   			}
   			for (int j = 0; j < letter_index.length - 1; j++) {
   				System.out.println("Letter" + letter_index[j]);
   			}			
		}
		catch(IllegalArgumentException e){
			System.out.println("Only Positive Numbers & no Letters Please!" );
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("Warning: Some Other exception");
		}
		System.out.println("Out of try-catch block...");
		}	
	}	
}

//This is Try-catch demo work