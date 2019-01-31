package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Controllers {

    public static WPI_TalonSRX LEFT_DRIVE1_T = new WPI_TalonSRX(16);
    public static WPI_VictorSPX LEFT_DRIVE2_V = new WPI_VictorSPX(14);
    public static WPI_VictorSPX LEFT_DRIVE3_V = new WPI_VictorSPX(15);

    public static WPI_TalonSRX RIGHT_DRIVE1_T = new WPI_TalonSRX(2);
    public static WPI_VictorSPX RIGHT_DRIVE2_V = new WPI_VictorSPX(2);
    public static WPI_VictorSPX RIGHT_DRIVE3_V = new WPI_VictorSPX(2);

    public static void init() {

    }
}