interface HousePlan 
{ 
  public void setBasement(String basement); 

  public void setStructure(String structure); 

  public void setRoof(String roof); 

  public void setInterior(String interior); 
} 

class House implements HousePlan 
{ 

  private String basement; 
  private String structure; 
  private String roof; 
  private String interior; 

  public void setBasement(String basement) 
  { 
    this.basement = basement; 
  } 

  public void setStructure(String structure) 
  { 
    this.structure = structure; 
  } 

  public void setRoof(String roof) 
  { 
    this.roof = roof; 
  } 

  public void setInterior(String interior) 
  { 
    this.interior = interior; 
  } 

} 


interface HouseBuilder 
{ 

  public void buildBasement(); 

  public void buildStructure(); 

  public void bulidRoof(); 

  public void buildInterior(); 

  public House getHouse(); 
} 

class IglooHouseBuilder implements HouseBuilder 
{ 
  private House house; 

  public IglooHouseBuilder() 
  { 
    this.house = new House(); 
  } 

  public void buildBasement() 
  { 
    house.setBasement("Ice Bars"); 
  } 

  public void buildStructure() 
  { 
    house.setStructure("Ice Blocks"); 
  } 

  public void buildInterior() 
  { 
    house.setInterior("Ice Carvings"); 
  } 

  public void bulidRoof() 
  { 
    house.setRoof("Ice Dome"); 
  } 

  public House getHouse() 
  { 
    return this.house; 
  } 
} 

class TipiHouseBuilder implements HouseBuilder 
{ 
  private House house; 

  public TipiHouseBuilder() 
  { 
    this.house = new House(); 
  } 

  public void buildBasement() 
  { 
    house.setBasement("Wooden Poles"); 
  } 

  public void buildStructure() 
  { 
    house.setStructure("Wood and Ice"); 
  } 

  public void buildInterior() 
  { 
    house.setInterior("Fire Wood"); 
  } 

  public void bulidRoof() 
  { 
    house.setRoof("Wood, caribou and seal skins"); 
  } 

  public House getHouse() 
  { 
    return this.house; 
  } 

} 

class CivilEngineer 
{ 

  private HouseBuilder houseBuilder; 

  public CivilEngineer(HouseBuilder houseBuilder) 
  { 
    this.houseBuilder = houseBuilder; 
  } 

  public House getHouse() 
  { 
    return this.houseBuilder.getHouse(); 
  } 

  public void constructHouse() 
  { 
    this.houseBuilder.buildBasement(); 
    this.houseBuilder.buildStructure(); 
    this.houseBuilder.bulidRoof(); 
    this.houseBuilder.buildInterior(); 
  } 
} 

class Builder 
{ 
  public static void main(String[] args) 
  { 
    HouseBuilder iglooBuilder = new IglooHouseBuilder(); 
    CivilEngineer engineer = new CivilEngineer(iglooBuilder); 

    engineer.constructHouse(); 

    House house = engineer.getHouse(); 

    System.out.println("Builder constructed: "+ house); 
  } 
} 
