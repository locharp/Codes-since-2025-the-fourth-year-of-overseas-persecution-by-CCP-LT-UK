// 182 ms, 77 MB
import java.util.AbstractMap.SimpleImmutableEntry;

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */

class FoodRatings
{
    String[] foods;
    String[] cuisines;
    int[] ratings;
    HashMap < String, Integer > foodMap;
    HashMap
    <
        String
        , PriorityQueue < SimpleImmutableEntry < Integer, Integer > >
    > cuisinePqs;




    public
    FoodRatings
    (
        String[] foods
        , String[] cuisines
        , int[] ratings
    )
    {
        this.foods = foods;
        this.cuisines = cuisines;
        this.ratings = ratings;
        foodMap = new HashMap <> ();
        cuisinePqs = new HashMap <> ();
       

        for
        (
            int i = 0
            ; i < foods.length
            ; i ++
        )
        {
           
            if
            (
                !cuisinePqs.containsKey( cuisines[i] )
            )
            {
                cuisinePqs.put(
                    cuisines[i]
                    , new PriorityQueue <> ( new FoodComparator() )
                );
            }

            foodMap.put( foods[i], i );

            cuisinePqs.get( cuisines[i] )
                .offer( new SimpleImmutableEntry <> ( i, ratings[i] ) );
        }
       

    }




    public
    void
    changeRating
    (
        String food
        , int newRating
    )
    {
        int i = foodMap.get( food );

        ratings[i] = newRating;
        cuisinePqs.get( cuisines[i] )
            .offer( new SimpleImmutableEntry <> ( i, newRating ) );
    }



   
    public
    String
    highestRated
    (
        String cuisine
    )
    {
       

        while
        (
            !cuisinePqs.get( cuisine ).peek().getValue()
                .equals( ratings[cuisinePqs.get( cuisine ).peek().getKey()] )
        )
        {
            cuisinePqs.get( cuisine ).poll();
        }


        return foods[cuisinePqs.get( cuisine ).peek().getKey()];
    }






    class FoodComparator
    implements Comparator < SimpleImmutableEntry < Integer, Integer > >
    {

        @Override
        public
        int
        compare
        (
            SimpleImmutableEntry < Integer, Integer > food1
            , SimpleImmutableEntry < Integer, Integer > food2
        )
        {

            if
            (
                food1.getValue().equals( food2.getValue() )
            )
            {
                return
                    foods[food1.getKey()].compareTo( foods[food2.getKey()] );
            }
            else
            {
                return food2.getValue().compareTo( food1.getValue() );
            }

        }

    }

}
