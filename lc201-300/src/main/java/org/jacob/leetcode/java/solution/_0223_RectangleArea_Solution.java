package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/rectangle-area/description/"><h1>223. Rectangle Area</h1></a>
 *
 * @author Kotohiko
 * @since 09:53 Jul 23, 2024
 */
public class _0223_RectangleArea_Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        var rectangle1 = new Rectangle(ax1, ay1, ax2, ay2);
        var rectangle2 = new Rectangle(bx1, by1, bx2, by2);
        return rectangle1.rectangleArea(rectangle1.x1, rectangle1.y1, rectangle1.x2, rectangle1.y2)
                + rectangle2.rectangleArea(rectangle2.x1, rectangle2.y1, rectangle2.x2, rectangle2.y2)
                - rectangle1.intersectionArea(rectangle2);
    }

    /**
     * 矩形内部类
     */
    static class Rectangle {
        private final int x1;
        private final int y1;
        private final int x2;
        private final int y2;

        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = Math.min(x1, x2);
            this.y1 = Math.min(y1, y2);
            this.x2 = Math.max(x1, x2);
            this.y2 = Math.max(y1, y2);
        }

        public int rectangleArea(int x1, int y1, int x2, int y2) {
            return (x2 - x1) * (y2 - y1);
        }

        public boolean intersects(Rectangle other) {
            return !(this.x2 < other.x1 || this.x1 > other.x2 || this.y2 < other.y1 || this.y1 > other.y2);
        }

        public int intersectionArea(Rectangle other) {
            if (!intersects(other)) {
                return 0;
            }
            var intersectionX1 = Math.max(this.x1, other.x1);
            var intersectionY1 = Math.max(this.y1, other.y1);
            var intersectionX2 = Math.min(this.x2, other.x2);
            var intersectionY2 = Math.min(this.y2, other.y2);
            return (intersectionX2 - intersectionX1) * (intersectionY2 - intersectionY1);
        }
    }
}

/**
 * <a href="https://leetcode.cn/problems/rectangle-area/solutions/1024841/gong-shui-san-xie-yun-yong-rong-chi-yuan-hzit/">
 * <h2>【宫水三叶】运用容斥原理求解</h2></a>
 *
 * @author 宫水三叶
 * @since Sep 30, 2021
 */
@SuppressWarnings("unused")
class RectangleArea_Solution2 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int y = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        return (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) - (x * y);
    }
}