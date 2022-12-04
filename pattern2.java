class pattern2
{
    public static void main(){
        for(int c=1; c<=5; c++){
            for(int r=1; r<=c; r++){
                if(r<=c)
                    System.out.print(c);    
            }
            System.out.println();
        }
    }
}