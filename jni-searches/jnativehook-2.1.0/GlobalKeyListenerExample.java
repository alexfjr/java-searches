import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class GlobalKeyListenerExample implements NativeKeyListener {
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.printf("Key Pressed: %s, code: %d\n",NativeKeyEvent.getKeyText(e.getKeyCode()),e.getKeyCode());

		if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
			try {
				GlobalScreen.unregisterNativeHook();
			} catch (NativeHookException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void nativeKeyReleased(NativeKeyEvent e) {
		System.out.printf("Key Released: %s, code: %d\n",NativeKeyEvent.getKeyText(e.getKeyCode()),e.getKeyCode());
	}

	public void nativeKeyTyped(NativeKeyEvent e) {
		System.out.printf("Key Typed: %s, code: %d\n",NativeKeyEvent.getKeyText(e.getKeyCode()),e.getKeyCode());
	}

	public static void main(String[] args) {
		try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		GlobalScreen.addNativeKeyListener(new GlobalKeyListenerExample());
	}
}