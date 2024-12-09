public class Line {
    private Point start;
    private Point end;

    Line(Point p1, Point p2) {
        this.start = p1;
        this.end = p2;
    }

    public double length() {
        return Math.sqrt(Math.abs(start.getX() - end.getX()) + Math.abs(start.getY() - end.getY()));
    }

    public double endPoint() {
        return end.getX();
    }

    public double startPoint() {
        return start.getX();
    }

    @Override
    public String toString() {
        return "Line: " + start + " to " + end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

}