class Cipher:
    def __init__(self, prime=541, base=59):
        self.p = prime
        self.g = base
        self.public_keys = dict()  # this stores the public keys of the persons with respect
    # to this shared prime and base


class Person:
    def __init__(self, name, secret):
        self.secret = secret
        self.name = name
        self.shared_secret_key_wrt_person = dict()

    def compute_public_key(self, cipher):
        # public key depends only on cipher
        cipher.public_keys[self.name] = (cipher.g ** self.secret) % cipher.p

    def compute_secret_key(self, cipher, communicating_person):
        self.shared_secret_key_wrt_person[communicating_person.name] = (
            (cipher.public_keys[communicating_person.name]
             ** self.secret) % cipher.p
        )

