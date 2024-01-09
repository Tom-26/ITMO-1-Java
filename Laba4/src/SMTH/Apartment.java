package SMTH;

public class Apartment {
    private BabyRoom babyRoom;
    private LivingRoom livingRoom;
    private Kitchen kitchen;
    public Apartment() {
        babyRoom = new BabyRoom();
        livingRoom = new LivingRoom();
        kitchen = new Kitchen();
    }
    public class BabyRoom {
        private String towels;

        public BabyRoom() {
            towels = "полотенца";
        }
        public String getToys() {
            return towels;
        }
    }
    public class LivingRoom {
        private String sofa;

        public LivingRoom() {
            sofa = "диван";
        }
        public String getSofa() {
            return sofa;
        }
    }
    public class Kitchen {
        private Table table;

        public Kitchen() {
            table = new Table();
        }
        public Table getTable() {
            return table;
        }
        public class Table {
            private String dishes;
            public Table() {
                dishes = "Посуда на столе";
            }
            public String getDishes() {
                return dishes;
            }
        }
    }
}


