class Computer {
        private int speed;
        private int price;
        private int diag;
        private int vram;
        private int power;
        public String name;
        public Computer(int speed, int price, int diag, int vram, String name){
            this.speed = speed;
            this.price = price;
            this.diag = diag;
            this.vram = vram;
            this.name = name;
        }
        public int charac(){
            power = speed*diag*vram;
            return power;
        }
        public int gen_value(){
            int value = charac() *price;
            return value;
        }

    }

