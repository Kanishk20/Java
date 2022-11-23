class age_of_n_people
{
    void main()
    {
        int[] age = { 15 ,17 ,50 , 424, 51342,4,535233,356,5,565,23};
        /* in this program there are lot of numbers hence we cannot count them all
        Hence to calculate length or the number of numbers we use .length function */
        for(int i = 0 ; i<age.length; i++)
        {
            System.out.println(age[i]);
        }
    }
}