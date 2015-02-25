package classworkitujava;

import java.util.ArrayList;
import java.util.List;

public class Book84224{
    private String title;
    private String ISBNCode;
    private String publisher;
    private String publishYear;
    private int numberOfPages;
    private List<String> authorNames;
    private List<String> reviewerList;

    //Default constructor
    public Book84224() {
    }

    //Overloaded constructor - 1
    public Book84224(String title, String ISBNCode) {
        this.title = title;
        this.ISBNCode = ISBNCode;
    }

    //Overloaded constructor - 2
    public Book84224(String title, String ISBNCode, String publisher, String publishYear) {
        this.title = title;
        this.ISBNCode = ISBNCode;
        this.publisher = publisher;
        this.publishYear = publishYear;
    }

    //Overloaded constructor - 3
    public Book84224(String title, String ISBNCode, String publisher, String publishYear, int pages, List<String> authorList) {
        this.title = title;
        this.ISBNCode = ISBNCode;
        numberOfPages = pages;
        authorNames = authorList;
    }

    //Method to add a reviewer
    public void addReviewer(String reviewerName) {
        System.out.println("Adding reviewer: " + reviewerName);
        authorNames.add(reviewerName);
    }

    //Method to remove a reviewer
    public void removeReviewer(String reviewerName) {
        if (authorNames.size() > 0) {
            System.out.println("Removing reviewer: " + reviewerName);
            authorNames.remove(reviewerName);
        }
    }


    //Getters and Setters for properties
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBNCode() {
        return ISBNCode;
    }

    public void setISBNCode(String ISBNCode) {
        this.ISBNCode = ISBNCode;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public List<String> getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(List<String> authorNames) {
        this.authorNames = authorNames;
    }

    public List<String> getReviewerList() {
        return reviewerList;
    }

    public void setReviewerList(List<String> reviewerList) {
        this.reviewerList = reviewerList;
    }

    public String toString() {
        return "\nBookSummary: \nTitle: " + getTitle() + " ISBN Code: " + getISBNCode() + " Publisher: " + getPublisher() + " Publish Year: " + getPublishYear() + "\nNumber of pages: " + getNumberOfPages() + " Authors: " + getAuthorNames().toString() + " Reviewers: " + getReviewerList().toString();
    }

    //Driver class
    public static void main(String... args) {

        //Test constructors
        //Reusable property
        List<String> authors = new ArrayList<String>();
        authors.add("Dan Flaker");
        authors.add("Joel Smith");

        List<String> reviewers = new ArrayList<String>();
        reviewers.add("Horstman Jack");
        reviewers.add("Cindy Darin");


        //Test default constructor: Message printed on console if executed
        System.out.println("\nTesting setters and getters. Getters are tested using \'toString()\' method.");
        Book84224 defConstructObject = new Book84224();
        defConstructObject.setTitle("Default Title");
        defConstructObject.setISBNCode("12345");
        defConstructObject.setPublisher("Google INc.");
        defConstructObject.setPublisher("2013");
        defConstructObject.setNumberOfPages(120);
        defConstructObject.setAuthorNames(authors);
        defConstructObject.setReviewerList(reviewers);
        defConstructObject.addReviewer("Mady");
        defConstructObject.addReviewer("Polly");
        System.out.println(defConstructObject);

        //Test constructor with two parameters
        Book84224 bookTwoParams = new Book84224("Java Complete Reference", "123456789");
        bookTwoParams.setPublisher("Yahoo INc.");
        bookTwoParams.setPublisher("2013");
        bookTwoParams.setNumberOfPages(150);
        bookTwoParams.setAuthorNames(authors);
        bookTwoParams.setReviewerList(reviewers);
        bookTwoParams.removeReviewer("james");
        System.out.println(bookTwoParams);

        //Test constructor with four parameters
        Book84224 bookFourParams = new Book84224("C++ Complete Reference", "1234ABCDEF", "Oreilli Media", "2013");
        bookFourParams.setNumberOfPages(1000);
        bookFourParams.setAuthorNames(authors);
        bookFourParams.setReviewerList(reviewers);
        bookFourParams.addReviewer("C++ Complete Reference Reviewer");
        System.out.println(bookFourParams);

        //Test constructor with six parameters
        Book84224 bookSixParams = new Book84224("Spring Documentation", "1234ABCDEF", "Spring Source", "2013", 1020, authors);
        bookSixParams.setReviewerList(reviewers);
        bookSixParams.addReviewer("Spring Documentation");
        bookSixParams.removeReviewer("Smith");
        System.out.println(bookSixParams);
    }
}
