import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;

public class window extends JFrame implements MouseListener,ActionListener{

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JPanel panel_window;
	private JLabel center;
	public JTable table_thongtin;
	public JTable table_res;
	public JLabel label_image;
	ImageIcon map_hanoi;
	int check_findPath;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public window() {
		setDefaultCloseOperation(1);
		setBounds(100, 100, 1550, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(1253, 0, 283, 763);
		contentPane.add(panel);
		panel.setLayout(null);
		
		label_image = new JLabel(new ImageIcon(this.getClass().getResource("/world-38033_960_720.png")));
		
		label_image.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_image.setBounds(36, 10, 800,800);
		
		lblNewLabel_1 = new JLabel("Network Connection");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(36, 10, 231, 29);
		panel.add(lblNewLabel_1);
		
		JButton btn_connec = new JButton("Connective");
		btn_connec.setBackground(new Color(255, 0, 0));
		btn_connec.setForeground(new Color(255, 255, 255));
		btn_connec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_connec.setBounds(72, 77, 152, 36);
		btn_connec.addActionListener(this);
		btn_connec.setFocusable(false);
		
		panel.add(btn_connec);
		
		JButton btn_reset = new JButton("RESET");
		btn_reset.setForeground(Color.WHITE);
		btn_reset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_reset.setFocusable(false);
		btn_reset.setBackground(Color.RED);
		btn_reset.setBounds(72, 192, 152, 36);
		btn_reset.addActionListener(this);
		panel.add(btn_reset);
		
		JButton btn_find = new JButton("Find Path");
		btn_find.setForeground(Color.WHITE);
		btn_find.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_find.setFocusable(false);
		btn_find.setBackground(Color.RED);
		btn_find.setBounds(72, 310, 152, 36);
		btn_find.addActionListener(this);
		panel.add(btn_find);
		
		table_res = new JTable();
		table_res.getTableHeader().setFont(new Font("arial",Font.PLAIN,18));
		table_res.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
						"Edge","Weight"
				}
				));
		
		//JScrollPane scrollPane_res = new JScrollPane(table_res);
		//scrollPane_res.setBounds(0, 760, 283, -365);
		//panel.add(scrollPane_res);
		
		
		
		
		panel_window = new JPanel();
		panel_window.setBackground(new Color(255, 255, 255));
		panel_window.setBounds(0, 0, 857, 763);
		
		panel_window.addMouseListener(this);
		contentPane.add(panel_window);
		panel_window.add(label_image);
		panel_window.setLayout(null);
		
		center = new JLabel(".");
		center.setFont(new Font("Tahoma", Font.BOLD, 40));
		center.setForeground(new Color(255, 0, 0));
		center.setBounds(511, 364, 29, 26);
		
		panel_window.add(center);
		
		JPanel panel_res = new JPanel();
		panel_res.setBackground(new Color(255, 255, 153));
		panel_res.setBounds(856, 0, 398, 763);
		contentPane.add(panel_res);
		panel_res.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Specifications");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(138, 10, 160, 27);
		panel_res.add(lblNewLabel);
		
		table_thongtin = new JTable();
		table_thongtin.getTableHeader().setFont(new Font("arial",Font.PLAIN,18));
		table_thongtin.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
						"First Point","Last Point","Weight"
				}
				));
		
		
		JScrollPane scrollPane_1 = new JScrollPane(table_thongtin);
		scrollPane_1.setBounds(0, 37, 398, 351);
		panel_res.add(scrollPane_1);
		
		JScrollPane scrollPane_show_res = new JScrollPane(table_res);
		scrollPane_show_res.setBounds(0, 412, 398, 351);
		panel_res.add(scrollPane_show_res);
		
		
		
		//paintComponents(getGraphics());
		this.setVisible(true);
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int x = e.getX();
		int y = e.getY();
		
		model.cnt_point +=1;
		Point point = new Point(x,y,model.cnt_point);
	
		model.allPoint.add(point);
		this.addLable(x, y);
		this.addSign(x, y, model.cnt_point);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src == "Connective") {
			model.cnt_edge = 0;
			model.cnt_span = 0;
			
			this.connec(getGraphics());
			//this.quickSort(model.allEdge, 1, model.cnt_edge);
			System.out.print(model.cnt_edge);
			System.out.print(model.cnt_point);
			
		}
		else if(src == "RESET") {
			check_findPath = 0;
			panel_window.removeAll();
			panel_window.repaint();
			panel_window.revalidate();
			model.allPoint.clear();
			for(int i=1;i<=model.cnt_edge;i++) {
				this.setNull_edge(i);
			}
			model.cnt_edge = 0;
			model.cnt_point = 0;
			for(int i=1;i<=model.cnt_span;i++) {
				this.setNull_span(i);
			}
			model.cnt_span = 0;
			this.delete_table();
			this.delete_table_res();
			panel_window.add(center);
			panel_window.add(label_image);
		}
		else if(src == "Find Path") {
			if(check_findPath == 0) {
			this.quickSort(model.allEdge, 1, model.cnt_edge);
			this.kruskal();
			for(int i=1;i<=model.cnt_edge;i++) {
				this.add_row(model.allEdge[i]);
			}
			for(int i=1;i<=model.cnt_span;i++) {
				
				System.out.print(model.et[i].first_point.stt+" "+model.et[i].last_point.stt+"\n");
			}
			this.drawResult(getGraphics());
			for(int i=1;i<=model.cnt_span;i++) {
				this.add_row_res(model.et[i]);
			}
			check_findPath = 1;
		}
		}
	}
	
	public void addLable(int x, int y) {
		
		JLabel label = new JLabel(".");
		label.setLocation(x, y);
		label.setBounds(x,y,30, 30);
		label.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_window.add(label);
		panel_window.repaint();
		panel_window.revalidate();
		
	}
	public void addSign(int x, int y, int sign) {
		JLabel label = new JLabel(""+sign);
		label.setLocation(x-10, y);
		label.setBounds(x-15,y-10,30,30);
		label.setFont(new Font("Tahoma", Font.BOLD,20));
		panel_window.add(label);
		panel_window.repaint();
		panel_window.revalidate();
	}
	public void drawResult(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.red);
		for(int i=1;i<=model.cnt_span;i++) {
			g2d.drawLine(model.et[i].first_point.x+15, model.et[i].first_point.y+55, model.et[i].last_point.x+15,model.et[i].last_point.y+55);
		}
	}
	public void connec(Graphics g2) {
		Graphics2D g = (Graphics2D)g2;
		g.setStroke(new BasicStroke((float) 1.5));
		g.setFont(new Font("Arial", Font.BOLD, 24));
		g.setColor(Color.red);
		
		g.fillOval(center.getX()+5, center.getY()+45, 20, 20);g.setColor(Color.BLUE);
		model mana = new model();
		
		int p1 = 0;
		int p2;
		for(Point point1: model.allPoint) {
			p1 = p1+1;
			p2 = 0;
			for(Point point2: model.allPoint) {
				p2 = p2 +1;
				if(p1!=p2&&p1<p2) {
					
					g.drawLine(point1.x+15, point1.y+55, point2.x+15, point2.y+55);
					model.cnt_edge +=1;
					model.allEdge[model.cnt_edge] = new Edge();
					model.allEdge[model.cnt_edge].first_point = point1;
					model.allEdge[model.cnt_edge].last_point = point2;
					model.allEdge[model.cnt_edge].w = (int) Math.sqrt(Math.pow(point1.x-point2.x,2)+Math.pow(point1.y-point2.y,2));
				}
			}
		}
		Point cen =new Point(center.getX(),center.getY(),++model.cnt_point);
		for(Point point: model.allPoint) {
			g.drawLine(point.x+15, point.y+55, center.getX()+15, center.getY()+55);
			model.cnt_edge +=1;
			model.allEdge[model.cnt_edge] = new Edge();
			model.allEdge[model.cnt_edge].first_point = point;
			model.allEdge[model.cnt_edge].last_point = cen;
			model.allEdge[model.cnt_edge].w = (int) Math.sqrt(Math.pow(point.x-cen.x,2)+Math.pow(point.y-cen.y,2));
		}
	}
	public void setNull_edge(int i) {
		model.allEdge[i].first_point = null;
		model.allEdge[i].last_point = null;
		model.allEdge[i].w = 0;
	}
	public void setNull_span(int i) {
		model.et[i].first_point = null;
		model.et[i].last_point = null;
		model.et[i].w = 0;
	}

	public int partition(Edge[]arr,int l,int index) {
		int pivot = arr[index].w;
		int k = l;
		for(int i=l;i<index;i++) {
			if(arr[i].w<pivot) {
				Edge t = arr[k];
				arr[k] = arr[i];
				arr[i] = t;
				k = k+1;
			}
		}
		Edge t = arr[index];
		arr[index] = arr[k];
		arr[k] = t;
		return k;
	}
	public void quickSort(Edge[] arr, int l, int r) {
		if(l<r) {
			int index = r;
			index = partition(arr,l,index);
			if(index>l) {
				quickSort(arr,l,index-1);
			}
			if(index<r) {
				quickSort(arr,index+1,r);
			}
		}
	}
	public void makeSet() {
		for(int v=1;v<=model.cnt_point;v++) {
			model.p[v] = v;
			model.r[v] = 1;
		}
	}
	public int findSet(int x) {
		if(x!=model.p[x]) {
			model.p[x] = findSet(model.p[x]);
		}
		return model.p[x];
	}
	public void unify(int r1, int r2) {
		if(model.r[r1]>model.r[r2]) {
			model.p[r2] = r1;
		}
		else {
			model.p[r1] = r2;
			if(model.r[r1]==model.r[r2]) {
				model.r[r2]+=1;
			}
		}
	}
	public void kruskal() {
		this.makeSet();
		for(int i=1;i<=model.cnt_edge;i++) {
			Point point1 = model.allEdge[i].first_point;
			Point point2 = model.allEdge[i].last_point;
			int r1 = findSet(point1.stt);
			int r2 = findSet(point2.stt);
			if(r1!=r2) {
				model.cnt_span++;
				model.et[model.cnt_span]= new Edge();
				model.et[model.cnt_span] = model.allEdge[i];
				
				unify(r1, r2);
				if(model.cnt_span == model.cnt_point-1) {
					break;
				}
			}
		}
	}
	public void add_row(Edge edge) {
		DefaultTableModel model_table = (DefaultTableModel) table_thongtin.getModel();
		model_table.addRow(new Object[] {edge.first_point.stt+"",edge.last_point.stt+"",edge.w+""});
	}
	public void delete_table() {
		DefaultTableModel model_table = (DefaultTableModel) table_thongtin.getModel();
		model_table.setRowCount(0);
	}
	public void add_row_res(Edge edge) {
		DefaultTableModel model_table = (DefaultTableModel) table_res.getModel();
		model_table.addRow(new Object[] {edge.first_point.stt+" "+edge.last_point.stt+"",edge.w+""});
	}
	public void delete_table_res() {
		DefaultTableModel model_table = (DefaultTableModel) table_res.getModel();
		model_table.setRowCount(0);
	}
}
