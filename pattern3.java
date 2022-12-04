class pattern3
{
    public static void main(){
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r<=c)
                    System.out.print(r);    
            }
            System.out.println();
        }
    }
}