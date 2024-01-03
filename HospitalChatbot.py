import random

class HospitalChatbot:
    def __init__(self):
        self.commands = {
            'help': self.help_command,
            'exit': self.exit_command,
        }

        self.responses = {
            'greeting': ["Hello!", "Hi there!", "Greetings!", "Welcome!"],
            'thanks': ["You're welcome!", "No problem!", "Happy to help!"],
            'services': ["We offer a range of medical services. What specific information are you looking for?",
                         "Our hospital provides various services. How can I assist you today?"],
            'appointment': ["To schedule an appointment, please contact our reception desk at 09454717223. Is there anything else you need?"],
            'default': ["I am a hospital chatbot. How can I assist you today?",
                        "Feel free to ask any questions about our hospital.",
                        "Need information about our services? Just ask!",
                        "You can use the 'help' command to see available options."]
        }

    def start(self):
        print("Welcome to the Hospital Chatbot!")

        while True:
            user_input = input("You: ").lower()
            self.process_input(user_input)

    def process_input(self, user_input):
        if user_input in self.commands:
            self.commands[user_input]()
        else:
            self.respond_conversation(user_input)

    def help_command(self):
        print("Available commands:")
        print("help - Show this help message")
        print("exit - Exit the chatbot")

    def exit_command(self):
        print("Goodbye!")
        exit()

    def respond_conversation(self, user_input):
        if 'hello' in user_input or 'hi' in user_input:
            response = random.choice(self.responses['greeting'])
        elif 'thank' in user_input:
            response = random.choice(self.responses['thanks'])
        elif 'services' in user_input or 'information' in user_input:
            response = random.choice(self.responses['services'])
        elif 'appointment' in user_input:
            response = random.choice(self.responses['appointment'])
        else:
            response = random.choice(self.responses['default'])

        print(f"Bot: {response}")

if __name__ == "__main__":
    hospital_chatbot = HospitalChatbot()
    hospital_chatbot.start()