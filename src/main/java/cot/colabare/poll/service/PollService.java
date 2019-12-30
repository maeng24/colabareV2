package cot.colabare.poll.service;

import java.util.List;

import cot.colabare.poll.domain.PollAnswer;
import cot.colabare.poll.domain.PollAnswerUserVO;
import cot.colabare.poll.domain.PollAnswerVO;
import cot.colabare.poll.domain.PollDTO;
import cot.colabare.poll.domain.PollItemDTO;
import cot.colabare.poll.domain.PollJoiner;
import cot.colabare.poll.domain.PollListVO;
import cot.colabare.poll.domain.PollQuestionDTO;
import cot.colabare.poll.domain.PollVO;

public interface PollService {

	public void insertPollService(PollDTO poll);
	public void insertQuestionService(PollQuestionDTO question);
	public void insertItemService(PollItemDTO item);
	public void insertAnswerService(PollAnswer answer);
	public void insertJoinerService(PollJoiner joiner);
	
	public List<PollListVO> listPollService();
	
	public PollVO detailPollService(int pnum);
	public List<PollQuestionDTO> detailQuestionService(int pnum);
	public List<PollItemDTO> detailItemService(int qnum);
	public List<PollAnswerVO> detailAnswerService(PollAnswerUserVO pauv);
	
//	public PollDTO updatePoll(PollDTO poll);
//	public PollQuestion updateQuestion(PollQuestion question);
//	public PollItem updateItem(PollItem item);
	public void updateAnswerService(PollAnswer answer);
}
