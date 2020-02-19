class ResturantMenu
{
	private String itemname;
	private int itemprice;
	private String itemcategory;

	public ResturantMenu()
	{
		itemname=null;
		itemprice=0;
		itemcategory=null;
	}

	public ResturantMenu(String itemname , int itemprice , String itemcategory)
	{
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemcategory = itemcategory;
 	}
 	// public String setItemname(String itemname)
 	// {
 	// 	this.itemname=itemname;
 	// }
 	public String getItemname(){
        return itemname;
    }
    public int getItemprice(){
        return itemprice;
    }
    public void setItemprice(int price){
        this.itemprice=itemprice;
    }
    public void setItemcategory(String category){
        this.itemcategory=itemcategory;
    }
    public String getItemcategory(){
        return itemcategory;
    }
}