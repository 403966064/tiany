package com.trade.effectivejava.secondchapter.builder;

public class Builder {

    private final int length;
    private final int width;
    private final int high;

    public Builder(innerBuilder innerBuilder) {
        this.length = innerBuilder.length;
        this.width = innerBuilder.width;
        this.high = innerBuilder.high;
    }

    public static class innerBuilder{
        private final int length;

        private int width = 0;

        private int high = 0;

        public innerBuilder(int length) {
            this.length = length;
        }

        public innerBuilder width(int w){
            this.width = w;
            return this;
        }

        public innerBuilder high(int h){
            this.high = h;
            return this;
        }

        public Builder builder(){
            return new Builder(this);
        }
    }

    public static void main(String[] args) {
            Builder builder = new Builder.innerBuilder(10).high(5).width(1).builder();
    }

}
