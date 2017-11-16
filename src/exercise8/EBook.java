package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author woolsa01
 */
public class EBook extends Book {
  private final String format;
  
  public EBook(String format, String author, int publishingYear, long id, String title) {
      super(author, publishingYear, id, title, 1);
      this.format = format;
  }
   @Override
  public void checkout() {}

  @Override
  public void checkin() {}
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }

    @Override
    public String getInfo() {
        return String.format("%s (%d). %s is available for %s", author, publishingYear, title, format);
    }
  
}
