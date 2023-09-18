package vn.edu.iuh.fit.www_lab_week2.models;

import jakarta.persistence.*;

import java.io.Serializable;


//Ghi chú : do bài của em làm trên máy trường do tiết trước có bạn Minh Hồng
//ngồi làm nhưng không thoát GitHub trong intelliJ máy  em ngồi
//và  em không để ý nên đã commit bài nhầm vào tài khoản của bạn  chứ không phải em copy bài ạ!
@Entity
@Table(name = "product_image")
@IdClass(ProductImage.ProductImagePK.class)
public class ProductImage {
    @Id
    private long product_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long image_id;

    @Column(length = 250,  nullable = false)
    private String path;
    @Column(length = 250)
    private String alternative;

    public static class ProductImagePK implements Serializable{
        private long product_id;
        private long image_id;

        public ProductImagePK() {
        }

        public ProductImagePK(long product_id, long image_id) {
            this.product_id = product_id;
            this.image_id = image_id;
        }
    }


    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getImage_id() {
        return image_id;
    }

    public void setImage_id(long image_id) {
        this.image_id = image_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public ProductImage() {
    }

    public ProductImage(long product_id, long image_id, String path, String alternative) {
        this.product_id = product_id;
        this.image_id = image_id;
        this.path = path;
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "Product_image{" +
                "product_id=" + product_id +
                ", image_id=" + image_id +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }


}
