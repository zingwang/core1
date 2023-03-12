package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.order.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 는 10%할인")
    void vip_o(){
        //given
        Long memberId= 1L;
        Member member= new Member(memberId,"memberA", Grade.VIP);

        //when
        int discount = discountPolicy.discount(member,10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }
    @Test
    @DisplayName("VIP가 아니면 할인이 되지 않는다")
    void vip_x(){
        //given
        Long memberId= 2L;
        Member member= new Member(memberId,"memberA", Grade.BASIC);

        //when
        int discount = discountPolicy.discount(member,10000);

        //then
        Assertions.assertThat(discount).isEqualTo(0);
    }

}