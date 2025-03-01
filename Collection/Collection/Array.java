package Collection;

public class Array
{
    int initialSize;
        int count;
        Object[] myarr;

        Array(int size){
            this.initialSize=size;
            myarr=new Object[initialSize];
        }

        //Default constructor
        Array(){
        }

        // custom size method
        public int size(){
            return myarr.length;
        }

        // custom add method
        public boolean add(Object obj){
            if(count<initialSize) {
                myarr[count++] = obj;
                return true;
            }
            else if(count==initialSize){
                Object[] newobj=new Object[initialSize*2];
                //copying data from one array to another
                for(int i=0;i<myarr.length;i++){
                    newobj[i]=myarr[i];
                }

                count=myarr.length;
                myarr=newobj;
                myarr[count++]=obj;
                return true;
            }
            return false;
        }

    //custom remove method
    public boolean remove(int idx){
        if(idx>count||idx<0){
            throw new IllegalArgumentException("Invalid Input index");
        }
        for (int i = idx; i < count ; i++) {
            myarr[i] = myarr[i + 1];
        }
        myarr[--count] = null;

        return true;
    }

    //custom print method
    public void printAll(){
        for(int i=0;i<count;i++){
            System.out.println(myarr[i]);
        }
    }

    public static void main(String[] args) {
        Array list=new Array(6);  // here i am specifying initial size of my list
        System.out.println("initial Capacity of My ArrayList : "+list.size());
        list.add("Aditi");
        list.add("Shradha");
        list.add("Dakshta");
        list.add("komal");
        list.add("Anjali");
        list.add("Prachi");


        //printing elements
        list.printAll();

        System.out.println();
        //removing element
        list.remove(2);

        // displying list after removing element from index 2
        list.printAll();


    }
}


