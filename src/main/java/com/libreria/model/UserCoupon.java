package com.libreria.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "UserCoupons")
public class UserCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userCouponID;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "CouponID", nullable = false)
    private Coupon coupon;

    @Column(name = "IsRedeemed", nullable = false)
    private boolean isRedeemed;

    @Column(name = "RedemptionDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date redemptionDate;

    public int getUserCouponID() {
        return userCouponID;
    }

    public void setUserCouponID(int userCouponID) {
        this.userCouponID = userCouponID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public boolean isRedeemed() {
        return isRedeemed;
    }

    public void setRedeemed(boolean redeemed) {
        isRedeemed = redeemed;
    }

    public Date getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Date redemptionDate) {
        this.redemptionDate = redemptionDate;
    }
}
