package com.company;
import java.util.Random;

public class arrays {

    private    int [] array;
    private    int size;

    public

    arrays (int size){


        array=new int[size];

        this.size=size;

        System.out.println("def start");

        Random rand=new Random();

        for(int i=0; i<size; ++i) {
            array[i] = rand.nextInt(100);
            System.out.println(array[i]);
        }
        sort_bubble();




        //sort_bubble();
        System.out.println("hello from older contractor over");
    }

    arrays (int a[]){
        this.array=a;
        this.size = a.length;

    }

    arrays (){

        Random rand=new Random();
        size=rand.nextInt(100)+1;
        array=new int[size];
        for (int i=0; i<size; ++i) {
            array[i] = rand.nextInt(100)+1;

        }
        sort_bubble();
    }


    int arrsize(){
     return size;
    }



    void print(){

        for (int i=0; i<this.size; ++i)
            System.out.println("array["+i+"]="+this.array[i]);
    }


/*

    void definition(){

        System.out.println("def start");
        Random rand=new Random();

        for(int i=0; i<this.size; ++i) {
            this.array[i] = rand.nextInt();
            System.out.println(this.array[i]);
        }
        sort_bubble();
        System.out.println("def over");
    }*/

    int [] get_arr()
    {
        return this.array;

    }

    public void sort_bubble(){


        int min;

        for (int i=0; i<this.size ;++i){
            min=i;
            for (int j=i; j<size; j++){
                if(array[min] > array[j]){
                    min=j;
                }
            }

            if(min!=i) {
                array[i] += array[min];
                array[min] = array[i] - array[min];
                array[i] = array[i] - array[min];
            }
        }


    }


    void sort_revbubble(){

        int max;
        int c;
        for(int i=0;i<size;i++){
            max = i;
            for (int j=i; j<size;++j){
                if (array[max]<array[j])
                    max=j;

            }

            c=array[max];
            array[max]=array[i];
            array[i]=c;

        }

    }

    int max(){
        int max =array[0];

        for(int i=1; i<size;++i){
            if (max<array[i])
                max=array[i];
        }
        return max;
    }


}

class revarrays extends arrays{

    revarrays(int size){

        super(size);
        super.sort_revbubble();
        System.out.println("hello from junior constructor");

    }

    revarrays(){
        super();
        super.sort_revbubble();
    }


    @Override
    public void print()
    {

        int [] a=super.get_arr();
        for(int i=0; i<super.size;++i)
            System.out.println(a[i]);

    }


}