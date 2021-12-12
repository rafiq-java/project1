 class Cards {
        int value,priority;
        String suit;

        public void setCards(String suit, int r) {
            this.value = r;
            this.suit = suit;
        }
     //Write your code here.
          int getSuitPriority(String suitString) {
            //Write your code here.
              int spades=4,diamonds=3,hearts=2,clubs=1;

              if(suitString=="spades") {
                  this.priority = spades;
              }
              else if (suitString=="clubs") {
                  this.priority = clubs;
              }
              else if (suitString=="hearts") {
                  this.priority = hearts;
              }
              else {
                  this.priority = diamonds;
              }
              return priority;
        }


    }

    class ClassicGame {
        int points1 = 0;
        int points2 = 0;

        public void game(Cards c1, Cards c2) {
            if (c1.value > c2.value) {
                points1++;
            } else if (c1.value < c2.value) {
                points2++;
            } else if (c1.value == c2.value) {
                if ( c1.priority > c2.priority){
                    points1++;
                } else {
                    points2++;
                }
            }


            //Write your code here.

            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }
    }


