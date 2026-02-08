class MovieTestDrive {
    String title = "";
    int rating = 0;

    public static void main(String[] args) {
        Movie favorite = new Movie();

        favorite.title = "Интерстеллар";
        favorite.rating = 5;

        System.out.print("Любимый фильм: ");
        System.out.println(favorite.title + ", рейтинг " + favorite.rating);
    }
}
