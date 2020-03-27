class Item {
	int id;
	String name;
	double price;


	//TODO add variable.
	char tax;	//A = 18%,Б = 5%, В = 0%
	//TODO constructor
	public Item(int id, String name, double price, char tax){
		this.id = id;
		this.name=name;
		this.price=price;
		this.tax=tax;
	}
	//TODO setters and getters

	public int getID(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public double getPrice(){
		return this.price;
	}

	public char getTax(){
		return this.tax;
	}

	public void setID(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public void setTax(char tax){
		this.tax = tax;
	}

	double taxReturn () {
		//TODO
		double taxR=0;
        	if(this.tax=='А'){
           		 taxR = ((this.price*18)/100)*15/100;
        	} else if(this.tax=='Б'){
            		taxR = ((this.price*5)/100)*15/100;
        	} else if(this.tax=='В'){
            		taxR=0;
        	}

	        return taxR;
	}
}
