public class Line {
    private Point start;
    private Point end;
    Line(Point p1, Point p2) {
        this.start = p1;
        this.end = p2;
    }
    public double distance() {
        return Math.sqrt(Math.abs(start.getX() - end.getX()) + Math.abs(start.getY() - end.getY()));
    }
}
