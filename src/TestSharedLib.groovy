/**
 * Test library to call from pipeline
 *
 * @author <a href="mailto:pskopek@redhat.com">Peter Skopek</a>
 */

void displayMessage(String message) {
  println message
}

displayMessage(args[0])