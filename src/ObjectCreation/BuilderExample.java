package ObjectCreation;

class BuilderExample {
    private String message;

    private BuilderExample(Builder builder) {
        this.message = builder.message;
    }

    void display() {
        System.out.println(message);
    }

    static class Builder {
        private String message;

        Builder setMessage(String message) {
            this.message = "Object created using Builder Pattern";
            return this;
        }

        BuilderExample build() {
            return new BuilderExample(this);
        }
    }
}

class BuilderTest {
    public static void main(String[] args) {
        BuilderExample obj = new BuilderExample.Builder()
                                .setMessage("Ignored")
                                .build();
        obj.display();
    }
}
