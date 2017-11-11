package com.yidu.sevensecondmall.bean.Others;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */

public class GiftProgressBean {

    /**
     * code : 0
     * message : 成功
     * result : {"list":[{"id":"1148","user_id":"3","order_sn":"JA26267225011628","old_user_id":null,"sell_price":null,"put_add_time":null,"buy_time":null,"pay_status":"0","sell_status":"0","goods_price":"39.00","order_id":"1555","free_status":"0","total_amount":"49.00","pay_time":"1509026740","order_status":"0","order_pay_status":"1","curr_id":"0000000000","curr_add_time":null,"gear_rate":"0.00","gear_amount":"0.00","is_quick":"0","first_quick_time":"0000-00-00 00:00:00","redis_rate":"6.77","redis_amount":"2.64","nickname":"1******","mobile":"189****8060","start_time":"2017-10-26 22:05:40","original_img":[{"imgurl":"http://sevenshop.b0.upaiyun.com/Public/upload/goods/2017/08-07/5987e63c644bd.jpg"}],"rate":"0.05","left_amount":0,"discount":{"now_discount":"8.0","left_days":3,"left_discount":"7.0"}},{"id":"1149","user_id":"3","order_sn":"JA26272638815513","old_user_id":null,"sell_price":null,"put_add_time":null,"buy_time":null,"pay_status":"0","sell_status":"0","goods_price":"40.00","order_id":"1557","free_status":"0","total_amount":"40.00","pay_time":"1509027274","order_status":"0","order_pay_status":"1","curr_id":"0000000000","curr_add_time":null,"gear_rate":"0.00","gear_amount":"0.00","is_quick":"0","first_quick_time":"0000-00-00 00:00:00","redis_rate":"6.86","redis_amount":"2.74","nickname":"1******","mobile":"189****8060","start_time":"2017-10-26 22:14:34","original_img":[{"imgurl":"http://sevenshop.b0.upaiyun.com/Public/upload/goods/2017/08-07/5987df6082419.jpg"}],"rate":"0.05","left_amount":0,"discount":{"now_discount":"8.0","left_days":3,"left_discount":"7.0"}}]}
     */

    private int code;
    private String message;
    private ResultBean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            @Override
            public String toString() {
                return "ListBean{" +
                        "id='" + id + '\'' +
                        ", user_id='" + user_id + '\'' +
                        ", order_sn='" + order_sn + '\'' +
                        ", old_user_id=" + old_user_id +
                        ", sell_price=" + sell_price +
                        ", put_add_time=" + put_add_time +
                        ", buy_time=" + buy_time +
                        ", pay_status='" + pay_status + '\'' +
                        ", sell_status='" + sell_status + '\'' +
                        ", goods_price='" + goods_price + '\'' +
                        ", order_id='" + order_id + '\'' +
                        ", free_status='" + free_status + '\'' +
                        ", total_amount='" + total_amount + '\'' +
                        ", pay_time='" + pay_time + '\'' +
                        ", order_status='" + order_status + '\'' +
                        ", order_pay_status='" + order_pay_status + '\'' +
                        ", curr_id='" + curr_id + '\'' +
                        ", curr_add_time=" + curr_add_time +
                        ", gear_rate='" + gear_rate + '\'' +
                        ", gear_amount='" + gear_amount + '\'' +
                        ", is_quick='" + is_quick + '\'' +
                        ", first_quick_time='" + first_quick_time + '\'' +
                        ", redis_rate='" + redis_rate + '\'' +
                        ", redis_amount='" + redis_amount + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", mobile='" + mobile + '\'' +
                        ", start_time='" + start_time + '\'' +
                        ", rate='" + rate + '\'' +
                        ", total_people='" + total_people + '\'' +
                        ", left_amount=" + left_amount +
                        ", discount=" + discount +
                        ", original_img=" + original_img +
                        '}';
            }

            /**
             * id : 1148
             * user_id : 3
             * order_sn : JA26267225011628
             * old_user_id : null
             * sell_price : null
             * put_add_time : null
             * buy_time : null
             * pay_status : 0
             * sell_status : 0
             * goods_price : 39.00
             * order_id : 1555
             * free_status : 0
             * total_amount : 49.00
             * pay_time : 1509026740
             * order_status : 0
             * order_pay_status : 1
             * curr_id : 0000000000
             * curr_add_time : null
             * gear_rate : 0.00
             * gear_amount : 0.00
             * is_quick : 0
             * first_quick_time : 0000-00-00 00:00:00
             * redis_rate : 6.77
             * redis_amount : 2.64
             * nickname : 1******
             * mobile : 189****8060
             * start_time : 2017-10-26 22:05:40
             * original_img : [{"imgurl":"http://sevenshop.b0.upaiyun.com/Public/upload/goods/2017/08-07/5987e63c644bd.jpg"}]
             * rate : 0.05
             * left_amount : 0
             * discount : {"now_discount":"8.0","left_days":3,"left_discount":"7.0"}
             */


            private String id;

            public int getIs_get() {
                return is_get;
            }

            public void setIs_get(int is_get) {
                this.is_get = is_get;
            }

            private int is_get;
            private String user_id;
            private String order_sn;
            private Object old_user_id;
            private Object sell_price;
            private Object put_add_time;
            private Object buy_time;
            private String pay_status;
            private String sell_status;
            private String goods_price;
            private String order_id;
            private String free_status;
            private String total_amount;
            private String pay_time;
            private String order_status;
            private String order_pay_status;
            private String curr_id;
            private Object curr_add_time;
            private String gear_rate;
            private String gear_amount;
            private String is_quick;
            private String first_quick_time;
            private String redis_rate;
            private String redis_amount;
            private String nickname;
            private String mobile;
            private String start_time;
            private String rate;

            public String getTotal_people() {
                return total_people;
            }

            public void setTotal_people(String total_people) {
                this.total_people = total_people;
            }

            private String total_people                    ;
            private int left_amount;
            private DiscountBean discount;
            private List<OriginalImgBean> original_img;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getOrder_sn() {
                return order_sn;
            }

            public void setOrder_sn(String order_sn) {
                this.order_sn = order_sn;
            }

            public Object getOld_user_id() {
                return old_user_id;
            }

            public void setOld_user_id(Object old_user_id) {
                this.old_user_id = old_user_id;
            }

            public Object getSell_price() {
                return sell_price;
            }

            public void setSell_price(Object sell_price) {
                this.sell_price = sell_price;
            }

            public Object getPut_add_time() {
                return put_add_time;
            }

            public void setPut_add_time(Object put_add_time) {
                this.put_add_time = put_add_time;
            }

            public Object getBuy_time() {
                return buy_time;
            }

            public void setBuy_time(Object buy_time) {
                this.buy_time = buy_time;
            }

            public String getPay_status() {
                return pay_status;
            }

            public void setPay_status(String pay_status) {
                this.pay_status = pay_status;
            }

            public String getSell_status() {
                return sell_status;
            }

            public void setSell_status(String sell_status) {
                this.sell_status = sell_status;
            }

            public String getGoods_price() {
                return goods_price;
            }

            public void setGoods_price(String goods_price) {
                this.goods_price = goods_price;
            }

            public String getOrder_id() {
                return order_id;
            }

            public void setOrder_id(String order_id) {
                this.order_id = order_id;
            }

            public String getFree_status() {
                return free_status;
            }

            public void setFree_status(String free_status) {
                this.free_status = free_status;
            }

            public String getTotal_amount() {
                return total_amount;
            }

            public void setTotal_amount(String total_amount) {
                this.total_amount = total_amount;
            }

            public String getPay_time() {
                return pay_time;
            }

            public void setPay_time(String pay_time) {
                this.pay_time = pay_time;
            }

            public String getOrder_status() {
                return order_status;
            }

            public void setOrder_status(String order_status) {
                this.order_status = order_status;
            }

            public String getOrder_pay_status() {
                return order_pay_status;
            }

            public void setOrder_pay_status(String order_pay_status) {
                this.order_pay_status = order_pay_status;
            }

            public String getCurr_id() {
                return curr_id;
            }

            public void setCurr_id(String curr_id) {
                this.curr_id = curr_id;
            }

            public Object getCurr_add_time() {
                return curr_add_time;
            }

            public void setCurr_add_time(Object curr_add_time) {
                this.curr_add_time = curr_add_time;
            }

            public String getGear_rate() {
                return gear_rate;
            }

            public void setGear_rate(String gear_rate) {
                this.gear_rate = gear_rate;
            }

            public String getGear_amount() {
                return gear_amount;
            }

            public void setGear_amount(String gear_amount) {
                this.gear_amount = gear_amount;
            }

            public String getIs_quick() {
                return is_quick;
            }

            public void setIs_quick(String is_quick) {
                this.is_quick = is_quick;
            }

            public String getFirst_quick_time() {
                return first_quick_time;
            }

            public void setFirst_quick_time(String first_quick_time) {
                this.first_quick_time = first_quick_time;
            }

            public String getRedis_rate() {
                return redis_rate;
            }

            public void setRedis_rate(String redis_rate) {
                this.redis_rate = redis_rate;
            }

            public String getRedis_amount() {
                return redis_amount;
            }

            public void setRedis_amount(String redis_amount) {
                this.redis_amount = redis_amount;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public int getLeft_amount() {
                return left_amount;
            }

            public void setLeft_amount(int left_amount) {
                this.left_amount = left_amount;
            }

            public DiscountBean getDiscount() {
                return discount;
            }

            public void setDiscount(DiscountBean discount) {
                this.discount = discount;
            }

            public List<OriginalImgBean> getOriginal_img() {
                return original_img;
            }

            public void setOriginal_img(List<OriginalImgBean> original_img) {
                this.original_img = original_img;
            }

            public static class DiscountBean {
                /**
                 * now_discount : 8.0
                 * left_days : 3
                 * left_discount : 7.0
                 */

                private String now_discount;
                private int left_days;
                private String left_discount;

                public String getNow_discount() {
                    return now_discount;
                }

                public void setNow_discount(String now_discount) {
                    this.now_discount = now_discount;
                }

                public int getLeft_days() {
                    return left_days;
                }

                public void setLeft_days(int left_days) {
                    this.left_days = left_days;
                }

                public String getLeft_discount() {
                    return left_discount;
                }

                public void setLeft_discount(String left_discount) {
                    this.left_discount = left_discount;
                }
            }

            public static class OriginalImgBean {
                /**
                 * imgurl : http://sevenshop.b0.upaiyun.com/Public/upload/goods/2017/08-07/5987e63c644bd.jpg
                 */

                private String imgurl;

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }
            }
        }
    }
}