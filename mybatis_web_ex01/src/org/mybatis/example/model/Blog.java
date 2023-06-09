package org.mybatis.example.model;

public class Blog {
   private int id=101;
   private String author;
   private String title;
   private String content;
   
   public Blog() {
      this(101, "", "", "");
   }
   
   public Blog(int id) {
      this(id, "", "", "");
   }

   public Blog(int id, String author, String title, String content) {
      this.id = id;
      this.author = author;
      this.title = title;
      this.content = content;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   @Override
   public String toString() {
      return "Blog [id=" + id + ", author=" + author + ", title=" + title + ", content=" + content + "]";
   }
}