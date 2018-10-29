package coding_181_200;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/**
 * 199번. 채팅 어플리케이션 만들기 (서버)
 *
 */
public class ChatServer {
	ServerSocket ss;
	Socket s;
	Vector v;
	
	public ChatServer() {
		v = new Vector(5,5);
		System.out.println("서버가 시작되었습니다.");
	}
	
	public void giveAndTake() {
		try {
			ss = new ServerSocket(5420);
			ss.getReuseAddress();
			while(true) {
				s = ss.accept();
				ServerSocketThread svrth = new ServerSocketThread(this, s);
				addClient(svrth);
				svrth.start();
			}
		} catch(Exception ee) { ee.printStackTrace(); }
	}
	
	public void addClient(Thread tr) {
		v.addElement(tr);
		System.out.println("Client 1명 입장, 총 " + v.size() + "명");
	}
	
	public void removeClient(Thread tr) {
		v.removeElement(tr);
		System.out.println("Client 1명 퇴장 총 " + v.size() + "명");
	}
	
	public void broadCasting(String sbc) {
		for(int i = 0; i < v.size(); i++) {
			ServerSocketThread svtr = (ServerSocketThread) v.elementAt(i);
			svtr.sendMessage(sbc);
		}
	}
}
