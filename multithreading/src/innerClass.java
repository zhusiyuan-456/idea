class outer {
    protected void outerMethod() {
        class inner {
            void innerMethod() {
                System.out.println("inner Method");
            }
        }
        inner Y = new inner();
        Y.innerMethod();
    }
}

