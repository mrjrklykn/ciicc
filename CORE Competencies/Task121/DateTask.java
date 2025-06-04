package Task121;

public class DateTask {
    // Instance variables
    private byte day;   // Made private
    private byte month; // Made private
    private short year; // Made private

    // Constructors
    public DateTask() {
        this(1, 1, 1);  // Added initialization
    }

    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    // Methods
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year); // Correct format
    }

    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            day = (byte) d;
            year = (short) y;
            month = (byte) m;
        } else {
            day = 0;
            year = 0;
            month = 0;
        }
    }

    public static void leapYears() {
        for (int i = 1980; i <= 2023; i += 4) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
                System.out.println("The year " + i + " is a leap year");
        }
    }

    // Getter methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public int setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
            return day;
        }
        return 0;
    }

    public int setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = (byte) month;
            return month;
        }
        return 0;
    }

    public int setYear(int year) {
        if (valid(day, month, year)) {
            this.year = (short) year;
            return year;
        }
        return 0;
    }

    // Validation method (Fixed)
    private boolean valid(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
            System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
            return false;
        }

        // Check month-specific day limits
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
                return (day <= 28 || (day == 29 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))));
            default:
                return true; // Other months allow up to 31 days
        }
    }
}
