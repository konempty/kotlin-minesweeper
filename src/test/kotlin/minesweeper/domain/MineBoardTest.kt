package minesweeper.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MineBoardTest : StringSpec({
    "지뢰 보드 생성 시 지뢰 개수를 10개로 설정하면 10개가 생성 됨을 확인한다." {
        //given
        val mineBoard = MineBoard.createBoard(5, 5, 10)
        //when
        val mineCount = mineBoard.snapshot().sumOf {
            it.filter { cell -> cell.state == "*" }.size
        }
        //then
        mineCount shouldBe 10
    }

})
