package com.ezen.springboard.service.board;

import java.util.List;

import com.ezen.springboard.vo.BoardVO;

public interface BoardService {
	//게시글 등록
	void insertBoard(BoardVO boardVO);
	
	//게시글 목록 조회
	List<BoardVO> getBoardList();
	
	//게시글 상세 조회
	BoardVO getBoard(int boardNo);
	
	//조회수 증가
	void updateBoardCnt(int boardNo);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
