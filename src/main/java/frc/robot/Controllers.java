package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Controllers {

    public static WPI_TalonSRX LEFT_DRIVE1_T = new WPI_TalonSRX(16);
    public static WPI_VictorSPX LEFT_DRIVE2_V = new WPI_VictorSPX(15);
    public static WPI_VictorSPX LEFT_DRIVE3_V = new WPI_VictorSPX(14);

    public static WPI_TalonSRX RIGHT_DRIVE1_T = new WPI_TalonSRX(1);
    public static WPI_VictorSPX RIGHT_DRIVE2_V = new WPI_VictorSPX(2);
    public static WPI_VictorSPX RIGHT_DRIVE3_V = new WPI_VictorSPX(3);

    public static VictorSPX CLIMBER_V = new VictorSPX(4);
    
    public static TalonSRX ELEVATOR1_T = new TalonSRX(5);
    public static TalonSRX ELEVATOR2_T = new TalonSRX(12);

    public static TalonSRX INTAKETOP_V = new TalonSRX(6);
    public static TalonSRX INTAKEBOTTOM_V = new TalonSRX(7);
    public static TalonSRX INTAKEPIVOT_T = new TalonSRX(12);

    public static void init() {

    }
}