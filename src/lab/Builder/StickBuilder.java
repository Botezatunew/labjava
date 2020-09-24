package lab.Builder;

public class StickBuilder {
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public int getKrepost() {
        return slaughger;
    }

    private String brand;
    private String color;
    private String taste;
    private int slaughger;

    private StickBuilder(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.taste = builder.taste;
        this.krepost = builder.slaughger;
    }

    public static class  Builder {
        private String brand;
        private String color;
        private String taste;
        private int slaughger;

        public Builder(String brand) {
            this.brand = brand;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setTaste(String taste) {
            this.taste = taste;
            return this;
        }

        public Builder setKrepost(int slaughger) {
            this.krepost = slaughger;
            return this;
        }

        public StickBuilder build() {
           return new StickBuilder(this);
        }
    }
}
